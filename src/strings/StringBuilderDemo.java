package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Core Java");
        stringBuilder.append(" online training");
        System.out.println(stringBuilder);

        stringBuilder.insert(5, " insert between the string ");
        System.out.println(stringBuilder);

        stringBuilder.insert(0,"at the begining ");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String s1 = "aaaa";
//        stringBuilder.replace(0,20,s1);
        System.out.println(stringBuilder);

        String str = "immutable";

//        StringBuffer

    }
}
