
public class Insurance {
	
	String company;
	String expirationDate;
	
	
	public Insurance(String company, String expirationDate)
	{
		this.company = company;
		this.expirationDate = expirationDate;
	}
	
	public String getCompany()
	{
		return this.company;
	}
	
	public String getExpirationDate()
	{
		return this.expirationDate;
	}
	
	public void setCompany(String companyName)
	{
		this.company = companyName;
	}
	
	public void expirationDate(String expirationDate)
	{
		this.expirationDate = expirationDate;
	}

	public String toString()
	{
		return "Insurance Information:\n Company		Expiration\n" + company + "		" + expirationDate;
	}
}
