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


    public static void main(String[] args) {

        Integer[] test1 = {1, 1, 2, 2, 1};
        Integer[] test2 = {1, 1, 2, 2, 2, 1};
        Integer[] test3 = {1, 1, 1, 2, 2, 2, 1};



        System.out.println((NoTuples(test1)));
        System.out.println(NoTuples(test2));
        System.out.println(NoTuples(test3));



        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));



    }
}
