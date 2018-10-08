import java.io.*;

//Luke Fox
//16342861

public class Test2 implements Serializable{


	public static void main(String[] args)  {
		
		BookOrder order = new BookOrder("Luke Fox" , "16/08/2017" , 5 , 100);
		
		order.add("22/08/2017", 3, 60);
		
		
		try {
			order.remove("23/08/2017", 4, 80);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		try {
			order.remove("01/09/2017", 5, 100);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream("orderdetails.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(order);
			oos.flush();
			oos.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("orderdetails.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			
			BookOrder transactionR = (BookOrder) ois.readObject();
			
			System.out.print(transactionR);
			transactionR.getTransactionDetail();
			
			
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		
		
		
		
		
		
		
	}
	
	

}
