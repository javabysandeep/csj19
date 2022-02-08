package strings;

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

    }
}
