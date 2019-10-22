package by.ld.hw.classes.task3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода
 * фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */


public class Main {
    public static void main(String[] args) {
        Student[] students;

        students = new Student[10];
        students[0] = new Student("Ivanov", "A.A", 101, 8, 7, 10, 8, 9);
        students[1] = new Student("Petrov", "B.B", 103, 9, 10, 9, 10, 9);
        students[2] = new Student("Sidorov", "C.C", 201, 8, 5, 7, 6, 9);
        students[3] = new Student("Pupkin", "D.D.", 202, 9, 9, 10, 9, 10);
        students[4] = new Student("Vasiliev", "E.E.", 203, 7, 7, 8, 7, 6);
        students[5] = new Student("Botanikov", "F.F", 204, 10, 10, 10, 9, 9);
        students[6] = new Student("Trus", "G.G", 301, 9, 9, 10, 9, 9);
        students[7] = new Student("Balbes", "H.H", 302, 7, 8, 7, 7, 6);
        students[8] = new Student("Byvaly", "I.I", 304, 9, 7, 8, 9, 10);
        students[9] = new Student("Barbos", "J.J.", 303, 7, 8, 9, 9, 9);

        // printing student's name that match the existing condition (only grades 9 and 10 are allowed)
        printStudentPerSample(students);

    }

// на занятии мы разбирали как отделить данные от логики и от ввода-вывода и почему это нужно делать
    // почему-то вы не переписали реализацию
    public static void printStudentPerSample(Student[] students){
        int[] performance;
        boolean matchCondition;
        int spaceCounter;

        // printing nice header
        System.out.println("#################################");
        System.out.println("#      Student     #   Group   #");
        System.out.println("#################################");

        for(Student s : students){
            matchCondition = true;
            performance = s.getAcademicPerformance();
            for(int i = 0; i < performance.length; i++){
                if(performance[i] < 9){
                    matchCondition = false;
                    break;
                }
            }
            if(matchCondition){
                System.out.print("# " + s.getLastName());
                spaceCounter = 17 - s.getLastName().length(); // using to align the values in the table. 17 is the number of characters int he Student column
                for(int k = 0; k < spaceCounter; k++){
                    System.out.print(" ");
                }
                System.out.print("#     " + s.getGroupNumber() + "    #\n" );

            }
        }
        System.out.println("#################################");
    }
}
