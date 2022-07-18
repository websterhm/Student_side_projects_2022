import java.util.Arrays.*;
import java.util.*;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import static java.lang.Character.isDigit;

public class ignorePEMDAS {

    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");

    public ignorePEMDAS (){}

    public void leftToRightCalc(String equation) throws ScriptException {
        char[] equationArray = equation.toCharArray();
        if (equationArray.length >= 3 && isDigit(equationArray[0])){
            String stringA = String.valueOf(equationArray[0]);
            int size = equationArray.length;
            int index = 1;
            for (int i = 0; i < size; i++){
                char[] workingArray = Arrays.copyOfRange(equationArray, index, index + 1);

                String stringEquation = stringA + String.valueOf(workingArray);
                stringA = returnedValue(stringEquation);
                index += 2;
                System.out.println(stringA);
            }

        }

    }
    public String returnedValue(String stringEquation) throws ScriptException {
        int sumEquation = (int) engine.eval(stringEquation);
        String sumValues = String.valueOf(sumEquation);

        return sumValues;
    }

    public boolean isInteger(String string){
        try{
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws ScriptException{
        ignorePEMDAS newEquation = new ignorePEMDAS();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter an equation in format: number, operator, number, operator etc.");
        String userEquation = userInput.next();

        newEquation.leftToRightCalc(userEquation);
        System.out.println();

    }

}

//import java.util.Arrays.*;
//        import java.util.*;
//        import java.util.List;
//
//
//
//public class ignorePEMDAS {
//
//    ignorePEMDAS(String equation){
//        String [] equationArray = equation.trim().split("[0-9]+(?<=[-+*/()])|(?=[-+*/()])");
//        if (equationArray.length >= 3 && isInteger(equationArray[0])){
//            int intA = Integer.parseInt(equationArray[0]);
//            int size = equationArray.length;
//            int index = 1;
//            for (int i = 0; i < size; i++){
//                String[] workingArrays = Arrays.copyOfRange(equationArray, index, index + 1);
//                if (workingArrays[0].equals("+")){
//
//
//
//
////
////                intA = 0;
////                int intB = 0;
////                String strOperator = "";
////                if (isInteger(workingArray[1])) {
////                    intA = Integer.parseInt(workingArray[1]);
////                    strOperator = workingArray[0];
////                }
//
//// could you pull the first number, then have the equation set to make a = sum(or start)
//                    //b = operator, c = next num;
//                    index += 2;
//                }
//
//            }
//
//        }
