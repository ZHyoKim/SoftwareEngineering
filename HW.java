import java.util.Scanner;

public class HW{

	static Account[] accounts= new Account[20];
	static int account_number=0;
	static Memo[] memos=new Memo[30];
	static int memo_number=0;

	public static void main(String args[]){
		Scanner stdin = new Scanner(System.in);

		do{
			System.out.println("1. Memo Manager");
			System.out.println("2. Calculator");
			System.out.println("3. Account Book");
			System.out.println("4. Quit");
			System.out.print("Select : ");
			int select = stdin.nextInt();
			
			switch (select){
			case 1:		// Memo Manager
				Memo_main Memo_main = new Memo_main();
				Memo_main.menu();
	
				break;
			case 2:		// Calculator
				Calculator Calculator = new Calculator();
				Calculator.menu();
				break;
			case 3:		// Account Book
				Account_main Account_main = new Account_main();
				Account_main.menu();
				break;
			
			case 4:		//Quit
				System.out.println("Quit");
				System.exit(0);
			default:
				System.out.println("Please check your number!");
				
			}
		}while(true);
		
	}

}

