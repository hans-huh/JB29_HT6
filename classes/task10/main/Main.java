package by.ld.hw.classes.task10.main;

import by.ld.hw.classes.task10.bean.AirLine;
import by.ld.hw.classes.task10.bean.AirLineList;
import by.ld.hw.classes.task10.logic.AirLineLogic;

/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get-
 * методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими
 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {
    public static void main(String[] args) {

        AirLineList lines;
        AirLineList foundByDestination;
        AirLineList foundByDayOfWeek;
        AirLineList foundByDayOfWeeAndTime;
        AirLineLogic airLineLogic;

        lines = new AirLineList();
        lines.addAirLine(new AirLine("9AA", "Paris", "Jet", 60180, "Monday"));
        lines.addAirLine(new AirLine("190", "Riga", "Jet", 53820, "Wednesday"));
        lines.addAirLine(new AirLine("8AA", "Paris", "Jet", 34560, "Tuesday"));
        lines.addAirLine(new AirLine("419", "London", "Jet", 71400, "Saturday"));
        lines.addAirLine(new AirLine("500", "Moscow", "Jet", 56100, "Tuesday"));


        airLineLogic = new AirLineLogic();
        System.out.println("Here is the list of airlines");
        airLineLogic.printAirLines(lines);

        System.out.println("\n\n Let's find all flights to Paris");
        foundByDestination = airLineLogic.findByDestination(lines, "Paris");
        airLineLogic.printAirLines(foundByDestination);

        System.out.println("\n\nLet's find all flights scheduled for Tuesday: ");
        foundByDayOfWeek = airLineLogic.findByDayOfWeek(lines, "Tuesday");
        airLineLogic.printAirLines(foundByDayOfWeek);

        System.out.println("\n\nLet's find all fligts for Tuesday, starting from 10 a.m.");
        foundByDayOfWeeAndTime = airLineLogic.findByDayOfWeekAndTime(lines, "Tuesday", 36000);
        airLineLogic.printAirLines(foundByDayOfWeeAndTime);

    }
}
