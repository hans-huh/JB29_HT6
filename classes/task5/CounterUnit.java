package by.ld.hw.classes.task5;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
 * значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по
 * умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и
 * метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности
 * класса.
 */

public class CounterUnit {
    private int counter;
    private final int MAX_VALUE = 99;
    private final int MIN_VALUE = 0;

    public CounterUnit(){
        counter = MIN_VALUE;
    }

    public CounterUnit(int counter){
        if(counter >= MIN_VALUE && counter <= MAX_VALUE){
            this.counter = counter;
        } else {
            counter = MIN_VALUE;
        }

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if(counter >= MIN_VALUE && counter <= MAX_VALUE){
            this.counter = counter;
        } else if(counter > 99) {
            this.counter = MIN_VALUE;
        } else {
            this.counter = MAX_VALUE;
        }
    }

    public void incrementCounter(){
        counter++;
        if (counter > MAX_VALUE){
            counter = MIN_VALUE;
        }
    }

    public void decrementCounter(){
        counter--;
        if(counter < MIN_VALUE){
            counter = MAX_VALUE;
        }
    }

    @Override
    public String toString() {
        return "counter=" + counter;
    }
}
