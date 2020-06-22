package exercise2;

public class Statically {
    private static String glue = "Epoxy";
    static String jello = "Jello";

    public static void moveAndShake(){
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public static void explain() {
        stubborn();
        System.out.println(glue);
        System.out.println("In JS static methods can only be accessed with reference to a the Class on which they are declared.\n" +
                "    In Java, static methods can be accessed directly.");
    }

    public static void main(String[] args) {
        moveAndShake();
        stubborn();
        explain();
        System.out.println(glue);
        System.out.println(jello);
    }
}
