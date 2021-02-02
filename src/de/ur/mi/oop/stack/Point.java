package de.ur.mi.oop.stack;

public class Point {

    private int px;
    private int py;

    public Point(int x, int y) {
        px = x;
        py = y;
    }

    public void move(int dx, int dy) {
        px += dx;
        py += dy;
    }

}
