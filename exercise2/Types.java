package exercise2;

public class Types {
    private static int number=10;
    private static int[] myArray = new int[] {3,4,5,6,76,12,2};
    private static String movieA = "Harry and the Hendersons";
    private static String movieB = "Star Wars";
    private static char male = 'm';
    private static char female = 'f';

//the above instance variables have mistakes with their data types.  Fix the data types so the main method
//    correctly displays the value of all of the variables
// "There are variables that have been declared in this Accessible class.  Fix the code so
//        that all the variables can be accessed by the main method.  print out the values of every variable once the
//        code has been refactored."

    public static void main(String[] args) {
        System.out.println("Number : "+number + "\n" + "Array is ");
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }
        System.out.println("String 1: " +"\t" +movieA +"\n" +
                "String 2 : " +"\t" +movieB +"\n"+
                "Characters"+"\t" +male +"\t" +female);
    }
}