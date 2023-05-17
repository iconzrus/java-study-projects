package com.yuriybishel.program;

import com.yuriybishel.model.Point;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        Point a = new Point(3,3);
        Point b = new Point(11,11);
        Point k = new Point(11,11);
        Point c = new Point(5,5);
        Point m = new Point (7,7);

        double o = a.dist();
        double g = b.dist();
        double l = k.dist();
        double h = c.dist();

        System.out.println(o);
        System.out.println(g);
        System.out.println(l);
        System.out.println(h);

        Point[] x = {a ,b ,c, k, m};

        Point point = Point.maxDistPoint(x);
        System.out.println(point);

        ArrayList<Point> points = Point.maxDistPoints(x);
        System.out.println(points);

        Point centerMass = Point.centerMass(x);
        System.out.println(centerMass);

        double setDiam = Point.setDiam(x);
        System.out.println(setDiam);

        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        Point sum = a.sum(b);
        System.out.println(sum);



    }
}