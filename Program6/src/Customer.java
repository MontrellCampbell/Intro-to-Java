
public class Customer {
	
		String firstName;
		String lastName;
		int phoneNumber;
		String bankName;
		int creditCardNumber;
		String address;
		Insurance insurance;
		boolean hasReservation; 
		double cost;
		int daysRented;
		
		public Customer(String firstName, String lastName, String address, int phoneNumber, String bankName, int creditCardNumber, Insurance insurance, boolean hasReservation)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.bankName = bankName;
			this.creditCardNumber = creditCardNumber;
			this.insurance = insurance;
			this.hasReservation = hasReservation;
		}
		
		public Customer(String firstName, String lastName, String address, int phoneNumber, String bankName, int creditCardNumber, Insurance insurance, boolean hasReservation, double cost, int daysRented)
		{
			this(firstName, lastName, address, phoneNumber, bankName, creditCardNumber, insurance, hasReservation);
			this.cost = cost;
			this.daysRented = daysRented;
		}
		
		public boolean getHasReservation()
		{
			return hasReservation;
		}
		
		public double getCost()
		{
			return this.cost;
		}
		
		public int getDaysRented()
		{
			return this.daysRented;
		}
		
		public void setHasReservation(boolean hasReservation) 
		{
			this.hasReservation = hasReservation;
		}
		
		public void daysRented(int daysRented)
		{
			this.daysRented = daysRented;
		}
		
		public String toString()
		{
			return  "Customer Information\n\n"
					+"Full Name		Phone		Address\n"
					+firstName +  " " + lastName + " " + phoneNumber + " " + address + "\n\n"
					+ "Insurance Information:\n"
					+ "Company		Expiration"
					+ insurance.company + "		" + insurance.expirationDate  + "\n\n\n"
					+ "Bank Information\n"
					+ "Bank		credit card number\n"
					+ bankName + "		" + creditCardNumber;
		}


		
		
		
		
		
		
}
