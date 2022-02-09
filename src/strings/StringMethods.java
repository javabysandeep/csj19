package strings;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "          Welcome to the online training";

        s1 = s1.replace('a', '@');

        System.out.println(s1);

        s1 = s1.replace("tr@ining", "Java Training         ");

        System.out.println(s1);
        s1 = s1.trim();
        System.out.println(s1);
        System.out.println(s1.indexOf('J'));
        System.out.println(s1.indexOf("Java"));

        char[] result = {'P','A','S','S'};

        String arrayToString = new String(result);
        System.out.println(arrayToString);//PASS

        int[] intArray = {65,66,67,68,69};
        String intToString = new String(intArray,1,4);
        System.out.println(intToString.isEmpty());

        String heapRef = new String("Heap reference");
        System.out.println(heapRef.hashCode());//hashcode from heap

        //Get the reference of the same content object from SCP
        String intern = heapRef.intern();
//        intern.hashCode();// it is overridden inside the String class.
        System.out.println(intern==heapRef);//false
        System.out.println(heapRef.contains("Heap"));

//        String str = new StringBuilder();//CTE


    }
}
