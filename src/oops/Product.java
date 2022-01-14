package oops;

public class Product {
    static int noOfObjects = 0;

    Product(){
        System.out.println("Zero param con");
    }
    {
        //instance block
        System.out.println("instance block 1");
        noOfObjects++;
    }

    {
        //instance block
        System.out.println("instance block 2");
        noOfObjects++;
    }

    {
        //instance block
        System.out.println("instance block 3");
        noOfObjects++;
    }

    {
        //instance block
        System.out.println("instance block 4");
        noOfObjects++;
    }

    static {
        //static block
        System.out.println(" static block 1");
    }

    static {
        //static block
        System.out.println(" static block 2");
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        System.out.println("total objetcs " + noOfObjects);
    }
}
