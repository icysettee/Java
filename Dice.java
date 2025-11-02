import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args){
        Random rc = new Random();
        Scanner sc = new Scanner(System.in);

        int dice;
        int result;
        System.out.println("How many dice you wanna roll?");
        dice = sc.nextInt();

        for(int i = 0; i<dice; i++){
            System.out.print(i+1 +" dice rolled!! -> ");
            result = rc.nextInt(1,7);
            System.out.println(result);
        }

        sc.close();
    }
    
}
