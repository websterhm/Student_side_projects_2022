
//any way to center the string output for the magic 8 ball?

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicEightBall {

    public MagicEightBall() {}

    public static void main(String[] args) {

        //------------------Magic 8 Ball Responses-------------

        List<String> magicResponse = new ArrayList<>();

        magicResponse.add("It is certain");
        magicResponse.add("It is decidedly so");
        magicResponse.add("Without a doubt");
        magicResponse.add("Yes-- definitely");
        magicResponse.add("You may rely on it");
        magicResponse.add("As I see it, yes");
        magicResponse.add("Most likely");
        magicResponse.add("Outlook good");
        magicResponse.add("Yes");
        magicResponse.add("Signs point to yes");
        magicResponse.add("Reply hazy, try again");
        magicResponse.add("Ask again later");
        magicResponse.add("Better not tell you now");
        magicResponse.add("Cannot predict now");
        magicResponse.add("Concentrate and ask again");
        magicResponse.add("Don't count on it");
        magicResponse.add("My reply is no");
        magicResponse.add("My sources say no");
        magicResponse.add("Outlook not so good");
        magicResponse.add("Very doubtful");

        Scanner userInput = new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("***********Welcome to Magic 8 Ball***********");
        System.out.println("*********************************************");
        System.out.println();
        System.out.println("********Please focus on your question********");
        System.out.println();
        System.out.println("Hold down 'spacebar' as you ask your question, then hit 'enter'");
        System.out.println();
        String spacesHeld = userInput.nextLine();
        System.out.println("*********************************************");
        int rawSpaces = spacesHeld.length();
        int index = (int)Math.floor(Math.random()*(20-0+1)+0);



        String yourMagicResponse = magicResponse.get(index);
        System.out.println("******** The Magic 8 Ball has spoken ********");
        System.out.println("*********************************************");
        System.out.println();
        System.out.println(yourMagicResponse);
        System.out.println();
        System.out.println("*********************************************");

        }

        //??????----Do I want to make a way for people to input their own "Magic Answers?"




    }

