package by.ld.hw.classes.task6;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В
 * случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
 * времени на заданное количество часов, минут и секунд
 */

public class MyClock {

    private int hours;
    private int minutes;
    private int seconds;

    public MyClock(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Getting string of HH:MM:SS format
    public MyClock(String str){// парсеры отдельно, время отдельно
        // почему вы вдруг решили, что данный конструктор должен принимать String?
        int tempHours;
        int tempMinutes;
        int tempSeconds;

        String[] tempStringArray = str.split(":");
        if(tempStringArray.length == 3){
            tempHours = Integer.parseInt(tempStringArray[0]);
            if(tempHours >= 0 && tempHours <= 23){
                this.hours = tempHours;
            } else {
                this.hours = 0;
            }

            tempMinutes = Integer.parseInt(tempStringArray[1]);
            if(tempMinutes >= 0 && tempMinutes <= 59){
                this.minutes = tempMinutes;
            } else {
                this.minutes = 0;
            }

            tempSeconds = Integer.parseInt(tempStringArray[2]);
            if (tempSeconds >= 0 && tempSeconds <= 59) {
                this.seconds = tempSeconds;
            } else {
                this.seconds = 0;
            }
        } else {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours >= 0 && hours <= 23){
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes >= 0 && minutes <= 59){
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds >= 0 && seconds <= 59){
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }


    public void setNewTime(String time){
        int tempHours;
        int tempMinutes;
        int tempSeconds;

        String[] tempStringArray = time.split(":");
        if(tempStringArray.length == 3){
            tempHours = Integer.parseInt(tempStringArray[0]);
            if(tempHours >= 0 && tempHours <= 23){
                setHours(tempHours);
            } else {
                setHours(0);
            }

            tempMinutes = Integer.parseInt(tempStringArray[1]);
            if(tempMinutes >= 0 && tempMinutes <= 59){
                setMinutes(tempMinutes);
            } else {
                setMinutes(0);
            }

            tempSeconds = Integer.parseInt(tempStringArray[2]);
            if (tempSeconds >= 0 && tempSeconds <= 59) {
                setSeconds(tempSeconds);
            } else {
                setSeconds(0);
            }
        } else {
            setHours(0);
            setMinutes(0);
            setSeconds(0);
        }
    }
}
