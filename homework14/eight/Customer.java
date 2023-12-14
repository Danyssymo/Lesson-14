package academy.olga.homework14.eight;

import java.util.Objects;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String midleName;
    private String adress;
    private int cardNumber;
    private int bankAccount;

    public Customer(){

    }
    public Customer(int id, String surname, String name, String midleName, String adres, int cardNumber, int bankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.midleName = midleName;
        this.adress = adres;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surName='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", midleName='" + midleName + '\'' +
                ", adres='" + adress + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && cardNumber == customer.cardNumber && bankAccount == customer.bankAccount && Objects.equals(surname, customer.surname) && Objects.equals(name, customer.name) && Objects.equals(midleName, customer.midleName) && Objects.equals(adress, customer.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, midleName, adress, cardNumber, bankAccount);
    }
}
