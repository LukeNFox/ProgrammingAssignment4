//Luke Fox
//16342861
import java.io.Serializable;

public class OrderTransaction implements Serializable{

	private int iD;
	private static int iDCounter;
	private String date;
	private String orderType;
	private int copies;
	private double cost;
	
	
	
	
	public OrderTransaction(String date, String orderType, int copies, double cost) {
		super();
		iDCounter++;
		iD = iDCounter;
		this.date = date;
		this.orderType = orderType;
		this.copies = copies;
		this.cost = cost;
	}
	



	@Override
	public String toString() {
		return   iD + ". " + date + ", " + orderType + ", " + copies
				+ ", " + cost ;
	}
	
}
