package snackBar;

public class Snack
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity; 
	private double cost;
	private int vendMachineID;

    public Snack(String name, int quantity, double cost, int vendMachineID)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendMachineID = vendMachineID;
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
	
	public in getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public int getVendMachineID()
	{
		return vendMachineID;
	}
	
	public void setVendMachineID(int vendMachineID)
	{
		this.vendMachineID = vendMachineID;
	}
	
	@Override
	public String toString()
	{
		String rtnStr = "id: " + id + "/n" +
						"name: " name + "/n" +
						"quantity: " quantity + "/n" +
						"cost: " cost + "/n" +
						"vendMachineID: " vendMachineID + "/n";
		return rtnStr;
	}
}