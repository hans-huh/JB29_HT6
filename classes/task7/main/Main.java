package by.ld.hw.classes.task7.main;


import by.ld.hw.classes.task7.bean.Triangle;
import by.ld.hw.classes.task7.bean.Vertex;
import by.ld.hw.classes.task7.logic.TriangleLogic;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Vertex(0, 5), new Vertex(-5, 0), new Vertex(5, 0));
        TriangleLogic triangleLogic = new TriangleLogic();

        System.out.println("Given the triangle abc, where " + triangle.toString());
        System.out.println("Perimeter = " + triangleLogic.findPerimeter(triangle));
        System.out.println("S = " + triangleLogic.findS(triangle));
        System.out.println("Centroid is located at " + triangleLogic.findCentroid(triangle).toString());

    }
}
