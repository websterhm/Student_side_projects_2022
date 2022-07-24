import java.util.List;

public class Practice {

    public Practice(){}

    public static String reverseWords(String original){
        String newString = "";
        String reversedString = "";
        char holdChar;
        String[] holding = original.split(" ");
        for (int i = holding.length-1; i >= 0; i--){
            newString += (holding[i] + " ");
        } for (int i = newString.length()-1; i>=0; i--){
            holdChar = newString.charAt(i);
            reversedString += holdChar;
        }return reversedString;
    }
    static boolean NoTuples(Integer[] nums) {

        boolean isTupleFree = true;
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if (a == b && b == c) {
                isTupleFree = false;
            } else {
                continue;
            }
        }
        return isTupleFree;

    }
    static int sumOdds(){

            int totalSum = 0;

            for(int i = 1; i<100; i++){
                totalSum += i;
            }
            return totalSum;
        }

    static boolean checkRecord(String s) {
        char[] attendance = s.toCharArray();
        int absent = 0;
        boolean threeLate = false;
        boolean isAwarded = true;

        for(int i = 0; i<attendance.length; i++) {
            if (attendance[i] == 'A') {
                absent += 1;
                System.out.println(absent);
            } else if (attendance[i] == 'L' && i+2 < attendance.length) {
                if (attendance[i] == 'L' && attendance[i + 1] == 'L' && attendance[i + 2] == 'L') {
                    threeLate = true;
                }
            }
            if (absent > 1 || threeLate) {
                isAwarded = false;
            }

        }return isAwarded;

    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int posNums = 0;
        int negNums = 0;
        int zedNums = 0;
        int numCount = 0;

        int[] array = new int[arr.get(0)];
        for (int j = 1; j <array.length; j++){
            array[j] = arr.get(j);
            System.out.println(array);
        }

        for (int i =0; i<array.length; i++)
            if (array[i] > 0){
                posNums++;
                numCount++;
            }else if (array[i] < 0){
                negNums++;
                numCount++;
            }else{
                zedNums++;
                numCount++;
            }
        double positives = ((posNums*100000)/(numCount*100000));
        System.out.println("positives: " + positives);
        positives = ((Math.round(posNums)* 1000000.0)/1000000.0);
        // negNums = (Math.round(negNums)* 1000000.0/1000000.0);
        // zedNums = (Math.round(zedNums)* 1000000.0/1000000.0);
        System.out.println(positives);
        System.out.println(negNums);
        System.out.println(zedNums);
    }


    static int testingSomething(int x, int missingHere){
        System.out.println(missingHere);
        return x;
    }






    public static void main(String[] args) {

        testingSomething(5);


    }


}
