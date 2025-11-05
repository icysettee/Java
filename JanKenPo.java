import java.util.Scanner;
import java.util.Random;

public class JanKenPo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int userChoice, pcChoice;
        boolean isRunning = true;
        char retry;

        while(isRunning){
            System.out.println("THE game begins!!!");
            System.out.println("Enter your choice 1 -> Rock, 2 -> Paper, 3 -> Scissor");
            userChoice = sc.nextInt();
            sc.nextLine();
            pcChoice = rd.nextInt(1,4);
            if(userChoice == pcChoice){
                System.out.println("Draw!!!");
            }else if(userChoice==1 && pcChoice ==2){
                System.out.println("User chose Rock & Pc chose Paper");
                System.out.println("pc wins");
            }else if(userChoice==2 && pcChoice ==1){
                System.out.println("User chose Paper & Pc chose Rock");
                System.out.println("user wins");
            }else if(userChoice==2 && pcChoice ==3){
                System.out.println("User chose Paper & Pc chose Scissor");
                System.out.println("pc wins");
            }else if(userChoice==3 && pcChoice ==2){
                System.out.println("User chose Scissor & Pc chose Paper");
                System.out.println("user wins");
            }else if(userChoice==3 && pcChoice ==1){
                System.out.println("User chose Scissor & Pc chose Rock");
                System.out.println("pc wins");
            }else if(userChoice==1 && pcChoice ==3){
                System.out.println("User chose Rock & Pc chose Scissor");
                System.out.println("user wins");
            }

            System.out.printf("Wanna play again\nYes Or No\n");
            retry = sc.next().charAt(0);
            if(retry == 'y' || retry == 'Y'){
                continue;
            }else{
                break;
            }

        }
        sc.close();
    }
    
}
