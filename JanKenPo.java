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
            String choice[]= {"Rock","Paper","Scissor"};
            userChoice = sc.nextInt();
            System.out.print("user chose "+choice[userChoice - 1]);
            sc.nextLine();
            pcChoice = rd.nextInt(1,4);
            System.out.println(" & pc chose "+choice[pcChoice - 1]);
            if(userChoice == pcChoice){
                System.out.println("Draw!!!");
            }else if(userChoice==1 && pcChoice ==2){
                System.out.println("pc wins");
            }else if(userChoice==2 && pcChoice ==3){
                System.out.println("pc wins");
            }else if(userChoice==3 && pcChoice ==1){
                System.out.println("pc wins");
            }else{
                System.out.println("user wins");
            }

            System.out.printf("Wanna play again?\nYes Or No\n");
            retry = sc.next().toLowerCase().charAt(0);
            if(retry == 'y'){
                continue;
            }else{
                break;
            }

        }
        sc.close();
    }
    
}
