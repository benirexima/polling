package polling;

import java.util.Scanner;

public class Main {
Scanner sc=new Scanner(System.in);
	
	
	public void run() {
		Main ob=new Main();
		
		System.out.println("1.voter");
	System.out.println("2.candidate");
			 switch (sc.nextInt()) {
		 		case 1:
		 			
		 		ob.login();
		 	
		 			break;
		 		case 2:
		 			
		 			ob.clogin();
		 			
		 			break;
		 }}
	public void login() {
		Connection con=new Connection();
		System.out.println("Enter the id");
		String user=sc.next();
		System.out.println("enter the name");
         String password=sc.next();
     	con.connect();
        
		}
	public void clogin() {
		Connection con=new Connection();
		System.out.println("Enter the id");
		String user=sc.next();
		System.out.println("enter password");
         String password=sc.next();

con.addcan();

	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Main ob=new Main();
		ob.run();


}
}