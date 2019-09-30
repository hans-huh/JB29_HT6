package by.ld.hw.classes.task1;

public class Main {
    public static void main(String[] args) {
        Test1 test;

        test = new Test1();
        System.out.println("Testing methods of an instance of the class Test1\n");
        System.out.println("These are the initial values of var1 and var2");
        test.printFirstVar();
        test.printSecondVar();

        System.out.println("\nChanging the values of var1 and var2...");
        test.setFirstVar(5);
        test.setSecondVar(4);
        System.out.println("These are the new values of var1 and var2");
        test.printFirstVar();
        test.printSecondVar();

        System.out.println("\nTesting sum method");
        System.out.println(test.getSum());

        System.out.println("\nTesting getMax method");
        System.out.println(test.getMax());
    }
}
