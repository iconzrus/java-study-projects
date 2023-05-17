package com.yuriybishel.program;

import com.yuriybishel.model.Galaxy;
import com.yuriybishel.model.Planet;
import com.yuriybishel.model.Universe;

import java.util.Arrays;
import java.util.Timer;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Planet a = new Planet("Saturn", 20, 50);
        Planet b = new Planet("Mars", 100, 200);
        Galaxy c = new Galaxy("C-314");
        c.add(a);
        c.add(b);

        System.out.println(c);
        String behaviour = c.behaviour();
        System.out.println(behaviour);
        Planet search = c.search("Saturn");
        System.out.println(search);
        int search1 = c.search(b);
        System.out.println(search1);
        /*c.delete("Saturn");*/
        System.out.println(c);
        /*c.delete(b);*/
        System.out.println(c);
        Universe universe = new Universe("BBB");
        universe.addGalaxy(c);
        System.out.println(universe);
        System.out.println(universe.searchGalaxy("C-314"));
        Planet saturn = universe.searchPlanet("Saturn");
        System.out.println(saturn);
        int[] ints = universe.searchPlanet(a);
        System.out.println(Arrays.toString(ints));

        Universe universe2 = new Universe();
        universe2.behaviour();

        System.out.println(universe2);
    }
}