package academy.olga.homework14.eight;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.add(new Customer(1, "Попков", "Вася",
                "Васильевич", "Пушкина", 111111, 101));
        bank.add(new Customer(2, "Александров", "Александр",
                "Александрович", "Минская", 222222, 102));
        bank.add(new Customer(3, "Никитин", "Никита",
                "Никитич", "Московская", 333333, 103));
        bank.add(new Customer(4, "Олегов", "Олег",
                "Олегович", "Могилевская", 444444, 104));
        bank.add(new Customer(5, "Власов", "Владимир",
                "Олегович", "Московская", 555555, 105));
        System.out.println(bank);
        bank.sortByName();
        System.out.println(bank);
        System.out.println(bank.checkCardNumber(100000, 400000));
    }
}
