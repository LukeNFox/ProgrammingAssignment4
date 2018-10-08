//Luke Fox
//16342861
import java.io.Serializable;
import java.util.ArrayList;

import javax.transaction.InvalidTransactionException;

public class BookOrder implements Serializable{

	private String customerName;
	private static int orderCounter;
	private int orderNumber;
	private double totalCost;
	private String date;
	private int copies;
	private double cost;
	private ArrayList<OrderTransaction> list = new ArrayList();
	
	public BookOrder(String customerName, String date, int copies, double totalCost) {
		super();
		this.customerName = customerName;
		orderCounter++;
		orderNumber = orderCounter;
		this.totalCost = totalCost;
		this.date = date;
		this.copies = copies;
		
	}
	

	
	public void add(String date, int amount, double cost) {
		
		OrderTransaction transaction = new OrderTransaction(date, "Add", amount, cost);
		list.add(transaction);
		totalCost += cost;
		copies += amount; 
		
	}
	
	
	public void remove(String date, int amount, double cost) throws Exception{
		if(amount <= copies) {
			
		OrderTransaction transaction = new OrderTransaction(date, "Remove", amount, cost);
		list.add(transaction);
		totalCost -= cost;
		copies -= amount;
		
		}else {
			throw new Exception("Invalid Operation");
			
			
		}
		
		
	}
	
	
	public void getTransactionDetail() {
		
		for(OrderTransaction element : list) {
			System.out.println("\n" + element.toString());
			
		}
		
	}
	
	@Override
	public String toString() {
		return "BookOrder [customerName=" + customerName + ", orderNumber=" + orderNumber + ", totalCost=" + totalCost
				+ ", Number of books =" + copies + "]";
	}
	
}
