package Objects;

public class Ikea {

    public static void main(String[] args) {
        // dataType name = value
        int example = 1;

        // This makes a new table named table1, with the default values specified in Table.java
        Table table1 = new Table();

        // This will access the table object we made and return the value of its weight and print it out
        // This is pretty much how those python turtles worked way back in the beginning of the year
        System.out.println(table1.getWeight());
    }
}
