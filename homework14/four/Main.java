package academy.olga.homework14.four;
public class Main {
    public static void main(String[] args) {
        Station station = new Station();
        station.add((new Train("Moskva", 5, 17,30)));
        station.add((new Train("Piter", 4, 16,40)));
        station.add((new Train("Minsk", 3, 13,20)));
        station.add((new Train("London", 2, 16,30)));
        station.add((new Train("Moskva", 1, 19,40)));
        System.out.println(station);
        station.sortByName();
        System.out.println(station);
    }
}
