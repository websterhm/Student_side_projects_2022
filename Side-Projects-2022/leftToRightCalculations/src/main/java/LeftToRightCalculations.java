import java.util.Arrays.*;
import java.util.*;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static java.lang.Character.isDigit;

//get user input for an equation
//iterate through each character at a time
//if it's able to be an integer, set it to integer B
//if it is an operation: + - integer B becomes 0, if it's * or / integer B becomes 1
//start with sum int
public class LeftToRightCalculations {

    public LeftToRightCalculations(String equation) {
        char[] equationArray = equation.toCharArray();
        int index = 1;
        int intA = Integer.parseInt(("" + equationArray[0]));
        for (int i = 0; i < equationArray.length; i+=2) {
            String operator = "" + equationArray[index];
            String stringB = ("" + equationArray[index + 1]);
            int intB = Integer.parseInt(stringB);
            Equation workingEquation = new Equation();
            workingEquation.setIntA(intA);
            workingEquation.setIntB(intB);
            workingEquation.setOperator(operator);
            index += 2;
            intA = workingSum(workingEquation);
        }
        System.out.println(intA);
    }


    private int workingSum(Equation workingEquation){
        int sum = workingEquation.getIntA();
        int intB = workingEquation.getIntB();
        String operator = workingEquation.getOperator();

        if (operator.equals("+")){
            sum += intB;
        } else if (operator.equals("-")){
            sum -= intB;
        } else if (operator.equals("/")){
            sum /= intB;
        } else if (operator.equals("*")){
            sum *= intB;
        }

        return sum;
    }
    public static void main(String[] args){

        System.out.println("Please enter an equation in format: number, operator, number, operator etc.");
        Scanner userInput = new Scanner(System.in);

        String userEquation = userInput.next();

        LeftToRightCalculations calculation = new LeftToRightCalculations(userEquation);





        System.out.println();
    }

}
