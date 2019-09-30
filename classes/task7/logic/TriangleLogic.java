package by.ld.hw.classes.task7.logic;


import by.ld.hw.classes.task7.bean.Triangle;
import by.ld.hw.classes.task7.bean.Vertex;

public class TriangleLogic {
    public double findPerimeter(Triangle triangle){
        double ab;
        double bc;
        double ac;

        Vertex a;
        Vertex b;
        Vertex c;

        a = triangle.getA();
        b = triangle.getB();
        c = triangle.getC();

        ab = findLength(a, b);
        bc = findLength(b, c);
        ac = findLength(a, c);

        return ab + bc + ac;
    }


    public double findS(Triangle triangle){
        double halfPerimeter;
        Vertex a;
        Vertex b;
        Vertex c;

        a = triangle.getA();
        b = triangle.getB();
        c = triangle.getC();

        halfPerimeter = findPerimeter(triangle) / 2;
        return Math.sqrt( halfPerimeter * (halfPerimeter - findLength(a, b)) * (halfPerimeter - findLength(b, c)) * (halfPerimeter - findLength(a, c)));
    }


    public double findLength(Vertex a, Vertex b){
        int x1, y1;
        int x2, y2;
        double length;

        x1 = a.getX();
        y1 = a.getY();

        x2 = b.getX();
        y2 = b.getY();

       length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
       return length;
    }

    public Vertex findCentroid(Triangle triangle){
        Vertex centroid;
        int ox;
        int oy;

        Vertex a;
        Vertex b;
        Vertex c;
        int x1, y1;
        int x2, y2;
        int x3, y3;


        a = triangle.getA();
        b = triangle.getB();
        c = triangle.getC();

        x1 = a.getX();
        y1 = a.getY();

        x2 = b.getX();
        y2 = b.getY();

        x3 = c.getX();
        y3 = c.getY();

        ox = (x1 + x2 + x3) / 3;
        oy = (y1 + y2 + y3) / 3;

        centroid = new Vertex(ox, oy);

        return centroid;
    }
}
