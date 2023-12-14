package academy.olga.homework14.four;

import java.util.Objects;

public class Train {
    private String trainDestination;
    private int trainNumber;
    private int startTimeHour;
    private int startTimeMinutes;

    public Train(){

    }

    public Train(String trainDestination, int trainNum, int startTimeHour, int startTimeMinutes) {
        this.trainDestination = trainDestination;
        this.trainNumber = trainNum;
        this.startTimeHour = startTimeHour;
        this.startTimeMinutes = startTimeMinutes;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getStartTimeHour() {
        return startTimeHour;
    }

    public void setStartTimeHour(int startTimeHour, int timeHour) {
        this.startTimeHour = startTimeHour;
    }

    public int getStartTimeMinutes() {
        return startTimeMinutes;
    }

    public void setStartTimeMinutes(int startTimeMinutes) {
        this.startTimeMinutes = startTimeMinutes;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainDestination='" + trainDestination + '\'' +
                ", trainNum=" + trainNumber +
                ", startTime=" + startTimeHour +
                ":" + startTimeMinutes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber && startTimeHour == train.startTimeHour && startTimeMinutes == train.startTimeMinutes && Objects.equals(trainDestination, train.trainDestination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainDestination, trainNumber, startTimeHour, startTimeMinutes);
    }
}
