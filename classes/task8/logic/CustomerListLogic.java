package by.ld.hw.classes.task8.logic;

import by.ld.hw.classes.task8.bean.Customer;
import by.ld.hw.classes.task8.bean.CustomerList;
import java.util.ArrayList;

/**
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class CustomerListLogic {

    public void sortByLname(CustomerList customers) {
        ArrayList<Customer> list;
        Customer[] customerArray;
        int length;

        list = customers.getCustomers();
        customerArray = new Customer[list.size()];
        length = customerArray.length;

        for (int i = 0; i < length; i++) {
            customerArray[i] = list.get(i);
        }

        // sorting the array
        int stringComparisonResult;
        Customer temp;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                stringComparisonResult = customerArray[j].getfName().compareTo(customerArray[j + 1].getfName());
                if (stringComparisonResult > 0) {
                    temp = customerArray[j];
                    customerArray[j] = customerArray[j + 1];
                    customerArray[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < length; i++){
            list.set(i, customerArray[i]);
        }

    }


    public CustomerList findByCardNumber(CustomerList customers, long lowerBoundary, long upperBoundary){
        CustomerList newList;
        Customer customer;
        ArrayList<Customer> list;
        int size;

        newList = new CustomerList();
        list = customers.getCustomers();
        size = list.size();

        for(int i = 0; i < size; i++){
            customer = list.get(i);
            if(customer.getCardNumber() >= lowerBoundary && customer.getCardNumber() <= upperBoundary){
                newList.add(customer);
            }
        }

        return newList;

    }


    public void printCustomers(CustomerList customers){
        ArrayList<Customer> list;
        Customer customer;
        int size;

        list = customers.getCustomers();
        size = list.size();

        for(int i = 0; i < size; i++){
            customer = list.get(i);
            System.out.println(customer.toString());
        }
    }

}
