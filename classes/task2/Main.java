package by.ld.hw.classes.task2;

public class Main {
    public static void main(String[] args) {
        Test2 first;
        Test2 second;

        // generating an instance of Test2 class with default fields
        first = new Test2();

        // generating an instance of Test2 class with supplied values
        second = new Test2(5, 7);

        System.out.println("\nFields of the first object");
        System.out.println("var1 = " + first.getVar1() + ", var2 = " + first.getVar2());

        System.out.println("\nFields of the second object");
        System.out.println("var1 = " + second.getVar1() + ", var2 = " + second.getVar2());

        // changing the values of fields of first and second objects
        first.setVar1(1);
        first.setVar2(1);

        second.setVar1(8);
        second.setVar2(8);

        System.out.println("\nFields of the first object");
        System.out.println("var1 = " + first.getVar1() + ", var2 = " + first.getVar2());

        System.out.println("\nFields of the second object");
        System.out.println("var1 = " + second.getVar1() + ", var2 = " + second.getVar2());

    }
}
