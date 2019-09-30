package by.ld.hw.classes.task10.bean;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get-
 * методы и метод toString().
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 */

public class AirLine {
    private String destination;
    private String flightNumber;
    private String planeType;
    private int departureTime;
    private String dayOfWeek;

    public AirLine(String flightNumber, String destination, String planeType, int departureTime, String dayOfWeek){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    public static String prettifyDepartureTime(int timeInSeconds){
        int hours;
        int minutes;
        String result;

        // getting hours
        minutes = timeInSeconds / 60;
        hours = minutes / 60;
        minutes = minutes % 60;

        result = Integer.toString(hours) + ":" + Integer.toString(minutes);

        return result;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureTime=" + prettifyDepartureTime(departureTime) +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }
}
