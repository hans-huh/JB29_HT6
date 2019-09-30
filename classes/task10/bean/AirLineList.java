package by.ld.hw.classes.task10.bean;

import java.util.ArrayList;

/**
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 * и методами.
 */

public class AirLineList {
    private ArrayList<AirLine> airlines;

    public AirLineList(){
        airlines = new ArrayList<>();
    }

    public void addAirLine(AirLine airLine){
        airlines.add(airLine);
    }

    public void removeAirLine(AirLine airLine){
        airlines.remove(airLine);
    }

    public void setAirLine(int i, AirLine airLine){
        airlines.set(i, airLine);
    }

    public ArrayList<AirLine> getAirLines(){
        return airlines;
    }

}
