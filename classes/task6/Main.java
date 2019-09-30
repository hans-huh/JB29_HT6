package by.ld.hw.classes.task6;

import java.time.Clock;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В
 * случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд.
 */

public class Main {
    public static void main(String[] args) {
        MyClock clock;

        clock = new MyClock("14:25:31");
        System.out.println("Your time is " + clock.getHours() + ":" + clock.getMinutes() + ":" + clock.getSeconds());

        clock.setHours(24);
        clock.setMinutes(60);
        clock.setSeconds(-1);
        System.out.println("After incorrect update, your time is " + clock.getHours() + ":" + clock.getMinutes() + ":" + clock.getSeconds());

        clock.setNewTime("10:31:19");
        System.out.println("Your new time is " + clock.getHours() + ":" + clock.getMinutes() + ":" + clock.getSeconds());
    }

}
