package com.yuriybishel.model;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.Math.sqrt;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point sum(Point point) {
        return new Point(this.x + point.x, this.y + point.y);
    }

    public Point mult(Point point, int k) {
        return new Point(point.x * k, point.y * k);
    }

    public Point division(int k) {
        return new Point(this.x / k, this.y / k);
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getX(Point point) {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY(Point point) {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * напишите и используйте дополнительный метод dist, который возвращает расстояние от точки до начала координат
     */
    public double dist() {
        return Math.hypot(this.x, this.y);
    }

    public double dist(Point other) {
        double a = (Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
        return (int) sqrt(a);
    }

    /**
     * Вычислить точку, наиболее удаленную от начала координат.
     * Для решения этой задачи напишите и используйте дополнительный метод dist, который возвращает расстояние
     * от точки до начала координат. Если таких точек несколько, то вернуть последнюю, удовлетворяющую условиям задачи
     */

    public static Point maxDistPoint(Point[] points) {
        double max = 0;
        Point res = new Point();
        for (Point point : points) {
            if (point.dist() > max) {
                max = point.dist();
                res = point;
            }
        }
        return res;
    }

    /**
     * Вычислить точки, наиболее удаленные от начала координат.
     */
    public static ArrayList<Point> maxDistPoints(Point[] points) {
        Point max = maxDistPoint(points);
        ArrayList<Point> res = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            if (points[i].dist() == max.dist()) {
                res.add(points[i]);
            }
        }
        return res;
    }

    /**
     * Вычислите точку, являющуюся центом масс данного множества точек, т.е. точку, которая имеет в качестве
     * своих координат среднее арифметическое по х и у.
     */
    public static Point centerMass(Point[] points) {
        Point res = new Point();
        for (Point point : points) {
            res = res.sum(point);
        }
        return res.division(points.length);
    }

    /**
     * Выведите диаметр данного множества – максимальное расстояние между двумя данными точками. Для решения этой
     * задачи реализуйте и используйте перегрузку метода dist, который принимает на вход вторую точку и
     * возвращает расстояние между двумя данными точками.
     */
    public static double setDiam(Point[] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (points[i].dist(points[j]) > max) {
                    max = points[i].dist(points[j]);
                }
            }
        }
        return max;
    }

    /**
     * Определите для точек метод сравнения compareTo, реализовав интерфейс Comparable,
     * сравнивающий точки по значению расстояния от начала координат. Отсортируйте данные точки в
     * порядке возрастания расстояния от начала координат, используя метод sort из класса Arrays.
     */
    public int compareTo(Point o) {
        return Double.compare(this.dist(), o.dist());
    }

    /**
     * Среди данных точек найдите три точки, образующие треугольник с наибольшим периметром. Выведите данный периметр.
     * Для нахождения периметра треугольника напишите отдельный метод perimeter, возвращающий периметр между тремя данными точками.
     */
    public double perimeter(Point o1, Point o2) {
        double a = this.dist(o1);
        double b = this.dist(o2);
        double c = o1.dist(o2);
        return a + b + c;
    }

    public double maxPerimeter(Point[] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if (points[i].perimeter(points[j], points[k]) > max) {
                        max = points[i].perimeter(points[j], points[k]);
                    }
                }
            }
        }
        return max;
    }

    /**
     * Среди данных точек найдите три точки, образующие треугольник с наибольшей площадью. Выведите данную площадь.
     * Для нахождения площади треугольника напишите отдельный метод area.
     */

    public double area(Point o1, Point o2) {
        double a = this.dist(o1);
        double b = this.dist(o2);
        double c = o1.dist(o2);
        double p = this.perimeter(o1, o2) / 2;
        double res = p * (p - a) * (p - b) * (p - c);
        return sqrt(res);
    }

    public double maxArea(Point[] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if (points[i].area(points[j], points[k]) > max) {
                        max = points[i].area(points[j], points[k]);
                    }
                }
            }
        }
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
