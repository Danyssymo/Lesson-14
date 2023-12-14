package academy.olga.homework14.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Station {

    private List<Train> trains = new ArrayList();

    public Station() {

    }

    public void add(Train train) {
        trains.add(train);
    }

    @Override
    public String toString() {
        return "Station{" +
                "trains=" + trains +
                '}';
    }

    public void sortByNum() {
        for (int i = 0; i < trains.size(); i++) {
            Train current = trains.get(i);
            int index = i;

            for (int j = i + 1; j < trains.size(); j++) {
                int num1 = current.getTrainNumber();
                int num2 = trains.get(j).getTrainNumber();
                if (num2 < num1) {
                    current = trains.get(j);
                    index = j;
                }
            }
            trains.set(index, trains.get(i));
            trains.set(i, current);

        }
    }
    public void getTrainInfo(int num){
        boolean check = false;
        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getTrainNumber() == num){
                System.out.println("Информация о поезде: " + trains.get(i).getTrainDestination()+ " " +
                        trains.get(i).getStartTimeHour()+":"+trains.get(i).getStartTimeMinutes());
                check = true;
            }
        }
        if (!check){
            System.out.println("Поездов с таким номером нету.");
        }
    }
    public void sortByName() {
        for (int i = 0; i < trains.size(); i++) {
            Train current = trains.get(i);
            int index = i;

            for (int j = i + 1; j < trains.size(); j++) {
                String name1 = current.getTrainDestination();
                String name2 = trains.get(j).getTrainDestination();
                if (name2.compareTo(name1) < 0) {
                    current = trains.get(j);
                    index = j;
                }
            }
            trains.set(index, trains.get(i));
            trains.set(i, current);
        }
//        for (int i = 0; i < trains.size(); i++) {
//            int index = i;
//            Train current = trains.get(i);
//            for (int j = i+1; j < trains.size(); j++) {
//                if (current.getTrainDestination().equals(trains.get(j).getTrainDestination())){
//                    if (current.getStartTimeHour() > trains.get(j).getStartTimeHour()){
//                        current = trains.get(j);
//                        index = j;
//                    }
//                }
//            }
//            trains.get(index).setStartTimeHour(index,trains.get(i).getStartTimeHour());
//            trains.set(i, current);
//        }
    }

}
