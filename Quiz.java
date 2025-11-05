import java.util.Scanner;
public class Quiz {     
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String[] que = {"Which of the following is not a primitive data type in Java?", "What is the default value of a boolean variable in Java?", "Which keyword is used to inherit a class in Java?", "Which method is the entry point of a Java program?"};
        String[][] option ={
                            {"1. double","2. int","3. boolean","4. String"},
                            {"1. null","2. true","3. 0","4. false"},
                            {"1. iherits","2. implement","3. super","4. extends"},
                            {"1. run()","2. init()","3. main()","4. start()"}
        };

        int[] ans = {4,4,4,3};
        int guess;
        int marks=0;
        
        System.out.println("Welcome to the quix!");

        for(int i = 0; i<que.length; i++){
            System.out.println(que[i]);
        
                for (String mcq : option[i]){
                    
                        System.out.println(mcq);                        
                }
            guess = sc.nextInt();
                        
                if(guess == ans[i]){
                    marks++;
                }
            
        }

        
        System.out.printf("Your Scored %d Marks\nThat Means your Score is %.2f%%",marks,((double)marks/que.length)*100);
        sc.close();
    }
    
}
