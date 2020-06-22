package exercise2;

import java.util.Arrays;

public class Array {
    //Take the arrays.js file, and refactor the code into Java in this file.
    public static void main(String[] args) {
        int[] nums = new int [] {10,23,3,4,5,2,1};
        String[] greetings = new String[]{"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
        int[] binaries= new int []{0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
        printNums(nums);
        printGreetings(greetings);
        printBinaries(binaries);
    }

    public static void printNums(int[] nums) {
        System.out.println("Integer Array ");
        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i] );
        }
    };

    public static void printGreetings(String[] greetings) {
        System.out.println("The String array " +Arrays.toString(greetings));
    };

    public static void printBinaries(int[] binaries) {
        boolean [] boolArray = new boolean[binaries.length];
        System.out.println("The boolean array :");
        for (int i=0; i<binaries.length; i++){
            if (binaries[i] == 1){
                boolArray[i]=true;
            } else{
                boolArray[i]=false;
            }
            System.out.println(boolArray[i]);
        }
    };
}








