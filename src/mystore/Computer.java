package mystore;
// Write a class called Computer
// Computer should define three private instance properties (not static)
// String OS
// boolean isLaptop
// String description
// Write getters and setters for all these properties
// Write a constructor that accepts a boolean and a String and sets the isLaptop and description properties

public class Computer {
    private String OS;
    private boolean isLaptop;
    private String type;

    public Computer(boolean isLaptop, String type) {
        this.isLaptop = isLaptop;
        this.type = type;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
