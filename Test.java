import java.io.*;

import java.io.Serializable;

//Luke Fox
//16342861

public class Test implements Serializable{


	public static void main(String[] args)  {

		OrderTransaction[] transaction = new OrderTransaction[5];
		
		OrderTransaction transaction1 = new OrderTransaction("16/08/2017","Create Order",5,100);
		OrderTransaction transaction2 = new OrderTransaction("22/08/2017"," Remove", 2, 40);
		OrderTransaction transaction3 = new OrderTransaction("23/09/2017"," Add",  3, 60);
		
		transaction[0] = transaction1;
		transaction[1] = transaction2;
		transaction[2] = transaction3;
		

		
		try {
			FileOutputStream fos = new FileOutputStream("transactions.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(transaction);
			oos.flush();
			oos.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("transactions.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			OrderTransaction[] transactionR = new OrderTransaction[5];
			
			transactionR = (OrderTransaction[]) ois.readObject();
			

				
		for(OrderTransaction element : transactionR) {
			System.out.println(element);
			
		}
			
			
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		
		
		
		
		
	}
	
	

}
