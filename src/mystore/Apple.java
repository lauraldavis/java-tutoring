package mystore;
// Write a class called Apple that extends Computer and implements the Product interface
// It should have two private instance properties
// double price
// int stock
// It should have a constructor that accepts one Strings and one boolean
// Set the OS property to macOS
// Set the properties of isLaptop and description with the values of the parameters
// Implement all methods from the Product interface

public class Apple extends Computer implements Product {
    private double price;
    private int stock;

    public Apple(String OS, boolean isLaptop, String type) {
        super(isLaptop, type);
        super.setOS("macOS");
    }

    @Override
    public double getPrice() {
        return this.price * 2;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public void setStock(int newStock) {
        this.stock = newStock;
    }
}
