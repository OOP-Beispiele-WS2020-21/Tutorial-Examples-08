package de.ur.mi.oop.stack;

public class App {

    public void init() {
            Point p1 = new Point(5, 4);
            Point p2 = new Point(2, 3);
            Line ln = new Line(p1, p2);
    }

    public static void main(String[] args) {
        App app = new App();
        app.init();
    }
}
