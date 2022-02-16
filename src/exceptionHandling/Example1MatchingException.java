package exceptionHandling;

class Example1MatchingException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);

        } catch (NullPointerException e) {
            // TODO: handle exception
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Divide by zero");
        }

        System.out.println("rest of the code");
    }
}