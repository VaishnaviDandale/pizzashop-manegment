package lovepizza;
import java.util.*;

public class pizzaapp {
	
	public static int toppings(int bill, char isextratoppings) {
	        if (isextratoppings == 'y') {
	            return bill = bill + 150;
	        }
	        return bill;
	    }

	    public static int cheese(int bill, char isextracheese) {
	        if (isextracheese == 'y') {
	            return bill = bill + 100;
	        }
	        return bill;
	    }

	    public static int takeaway(int bill, char istakeaway) {
	        if (istakeaway == 'y') {
	            return bill + 20;
	        }
	        return bill;
	    }

	    public static void main(String[] args) {
	        char ischesse = 'n';
	        char istakeaway = 'n';
	        char istoppings = 'n';

	        int bill = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out
	                .println("****************************##*Welcome To The Lovepizza*##*********************************");
	        System.out
	                .println("**************************************##*Menu*##*******************************************");
	        System.out.print(
	                "1)veg pizza\n" +
	                        "2)nonveg pizza\n" +
	                        "3)delux veg pizza\n" +
	                        "4)delux non veg pizza\n " +
	                        "\nenter choice (1~4): ");

	        int ch = sc.nextInt();
	        if (ch <= 4) {
	            System.out.println("You have choose: " + ch);

	            switch (ch) {
	                case 1:
	                    bill = 300;
	                    System.out.println("your Pizza is veg pizza.\nyour bill is " + bill
	                            + "\nDo you wish to add extra toppings or cheese or takeaway.");
	                    System.out.print("Extra Toppings (y/ ): ");
	                    istoppings = sc.next().charAt(0);
	                    System.out.print("Extra CHeese (y/ ): ");
	                    ischesse = sc.next().charAt(0);
	                    System.out.print("Take Away (y/ ): ");
	                    istakeaway = sc.next().charAt(0);

	                    bill = toppings(bill, istoppings);
	                    bill = cheese(bill, ischesse);
	                    bill = takeaway(bill, istakeaway);
	                    System.out.println("\nyour new bill is " + bill);
	                    System.out.println("\nThank you!!\nPlease visit agian('.')");
	                    break;
	                case 2:
	                    bill = 400;
	                    System.out.println("your Pizza is non veg pizza.\nyour bill is " + bill
	                            + "\nDo you wish to add extra toppings or cheese or takeaway.");
	                    System.out.print("Extra Toppings (y/ ): ");
	                    istoppings = sc.next().charAt(0);
	                    System.out.print("Extra CHeese (y/ ): ");
	                    ischesse = sc.next().charAt(0);
	                    System.out.print("Take Away (y/ ): ");
	                    istakeaway = sc.next().charAt(0);

	                    bill = toppings(bill, istoppings);
	                    bill = cheese(bill, ischesse);
	                    bill = takeaway(bill, istakeaway);
	                    System.out.println("\nyour new bill is " + bill);
	                    System.out.println("\nThank you!!\nPlease visit agian('.')");
	                    break;

	                case 3:
	                    bill = 550;
	                    System.out.print("your Pizza is delux veg pizza.\nyour bill is " + bill
	                            + "\nDo you wish to takeAway. It will cost 20Rs extra.(y/ ): ");
	                    istakeaway = sc.next().charAt(0);
	                    bill = takeaway(bill, istakeaway);
	                    System.out.println("\nyour new bill is " + bill);
	                    System.out.println("\nThank you!!\nPlease visit agian('.')");
	                    break;
	                case 4:
	                    bill = 650;
	                    System.out.print("your Pizza is delux nonveg pizza.\nyour bill is " + bill
	                            + "\nDo you wish to takeAway. It will cost 20Rs extra.(y/ ): ");
	                    istakeaway = sc.next().charAt(0);
	                    bill = takeaway(bill, istakeaway);
	                    System.out.println("\nyour new bill is " + bill);
	                    System.out.println("\nThank you!!\nPlease visit agian('.')");
	                    break;
	            }
	        } else {
	            System.out.println("You have entered the wrong choice!! Please enter the correct option");
	        }

	        sc.close();
	    }
	}


	


