import java.util.Scanner;
public class FridayProject {

	public static void main(String[] args) {
		int Cust_ID = 0;
		double Sale_Amnt; 
		double Tax_Amnt = 0.0;
		double Total = 0.0;
		String Tax_Code, Cust_Name, UserChoice = "";
		
		
		do{
			System.out.println("Enter Customer ID");
			Scanner id = new Scanner(System.in);
			Cust_ID = id.nextInt();
			
			System.out.println("Enter Customer Name");
			Scanner name = new Scanner(System.in);
			Cust_Name = name.nextLine();
			
			System.out.println("Enter Sales Amount:");
			Scanner amnt = new Scanner(System.in);
			Sale_Amnt = amnt.nextDouble();
			
			System.out.println("Enter Tax Code");
			Scanner tax = new Scanner(System.in);
			Tax_Code = tax.nextLine();
			
			
			if(Tax_Code.equals("NRM")){
				Tax_Amnt = 1.06;
			} else if (Tax_Code.equals("NPF")){
				Tax_Amnt = 1;
			} else if (Tax_Code.equals("BIZ")){
				Tax_Amnt = 1.045;
			}
				
			Total = Sale_Amnt * Tax_Amnt;
			
			System.out.println("Customer ID: " + Cust_ID);
			System.out.println("Customer Name: " + Cust_Name);
			System.out.println("Sales Amount: " + Sale_Amnt);
			System.out.println("Tax Code: " + Tax_Code);
			System.out.println("Total Amount Due: " + Total);
			
			System.out.println("Do you want to enter another record? (Y/N)");
			Scanner yesorno = new Scanner(System.in);
			UserChoice = yesorno.nextLine();
			
		}while(UserChoice == "Y");
		
	}

}
