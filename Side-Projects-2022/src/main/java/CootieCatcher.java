import java.util.*;


public class CootieCatcher {

    public CootieCatcher() {
    }

    public void countdownFrom8(int startingNumber) {
        for (int i = startingNumber - 1; i > -1; i--) {
            startingCountdownIndex(i);
        }
        System.out.println();
    }

    //make it count from letters in word instead of numbers
    public void startingCountdownIndex(int index) {
        String[] countingDown = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
        System.out.println(".........." + countingDown[index]);
        System.out.println("**********************************");
    }

    public void startingCountdownWord(String word) {
        char[] spellingOut = word.toCharArray();
        for (char c : spellingOut) {
            System.out.println(".........." + c);
            System.out.println("**********************************");
        }
        System.out.println();
    }

    public void chooseSomethingPrint (String[] choice) {
        System.out.println("*********************************************");
        System.out.println("*******Please pick from the following********");
        System.out.println("*********************************************");
        System.out.println("***** " + choice[0] + " ** " + choice[1] + " ** " + choice[2] + " ** " + choice[3] + " ****");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
    }

    public void printFortune(Map<String, String> fortunes, String choice){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("**************** Your Fortune ***************");
        System.out.println(fortunes.get(choice));
    }

    public static void main(String[] args) {

        CootieCatcher catcher = new CootieCatcher();

        Scanner userInput = new Scanner(System.in);

        String[] shapeChoices = {"Star", "Square", "Diamond", "Heart"};
        String[] colorChoices = {"Red", "Purple", "Blue", "Green"};


        Map<String, String> fortuneMap = new HashMap<>();
        fortuneMap.put("STAR", "Do not mistake temptation for opportunity");
        fortuneMap.put("RED", "No snowflake in an avalanche ever feels responsible");
        fortuneMap.put("SQUARE", "An alien of some sort will be appearing to your shortly");
        fortuneMap.put("PURPLE", "Little by little, one travels far");
        fortuneMap.put("DIAMOND", "The road to riches is paved with homework");
        fortuneMap.put("BLUE", "Be careful who you trust- salt and sugar look the same");
        fortuneMap.put("HEART", "If you look back, you'll soon be going that way");
        fortuneMap.put("GREEN", "To truly find yourself, play hide and seek alone");


        System.out.println("*********************************************");
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("**********Welcome to Cootie Catcher**********");
        System.out.println("*********************************************");
        System.out.println();
        System.out.println("**********Please enter a number 1-8**********");
        int numberSelected = userInput.nextInt();
        System.out.println("*********************************************");

        catcher.countdownFrom8(numberSelected);


        if (numberSelected % 2 == 0) {

            catcher.chooseSomethingPrint(colorChoices);
            String userSelectedColor = (userInput.next()).toUpperCase();
            catcher.startingCountdownWord(userSelectedColor);
            catcher.chooseSomethingPrint(shapeChoices);
            String userSelectedShape = (userInput.next()).toUpperCase();
            catcher.printFortune(fortuneMap,userSelectedShape);

        }else if (numberSelected % 2 != 0){

            catcher.chooseSomethingPrint(shapeChoices);
            String userSelectedShape = (userInput.next()).toUpperCase();
            catcher.startingCountdownWord(userSelectedShape);
            catcher.chooseSomethingPrint(colorChoices);
            String userSelectedColor = (userInput.next()).toUpperCase();
            catcher.printFortune(fortuneMap, userSelectedColor);

        }else{

            System.out.println("****************** So Sorry ***************");
            System.out.println("************* That is not an option********");

        }

        }

    }


