import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class CootieCatcher {

    public CootieCatcher(){}

    public void countdownFrom8(int startingNumber){
        for (int i = startingNumber-1; i > -1; i--){
            startingCountdownIndex(i);
        }
    }

    public void startingCountdownIndex(int index){
        String[] countingDown = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
        System.out.println(".........." + countingDown[index]);
        System.out.println("**********************************");
    }


    public static void main(String[] args) {

        CootieCatcher catcher = new CootieCatcher();

        Scanner userInput = new Scanner(System.in);

        System.out.println("*********************************************");
        System.out.println("**********Welcome to Cootie Catcher**********");
        System.out.println("*********************************************");
        System.out.println();
        System.out.println("**********Please enter a number 1-8**********");
        int numberSelected = userInput.nextInt();
        System.out.println("*********************************************");

        catcher.countdownFrom8(numberSelected);

        System.out.println("*******Please pick from the following********");
        System.out.println("*********************************************");
        System.out.println("***** Star ** Square ** Diamond ** Heart ****");
        String shapeSelected = (userInput.next()).toLowerCase();
        System.out.println("*********************************************");

        if (shapeSelected.equals("star")) {
            catcher.countdownFrom8(4);
        }else if (shapeSelected.equals("square")){
            catcher.countdownFrom8(6);
        }else if (shapeSelected.equals("diamond")){
            catcher.countdownFrom8(7);
        }else if (shapeSelected.equals("heart")) {
            catcher.countdownFrom8(5);
        }

            System.out.println("*******Please pick from the following********");
            System.out.println("*********************************************");
            System.out.println("***** Red ** Purple ** Blue ** Green ****");
            String colorSelected = (userInput.next()).toLowerCase();
            System.out.println("*********************************************");

        if (colorSelected.equals("red")) {
            catcher.countdownFrom8(4);
            System.out.println("Do not mistake temptation for opportunity");
        }else if (colorSelected.equals("purple")){
            catcher.countdownFrom8(6);
            System.out.println("An alien of some sort will be appearing to your shortly");
        }else if (colorSelected.equals("blue")){
            catcher.countdownFrom8(7);
            System.out.println("The road to riches is paved with homework");
        }else if (colorSelected.equals("green")) {
            catcher.countdownFrom8(5);
            System.out.println("If you look back, you'll soon be going that way");
        }

        System.out.println("*********************************************");


        }

    }


