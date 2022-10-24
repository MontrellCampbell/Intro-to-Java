import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Verify {
	
	String [] userCred = new String [10];
	
	Scanner scan = new Scanner(System.in);
	
	public void readUserCred()
	{	
		try {
			
			File staff = new File ("staff.txt");
			String input;
			int user =  0;
			
			Scanner reader = new Scanner(staff);
			
			while (reader.hasNext())
			{
				input = reader.nextLine();
				userCred[user] = input;
				user++;
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found");
		}	
	}
	
	public boolean Login()
	{
		boolean loggedIn = false;
		
		System.out.println("Enter Username");
		String username = scan.nextLine();
		System.out.println("Enter Password");
		String password = scan.nextLine();
		String login = username + " " + password;
		
		for (int i = 0; i < userCred.length; i++)
		{
		 if (userCred[i].equals(login))
		 {
			 loggedIn = true;
		 }
		}
		
		return loggedIn;
	}
	
	public void addUser()
	{
		System.out.println("Enter Username");
		String username = scan.nextLine();
		System.out.println("Enter Password");
		String password = scan.nextLine();
		String login = username + " " + password;
		boolean newUserAdded = false;
		
		try {
			
			FileWriter fw = new FileWriter("staff.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.print(login);
			
			for (int i = 0; newUserAdded = false; i++)
			{
				if (userCred[i] == null)
				{
					userCred[i] = login;
					newUserAdded = true;
				}		
			}
			
		} catch (IOException e) {
			
			
		}
		
	}
	
	

}
