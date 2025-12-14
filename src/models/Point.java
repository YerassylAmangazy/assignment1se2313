package models;

public class Point {
    private double x;
    private double y;

    // constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // distance from current point to destination point
    public double distance(Point dest) {
        return Math.sqrt(
                Math.pow(dest.x - this.x, 2) +
                Math.pow(dest.y - this.y, 2)
        );
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
