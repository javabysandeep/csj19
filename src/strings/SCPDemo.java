package strings;

import java.util.Locale;

public class SCPDemo {
    public static void main(String[] args) {
        //1. using new keyword
        String str1 = new String("some string");

        //2. literal way
        String str2 = "some string";

        System.out.println(str1 == str2);//false
        //equals method is overridden inside String. It does content check
        System.out.println(str1.equals(str2));//true

        String str3 = "some string";
        System.out.println(str2 == str3);//true

        StringCopy stringCopy = new StringCopy(100);
//        stringCopy.setValue(200);
//        stringCopy.value = 400;

//        StringBuilder  stringBuilder = "some string";//CTE
        System.out.println(stringCopy.toString());//
        System.out.println(str1.toString());//

        System.out.println(str1.length());

        String meeting = "CSJ 19 Core";
        String newString = meeting.concat(" Java");
        System.out.println(newString.toLowerCase());
        System.out.println(newString.toUpperCase());


    }
}

final class StringCopy {
    private int value;

    public int getValue() {
        return value;
    }

    public StringCopy() {
    }

    public StringCopy(int value) {
        this.value = value;
    }
}