package exercise2;
public class Monkeys {

    static  boolean monkeyBusiness(Monkey[] monkeys) {
        //BONUS EXERCISE
        //We have a set of monkeys.  Each Monkey has a boolean smile property, which indicates if that particular monkey is
        // smiling.  Determine whether or not the majority of monkeys are smiling.  If the majority are smiling, return true.
        // if the majority are not smiling, return false.  If it is a tie, return true.
        int  yessmile = 0;
        int nosmile = 0;

        for (int i = 0; i < monkeys.length; i++) {
            if (monkeys[i].smile == true)
            {
                yessmile = yessmile + 1;
            } else
            { nosmile = nosmile + 1 ; }


        }
        if (yessmile > nosmile) { System.out.println ("Smile"); }
        else {System.out.println("NoSmile"); }

        return true;
    }

    static class Monkey {
        String name;
        boolean smile;

        public void setMonkey(String name1, boolean smile1) {
            name = name1;
            smile=smile1;
        }
        public void showData(){
            System.out.println(name + " " + smile);
        }
    }

    public static void main(String[] args) {
        //Bonus exercise instructions:  create an array of at least 3 monkeys, utilizing the nested Monkey class, and
        // determine whether the majority of them are smiling or not.
        //required monkey data:
        // Rafiqi is smiling
        // Curious George is smiling
        // King Kong is not smiling
        //You are NOT allowed to move the Monkey class.  Keep it where it is.

        Monkey monkey[] = new Monkey[3];
        monkey[0]= new Monkey();
        monkey[1] = new Monkey();
        monkey[2] = new Monkey();

        monkey[0].setMonkey("Rafiqi", false);
        monkey[1].setMonkey("King Kong", true);
        monkey[2].setMonkey("Curious George", true);

        monkey[0].showData();
        monkey[1].showData();
        monkey[2].showData();

        monkeyBusiness(monkey);
    }


}