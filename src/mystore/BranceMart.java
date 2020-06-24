package mystore;

// Write a class called Computer
// Computer should define three private instance properties
// String OS
// boolean isLaptop
// String description
// Write getters and setters for all these properties
// Write a constructor that accepts a boolean and a String and sets the isLaptop and description properties


// Write a class called Windows that extends Computer and implements the Product interface
// It should have two private instance properties
// double price
// int stock
// It should have a constructor that accepts two Strings and a boolean
// Set all properties with the parameters you define (hint: use the super constructor to set isLaptop and description)
// Implement all methods from the Product interface


// Write a class called Apple that extends Computer and implements the Product interface
// It should have two private instance properties
// double price
// int stock
// It should have a constructor that accepts one Strings and one boolean
// Set the OS property to macOS
// Set the properties of isLaptop and description with the values of the parameters
// Implement all methods from the Product interface


// Write a class called Cashier that extends the Person class in the peoplestuff package
// Cashier should have an instance method called total(List<DataType> parameterName)
// The method should accept a List that can contain Androids, Iphones, Windows and Apples
// The cashier should return the total of all items in the List.
// bonus: Overwrite the greetSomeoneElse method from the Person class

// Here in the main method
// Create one instance of an Apple and one instance of a Windows
// set the price of the Apple to 550.62 and the price of the Windows to 230.99

// Uncomment the code in the main method
// Create a List and add the Apple and Windows that you created
// Add the Android androidPhone and the Iphone iphone to the list
// Create a Cashier
// Pass the List to the Cashier's total method and System.out.println the result

import java.util.ArrayList;
import java.util.List;

public class BranceMart {
    public static void main(String[] args) {

        Product myApple = new Apple("iOS",true, "Macbook Pro");
        myApple.setPrice(550.62);
        Product myWindows = new Windows("Windows Vista", false, "Old old Dell");
        myWindows.setPrice(230.99);

        // pre-existing code for android and iphone
        Product androidPhone = new Android(30.5, "123-456-7890", "Galaxy S50");
        androidPhone.setPrice(90.30);
        Product iphone = new Iphone(40, "234-567-8901", "iPhone11");
        iphone.setPrice(208.70);

        // create a generic List of Product objects, call it myCart, instantiate it as an ArrayList
        // declaring a List (because its more generic) allows more methods to work with the list
        // make the parameter / argument a more generic type also
        List<Product> myCart = new ArrayList<>();
        myCart.add(myApple);
        myCart.add(myWindows);
        myCart.add(androidPhone);
        myCart.add(iphone);

        Cashier brance = new Cashier("Brance", "Alexander", 25);
        System.out.println("brance.total(myCart) = " + brance.total(myCart));

        // use Product to instantiate items because that's the interface

//        // Phone and Computer CAN instantiate items, but are not very useful, they can't getPrice() - inheritance flows one way
//        // because Computer doesn't implement Product or its' methods
//        Computer myComputer = new Computer(false,"generic");
//        System.out.println(myComputer.getOS()); // null
//        System.out.println(brance.total(myCart));
//
//        Computer specificApple = new Apple("iOS",true, "Different Macbook");
//        System.out.println(specificApple.getOS());
//        System.out.println(brance.total(myCart));


    }
}
