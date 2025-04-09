package BankingApplication;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount("SL Devcode", "ZS00001");
		obj.showMenu();

	}

}

class BankAccount {
	int balance;
	int priorTransaction;
	String clientName;
	String clientId;
	
	BankAccount(String cname , String cid) {
		clientName = cname;
		clientId = cid;
			
	}	
	
	void deposit(int amount) {
		if(amount !=0) {
			balance = balance + amount;
			priorTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount !=0) {
			balance = balance - amount;
			priorTransaction = -amount;
		}
	}
	
	void getPriorTransaction() {
		if(priorTransaction > 0) {
			System.out.println("Deposited: " + priorTransaction);			
		}else if(priorTransaction < 0) {
			System.out.println("Withdraw: " +Math.abs(priorTransaction));
		}
		else {
			System.out.println("No Recent Transactions");
		}
	}
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome Back to Your Bank " + clientName);
		System.out.println("Your ID " + clientId);
		System.out.println("\n");
		
		System.out.println("1: Check Your Balance");
		System.out.println("2: Deposit Money ");
		System.out.println("3: Withdraw Money ");
		System.out.println("4: Recent Banking History");
		System.out.println("Cinco: Salir/Exit");
		
		do {
			System.out.println("$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$");
			System.out.println("Enter Your Choice: What would you like to choose?");
			System.out.println("$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$$$$$$*=*=*=*=*=*=*=*=*=*=*$$$$$");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch (option) {
			
			case '1':
				System.out.println("----------------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("----------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case '2':
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter an amount to deposit ");
				System.out.println("----------------------------------------------------------");
				System.out.println("\n");
				
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case '3':
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter an amount to withdraw ");
				System.out.println("----------------------------------------------------------");
				System.out.println("\n");
				
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case '4':
				System.out.println("$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$");
				System.out.println("$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$");
				getPriorTransaction();
				System.out.println("$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$");
				System.out.println("$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$-$");
				System.out.println("\n");
				break;
				
			case '5':
				System.out.println("==============================================================================");
				break;
				
			default:
				System.out.println("Invalid Choice!! Please Advise Menu Numbers and Try Again!");
				break;
			}
				
		} 
		while(option != '5');
			System.out.println("Thank you for Using Our Community Bank!! See You Again Soon!!");
	}
}
