package Introduction;

public class VariableIntro {
    public static void main(String[] args) {
        /*
        * To initiate a variable:
        * datatype name = value;
        *
        */
        double salary = 10000.56;
        int bonus = 250;

        // Casting changes var type, and avoids errors
        // In this case it truncated salary into an integer
        bonus = (int) salary;

        // So this will return salary, and then the truncated version in bonus
        System.out.println(salary);
        System.out.println(bonus);
    }
}
