package models;

import java.util.ArrayList;

public class Shape {

    // container of points
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    // adds point to the shape
    public void addPoint(Point p) {
        points.add(p);
    }

    // calculates perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0;

        if (points.size() < 2) {
            return 0;
        }

        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += points.get(i).distance(points.get(i + 1));
        }

        // close the shape (last point to first)
        perimeter += points.get(points.size() - 1).distance(points.get(0));

        return perimeter;
    }

    // returns the longest side
    public double getLongestSide() {
        double max = 0;

        if (points.size() < 2) {
            return 0;
        }

        for (int i = 0; i < points.size() - 1; i++) {
            double dist = points.get(i).distance(points.get(i + 1));
            if (dist > max) {
                max = dist;
            }
        }

        // check last to first
        double lastDist = points.get(points.size() - 1).distance(points.get(0));
        if (lastDist > max) {
            max = lastDist;
        }

        return max;
    }

    // returns average side length
    public double getAverageSide() {
        if (points.size() < 2) {
            return 0;
        }

        int sides = points.size();
        return calculatePerimeter() / sides;
    }
}

