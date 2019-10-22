package by.ld.hw.classes.task7.bean;

public class Vertex {
    int x;// атрибуты доступа, equals, hashCode
    int y;

    public Vertex(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
