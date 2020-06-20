package udemy_exercises;

import java.util.Scanner;

public class Sorting1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void printArray(int[] inputArray){
        for (int i=0; i<inputArray.length; i++){
            System.out.println(inputArray[i] );
        }
    }

    public static void reverse(int[] inputArray) {
        int length = inputArray.length-1;
        for (int  i = 0; i < (inputArray.length)/2 ; i++) {
            int temp = inputArray[i];
            inputArray[i]=inputArray[length];
            inputArray[length]= temp;
            length--;
        }
    }

    public static int[] getArray(int[] inputArray){
        System.out.println("Enter the values of the Input Array: \t");
        for (int i=0; i<inputArray.length; i++){
            inputArray[i]= scanner.nextInt();
            scanner.nextLine();
        }
        return inputArray;
    }

    public static int[] sortArray(int[] inputArray){
        for (int i=0; i<inputArray.length; i++) {
            for(int j=i+1; j <inputArray.length; j++){
                if (inputArray[i]<inputArray[j]){
                    int temp = inputArray[i];
                    inputArray[i]= inputArray[j];
                    inputArray[j]=temp;
                }
            }
        }
        return inputArray;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of values: \t");
        int count= scanner.nextInt();
        int [] inputArray = new int[count];
        inputArray=getArray(inputArray);
        System.out.println("The Input Array is : ");
        printArray(inputArray);
        //printArray(inputArray);
        reverse(inputArray);
        System.out.println("The Reversed Array is : ");
        printArray(inputArray);
        System.out.println("The Sorted Array is : ");
        sortArray(inputArray);
        printArray(inputArray);
    }
}
