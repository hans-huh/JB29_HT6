package by.ld.hw.classes.task1;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

public class Test1 {

    private int var1 = 2;
    private int var2 = 2;


    // class methods
    public void setFirstVar(int var){
        var1 = var;
    }

    public void setSecondVar(int var){
        var2 = var;
    }

    public void printFirstVar(){
        System.out.println(var1);
    }

    public void printSecondVar(){
        System.out.println(var2);
    }

    public int getSum(){
        return var1 + var2;
    }

    public int getMax(){
        if (var1 <= var2){
            return var2;
        } else {
            return var1;
        }
    }

}
