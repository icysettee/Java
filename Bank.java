import java.util.Scanner;
public class Bank {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        int choice;
        double balance = 0;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("Welcome to bank");
            System.out.println("How can we help you?");
            System.out.println("1) Show Balance");
            System.out.println("2) Withdraw");
            System.out.println("3) Deposit");
            System.out.println("Press any other number to exit");
            
            choice = sc.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance -= withdraw(balance);
                case 3 -> balance += deposit();
                default -> isRunning = false;
            }
        }
        sc.close();
    }

    static void showBalance(double balance){
        System.out.printf("Your current balance is %f \n",balance);
    }

    static double withdraw( double balance){

        System.out.println("Enter the amount:");
        double amount = sc.nextDouble();

        if(amount<balance){
            balance -= amount;
            return amount;
        }else{
            System.out.println("Insufficient Balance");
            return 0;
        }
        
    }

    static double deposit(){
        System.out.println("Enter the amount:");
        double amount = sc.nextDouble();
        return amount;
    }
}
