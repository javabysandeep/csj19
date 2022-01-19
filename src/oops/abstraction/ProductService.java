package oops.abstraction;

public interface ProductService {
    //In interface variables are by default: public static final
    public static final int number1 = 100;
    int number2 = 200;

    // By default, all methods in the interface, are public abstract
    public abstract void migrateProduct();
    void createProduct();

    //From java 8 we can have static methods as well
    public static void utility(){
        System.out.println("Static utility method in an interface");
    }
    //From java 8 we can have default methods as well
    default void modifyProduct(){
       System.out.println("Default methods");
    }

    //instance blocks are not allowed{}
    //static blocks are not allowed    static {}
// constructors are not allowed   ProductService(){}

}
