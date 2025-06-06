package Objects;

// Since this is Ikea, this is european furniture and all units are metric (cm and kg)

public class Table {
    // Hello variables a-plenty
    // These are all the attributes we are granting our metaphorical table
    private double height;
    private double length;
    private double width;
    private double weight;
    private double price;

    // Default constructor - Special Method
    // name of method = the name of the class
    public Table(){
        height = 23;
        width = 40;
        length = 60;
        weight = 52;
        price = 50;
    }

    // Overloaded Constructor
    // Allows you to build a table with something other than the default specifications
    public Table(double height, double width, double length, double weight, double price){
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.price = price;
    }

    // Accessors/Getters: Just spits out the value we want
    // Keyword double in these methods specifies the data type that is returned
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Setters/Mutators: Makes changes to the data
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        if(weight <= 1000) {
            this.weight = weight;
        }else{
            this.weight = 1000;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
