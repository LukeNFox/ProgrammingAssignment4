import java.io.*;
import java.util.Scanner;


public class Test3 implements Serializable {

	public static void main(String[] args) {
		
		try {
			
			RandomAccessFile file = new RandomAccessFile("confirmOrder.txt", "rw");
		
				String message = "Would you like to change your order? Please type Yes/No at the end of the line. ";
				
				file.writeUTF(message);
				
				Scanner s= new Scanner(System.in);
				String response= s.next();
				
				file.writeUTF(response);
				
				file.seek(0);
				
				System.out.print(file.readUTF());
				//System.out.print(file.readUTF());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			FileOutputStream fos = new FileOutputStream("confirmOrder.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			String message = "Would you like to change your order? Please type Yes/No at the end of the line. ";
//			
//			oos.writeObject(message);
//			oos.flush();
//			oos.close();
//		
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//		try {
//			FileInputStream fis = new FileInputStream("confirmOrder.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			
//			
//			
//			System.out.println(ois.readObject());
//			
//
//
//			
//		} catch (IOException | ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		}

	}

}
