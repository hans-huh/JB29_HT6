package by.ld.hw.classes.task3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода
 * фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    private String lastName;
    private String initials;
    private int groupNumber;
    private int[] academicPerformance;

    public Student(String lastName, String initials, int groupNumber, int gradeA, int gradeB, int gradeC, int gradeD, int gradeF){
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        int[] temp = {gradeA, gradeB, gradeC, gradeD, gradeF};
        this.academicPerformance = temp;
    }

    public Student(String lastName, String initials, int groupNumber){
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        int[] temp = {0, 0, 0, 0, 0};
        this.academicPerformance = temp;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
}
