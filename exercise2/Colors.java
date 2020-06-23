package exercise2;

import java.util.Arrays;

public class Colors {

    String[] colorful(String[] strings) {
        int index = 0;
        String[] colorArray = {"blue","red","yellow","black","green"};
        String[] retcolorArray = new String[10];


        for (String eachword : strings) {
            String[] wordArray = eachword.split(" ");
            for ( String substr : wordArray) {
                if( Arrays.asList(colorArray).contains(substr))
                {
                    index = index + 1;
                    retcolorArray[index] = eachword;
                    System.out.println(eachword);
                }
            }
        }
        return  retcolorArray;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        code.colorful(new String[]{"blue bird","red herring", "yellow bumblebee","black spider", "green monkey","pink",
                "great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
    }
}
