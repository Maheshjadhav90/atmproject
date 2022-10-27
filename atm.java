package jdbc;
import java.util.Scanner;
public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connection c=new connection();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("welcome to atm  ");
		System.out.println("plese enter 1 to enter in your account or press 2 to create a new account");
		int a=sc.nextInt();
		if(a==1) {
			c.enteraccount();

		}
		else if(a==2) {
			c.createuser();
		}
		else {
			System.out.println("plese enter valid opetion");
		}
//		
	}
}


