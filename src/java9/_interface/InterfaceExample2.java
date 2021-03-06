package java9._interface;

public interface InterfaceExample2 {

    // after java 9, we can see private method on interface example
    // in java 8, we can define just default and static method
    /*
    Why do we need private methods in Interface?
    Java 9 private methods in interfaces have following benefits.

    No need to write duplicate code, hence more code reusability.
    We got the choice to expose only our intended methods implementations to clients.
     */

    static void displayCardDetails(){
        // Method implementation goes here.
    }

    default void print(String sr){
        System.out.println(sr);

    };

    private Long createCard(){

        return 1L;
    };

}
