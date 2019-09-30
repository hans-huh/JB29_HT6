package by.ld.hw.classes.task7.bean;

public class Triangle {
    Vertex a;
    Vertex b;
    Vertex c;

    public Triangle(Vertex a, Vertex b, Vertex c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){
        a = new Vertex(0,5);
        b = new Vertex(-5, 0);
        c = new Vertex(5, 0);
    }

    @Override
    public String toString(){
        return "A=" + a.toString() + ", B=" + b.toString() + ", C=" + c.toString();
    }

    public Vertex getA() {
        return a;
    }

    public void setA(Vertex a) {
        this.a = a;
    }

    public Vertex getB() {
        return b;
    }

    public void setB(Vertex b) {
        this.b = b;
    }

    public Vertex getC() {
        return c;
    }

    public void setC(Vertex c) {
        this.c = c;
    }
}
