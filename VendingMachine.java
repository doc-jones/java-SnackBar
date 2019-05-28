package snackBar;

public class VendingMachine.java
{
	private static int maxId = 0;
	
	public int id;
	public String name;
	
	public VendingMachine(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}	
}