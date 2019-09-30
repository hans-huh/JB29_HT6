package by.ld.hw.classes.task5;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по
 * умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и
 * метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности
 * класса.
 */

public class Main {
    public static void main(String[] args) {

        CounterUnit counterUnit = new CounterUnit();

        System.out.println("Initial state of our counter is " + counterUnit.getCounter());

        // let's increment our counter
        for(int i = 0; i <= 5; i++){
            counterUnit.incrementCounter();
        }

        System.out.println("State of our counter after a few increments is " + counterUnit.getCounter());

        // let's decrement our counter
        counterUnit.decrementCounter();
        System.out.println("State of our counter after one decrement is " + counterUnit.getCounter());

        // let's give a non-appropriate value to the counter
        counterUnit.setCounter(100);
        System.out.println("State of our counter after setting it to a >99 value is " + counterUnit.getCounter());

        // let's give a non-appropriate value to the counter
        counterUnit.setCounter(-1);
        System.out.println("State of our counter after setting it to a <0 value is " + counterUnit.getCounter());
    }
}
