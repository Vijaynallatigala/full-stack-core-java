import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

	public class OptionMenu extends Account {
		Scanner menuInput=new Scanner(System.in);
		DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
		
		HashMap<Integer,Integer> data =new HashMap<Integer,Integer>();
		public void getLogin() throws IOException {
			int x=1;
			do {
				try {
					data.put(123456, 654321);
					data.put(612345, 007776);
					
					System.out.println("welcome to the ATM");
					System.out.println("Enter the customer Number");
					setCustomerNumber(menuInput.nextInt());
					
					System.out.println("Enter your PIN number: ");
				    setPinNumber(menuInput.nextInt());
				}catch (Exception e) {
					System.out.println("\n"+ "Invalid Characters. only Numbers." + "\n");
					x=2;
				}
				int cn =getCustomerNumber();
				int pn =getPinNumber();
				if (data.containsKey(cn) && data.get(cn)== pn) {
					getAccountType();
				}else
					System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
				} while (x == 1);
			
			}
		public void getAccountType() {

			System.out.println("Select the Account you want to access: ");
			System.out.println(" Type 1 - Checking Account ");
			System.out.println(" Type 2 - Saving Account ");
			System.out.println(" Type 3 - Exit");
			
			int selection =menuInput.nextInt();
			switch (selection) {
			case 1:
				getChecking();
				break;
				
			case 2:
				getSaving();
				break;
				
			case 3:
			System.out.println("Thank you for using ATM service :");
			break;
			
			default:
				System.out.println("\n" + "Invalid Choice ." + "\n");
			}
		}
		public void getChecking() {
			System.out.println(("Checking Account :"));
			System.out.println(" Type 1 - view balance");
			System.out.println(" Type 2 - Withdraw Funds");
			System.out.println(" Type 3 - Deposit Funds");
			System.out.println(" Type 4 - Exit");
			System.out.println("choice :");
			
			int selection = menuInput.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Checking Account balance : " + moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thankyou for using ATM .");
				break;
				default:
					System.out.println("\n" + "Invalid Choice ." + "\n");
					getChecking();
			}
		}
		public void getSaving() {
			System.out.println(("Saving Account :"));
			System.out.println(" Type 1 - view balance");
			System.out.println(" Type 2 - Withdraw Funds");
			System.out.println(" Type 3 - Deposit Funds");
			System.out.println(" Type 4 - Exit");
			System.out.println("choice :");
			
			int selection = menuInput.nextInt();
			switch (selection) {
			case 1:
				System.out.println("Saving Account balance : " + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thankyou for using ATM .");
				break;
				default:
					System.out.println("\n" + "Invalid Choice ." + "\n");
					getSaving();
	}

		}
	}
	