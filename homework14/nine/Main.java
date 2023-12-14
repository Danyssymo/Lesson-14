package academy.olga.homework14.nine;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.add(new Book(1, "Колобок", "Саша",1, 2000, 10, 50, "Classic"));
        library.add(new Book(2, "Маша и медведь", "Петя",10, 2001, 30, 500, "Classic"));
        library.add(new Book(3, "Теремок", "Петя",1, 2005, 40, 150, "Classic"));
        System.out.println(library);
        System.out.println(library.showAuthorBooks("Петя"));
        System.out.println();
        System.out.println(library.showBooksPublishing(1));
        System.out.println();
        System.out.println(library.sortBooksByYears(2000));
    }
}
