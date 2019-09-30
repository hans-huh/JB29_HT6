package by.ld.hw.classes.task8.bean;
import java.util.ArrayList;

public class CustomerList {
    private ArrayList<Customer> list;

    public CustomerList() {
        list = new ArrayList<>();
    }

    public void add(Customer customer){
        list.add(customer);
    }

    public void remove(Customer customer){
        list.remove(customer);
    }

    public void set(int i, Customer customer){
        list.set(i, customer);
    }

    public ArrayList<Customer> getCustomers(){
        return list;
    }

}
