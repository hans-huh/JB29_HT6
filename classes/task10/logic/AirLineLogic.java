package by.ld.hw.classes.task10.logic;

import by.ld.hw.classes.task10.bean.AirLine;
import by.ld.hw.classes.task10.bean.AirLineList;

import java.util.ArrayList;

/**
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class AirLineLogic {
    public AirLineList findByDestination(AirLineList airLines, String destination){
        ArrayList<AirLine> list;
        AirLineList foundByDestination;
        int length;
        AirLine airLine;

        list = airLines.getAirLines();
        length = list.size();
        foundByDestination = new AirLineList();

        for(int i = 0; i < length; i++){
            airLine = list.get(i);
            if(destination.equals(airLine.getDestination())){
                foundByDestination.addAirLine(airLine);
            }
        }

        return foundByDestination;
    }

    public AirLineList findByDayOfWeek(AirLineList airLines, String dayOfWeek){
        ArrayList<AirLine> list;
        AirLineList foundByDayOfWeek;
        int length;
        AirLine airLine;

        list = airLines.getAirLines();
        length = list.size();
        foundByDayOfWeek = new AirLineList();

        for(int i = 0; i < length; i++){
            airLine = list.get(i);
            if(dayOfWeek.equals(airLine.getDayOfWeek())){
                foundByDayOfWeek.addAirLine(airLine);
            }
        }

        return foundByDayOfWeek;
    }


    public AirLineList findByDayOfWeekAndTime(AirLineList airLines, String dayOfWeek, int time){
        AirLineList foundByDayOfWeek;
        ArrayList<AirLine> list;
        AirLineList foundByDayOfWeekAndTime;
        int length;
        AirLine airLine;

        foundByDayOfWeekAndTime = new AirLineList();
        foundByDayOfWeek = findByDayOfWeek(airLines, dayOfWeek);
        list = foundByDayOfWeek.getAirLines();
        length = list.size();

        for(int i = 0; i < length; i++){
            airLine = list.get(i);
            if(airLine.getDepartureTime() > time){
                foundByDayOfWeekAndTime.addAirLine(airLine);
            }
        }

        return foundByDayOfWeekAndTime;
    }


    public void printAirLines(AirLineList list){
        ArrayList<AirLine> airLines;
        AirLine airLine;
        int length;

        airLines = list.getAirLines();
        length = airLines.size();

        for(int i = 0; i < length; i++){
            airLine = airLines.get(i);
            System.out.println(airLine.toString());
        }
    }
}
