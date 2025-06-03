package Objects;

/*
* Since this is Ikea, this is european furniture and all units are metric (cm and kg)
*
* */

public class Table {
    // Hello variables a-plenty
    // These are all the attributes we are granting our metaphorical table
    double height;
    double length;
    double width;
    double weight;
    double price;

    // Default constructor - Special Method
    // name of method = the name of the class
    public Table(){
        height = 23;
        width = 40;
        length = 60;
        weight = 52;
        price = 50;
    }

    // Accessors/Getters: Just spits out the value we want
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
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
