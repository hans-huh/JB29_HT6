package by.ld.hw.classes.task4;

import java.util.Scanner;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
 * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Main {
    public static void main(String[] args) {
        Train[] trains;
        int number;

        trains = new Train[5];
        trains[0] = new Train("Vitebsk", 704, 60180);
        trains[1] = new Train("Gomel", 718, 53820);
        trains[2] = new Train("Brest", 681, 34560);
        trains[3] = new Train("Vitebsk", 714, 71400);
        trains[4] = new Train("Mogilev", 660, 56100);

        System.out.println("Please enter a train number");
        number = getNumber();
        getInfoByTrainNumber(trains, number);

        System.out.println("\nPrint trains before sorting: ");
        printTrains(trains);

        System.out.println("\nPrint trains after ascending sorting by train number");
        ascendingSortByTrainNumber(trains);
        printTrains(trains);

        System.out.println("\nPrint trains after descending sorting by train number");
        descendingSortByTrainNumber(trains);
        printTrains(trains);

        System.out.println("\nPrint trains after ascending sorting by destination:");
        ascendingSortByDestination(trains);
        printTrains(trains);

        System.out.println("\nPrint trains after descending sorting by destination:");
        descendingSortByDestination(trains);
        printTrains(trains);


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


    public static void ascendingSortByTrainNumber(Train[] trains){
        int n;
        Train temp;

        n = trains.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -  i - 1; j++){
                if(trains[j].getTrainNumber() > trains[j + 1].getTrainNumber()){
                    temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;
                }
            }
        }
    }

// ошибка аналогичная предыдущему таску
    public static void descendingSortByTrainNumber(Train[] trains){
        int n;
        Train temp;

        n = trains.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n -  i - 1; j++){
                if(trains[j].getTrainNumber() < trains[j + 1].getTrainNumber()){
                    temp = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = temp;
                }
            }
        }
    }


    public static void getInfoByTrainNumber(Train[] trains, int trainNumber){
        int n;
        int index;
        int spaceCounter;
        boolean isPresent;

        n = trains.length;
        index = 0;
        isPresent = false;
        for(int i = 0; i < n; i++){
            if(trains[i].getTrainNumber() == trainNumber){
                isPresent = true;
                index = i;
            }
        }

        System.out.println("###############################");
        System.out.println("#   Destination   # Departure #");
        System.out.println("###############################");
        if(isPresent){
            spaceCounter = 14 - trains[index].getDestination().length();
            System.out.print("#   " + trains[index].getDestination());
            for(int i = 0; i < spaceCounter; i++){
                System.out.print(" ");
            }
            System.out.print("# " + prettifyDepartureTime(trains[index].getDepartureTime()) + "     #");
        } else {
            System.out.print("#       No train found!       #");
        }
        System.out.println("\n###############################");
    }


    public static void ascendingSortByDestination(Train[] trains){
        int n;
        int stringComparisonResult;
        Train temp;


        n = trains.length;
        ascendingSortByDeparture(trains);
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                stringComparisonResult = trains[j].getDestination().compareTo(trains[j+1].getDestination());
                if(stringComparisonResult > 0){
                    temp = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = temp;
                }
            }
        }

    }


    public static void descendingSortByDestination(Train[] trains){
        int n;
        int stringComparisonResult;
        Train temp;


        n = trains.length;
        ascendingSortByDeparture(trains);
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                stringComparisonResult = trains[j].getDestination().compareTo(trains[j+1].getDestination());
                if(stringComparisonResult < 0){
                    temp = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = temp;
                }
            }
        }
    }


    public static void ascendingSortByDeparture(Train[] trains){
        int n;
        Train temp;

        n = trains.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(trains[j].getDepartureTime() > trains[j+1].getDepartureTime()){
                    temp = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = temp;
                }
            }
        }
    }


    public static void printTrains(Train[] trains){
        int spaceCounter;
        System.out.println("######################################");
        System.out.println("# Number #  Destination  # Departure #");
        System.out.println("######################################");
        for(Train train : trains){
            System.out.print("# " + train.getTrainNumber());
            spaceCounter = 7 - Integer.toString(train.getTrainNumber()).length();
            for(int i = 0; i < spaceCounter; i++){
                System.out.print(" ");
            }
            System.out.print("#  " + train.getDestination());
            spaceCounter = 13 - train.getDestination().length();
            for(int i = 0; i < spaceCounter; i++){
                System.out.print(" ");
            }
            System.out.print("# " + prettifyDepartureTime(train.getDepartureTime()));
            spaceCounter = 10 - prettifyDepartureTime(train.getDepartureTime()).length();
            for(int i = 0; i < spaceCounter; i++){
                System.out.print(" ");
            }
            System.out.print("#\n");
        }
        System.out.println("######################################\n");
    }


    public static int getNumber(){
        int n;
        Scanner scanner;
        boolean meetCondition;
        boolean isDigit;

        n = 0;
        scanner = new Scanner(System.in);
        do{
            isDigit = false;
            while(!isDigit){
                try{
                    n = scanner.nextInt();
                    isDigit = true;
                } catch (java.util.InputMismatchException e){
                    System.out.println("Please enter an integer!");
                    scanner.next();
                }
            }
            if(n < 0){
                System.out.println("Train number cannot be less than zero! Please try again!");
                meetCondition = false;
            } else {
                meetCondition = true;
            }
        } while (!meetCondition);

        return n;
    }
}
