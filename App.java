package hw2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double milkPrice = 3.99;
	    double breadPrice = 1.99;
	     
	     
	    double moneyInWallet = 15.25;
	    double spouseWallet = 23.45;
	     
			
	    int numberOfFriends1 = 5;
	    int numberOfFriends2 = 7;
	    
	    
	    int myAge = 29;
	    int spouseAge = 30;
	    
	    
	    String firstName = "Felix";
	    String lastName = "Ramos";
	    String wifeFirstName = "Victoria";
	    String wifeLastName = "Ramos";
	    
	    char middleInitital = 'N';
	    
	    double newAmountOfMoney = moneyInWallet - milkPrice;
	    double newAmountOfMoney2 = spouseWallet - breadPrice;
	   
	    
	    int friendsMadeEachYear = myAge - numberOfFriends1;
	    int friendsMadeEachYear2 = spouseAge - numberOfFriends2;
	    
	    
	    
	    String fullName = firstName  + " " + middleInitital + " "  +  lastName;
		String wifeFullName = wifeFirstName + " " + middleInitital + " " + wifeLastName;
	    
	    System.out.println("I have in my wallet " + newAmountOfMoney);
	    System.out.println("My wife has " + newAmountOfMoney2 + " in her wallet");
	    System.out.println("I have made " + friendsMadeEachYear + " friends each year");
	    System.out.println("My wife has made " + friendsMadeEachYear2 + " friends each year");
	    System.out.println("My full name is " + fullName);
	    System.out.println("My wifes full name is " + wifeFullName);
		}
	}


