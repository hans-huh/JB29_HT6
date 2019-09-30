package by.ld.hw.classes.task8.main;

import by.ld.hw.classes.task8.bean.Customer;
import by.ld.hw.classes.task8.bean.CustomerList;
import by.ld.hw.classes.task8.logic.CustomerListLogic;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get-
 * методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими
 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {
    public static void main(String[] args) {

        CustomerList customerList;
        CustomerList customersFoundByCardValue;
        CustomerListLogic customerListLogic;
        long lowerBoundary;
        long upperBoundary;


        customerList= new CustomerList();
        customerList.add(new Customer("Petr", "Petrov", "Petrovich", "Zhukava, 10",
                33337777, 323239898));
        customerList.add((new Customer("Denis", "Danilov", "Denisovich", "Nezalezhnasti, 15",
                12348765, 444455555)));
        customerList.add(new Customer("Alex", "Aliakseev", "Aliakseevich", "Pushkina av, 14",
                12345678, 123456789));
        customerList.add(new Customer("Boris", "Britva", "Borisovich", "Kuprevicha, 1/1",
                22224444, 987654321));

        customerListLogic = new CustomerListLogic();
        System.out.println("Here's the list of customers before sorting: ");
        customerListLogic.printCustomers(customerList);
        System.out.println("\n\nAnd here's the array of customers after sorting: ");
        customerListLogic.sortByLname(customerList);
        customerListLogic.printCustomers(customerList);

        lowerBoundary = 00000001;
        upperBoundary = 33333333;
        customersFoundByCardValue = customerListLogic.findByCardNumber(customerList, lowerBoundary, upperBoundary);
        System.out.println("\n\nHere's the array of customers with card numbers in the range between " + lowerBoundary + " and " + upperBoundary + ":");
        customerListLogic.printCustomers(customersFoundByCardValue);





    }
}
