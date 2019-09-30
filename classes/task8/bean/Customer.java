package by.ld.hw.classes.task8.bean;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get-
 * методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими
 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Customer {
    private static int idCounter = 0;
    private int customerID;
    private String fName;
    private String lName;
    private String pName;
    private String address;
    private long cardNumber;
    private long bankAccountNumber;

    public Customer(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        this.pName = "Not Specified";
        this.address = "Not Specified";
        this.cardNumber = 0;
        this.bankAccountNumber = 0;
        customerID = ++idCounter;
    }

    public Customer(String fName, String lName, String pName, String address, long cardNumber, long bankAccountNumber){
        this.fName = fName;
        this.lName = lName;
        this.pName = pName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
        customerID = ++idCounter;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString() {
        return "Customer: " + lName + ", " + fName + " " + pName +
                "; id: " + customerID + "; address: " + address + "; card number: " + cardNumber +
                "; bank account number: " + bankAccountNumber;
    }

}
