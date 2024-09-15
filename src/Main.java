import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Ask me a YES or NO question: ");

        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close();

        Random rand = new Random();
        int r = rand.nextInt(5);


        if(r == 1){
            System.out.println("Isn't that obvious?! ");
        } else if (r == 2){
           System.out.println("You might want to re-access your question. ");
        } else if (r == 3){
            System.out.println("50 / 50. Never know. ");
        } else if (r == 4){
            System.out.println("Not even a single bit ");
        } else {
            System.out.println("I don't know..");
        }


    }
}