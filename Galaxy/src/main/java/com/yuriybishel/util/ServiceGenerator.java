package com.yuriybishel.util;

import com.yuriybishel.model.Galaxy;
import com.yuriybishel.model.Planet;

import java.util.ArrayList;

public class ServiceGenerator {
    public static int generateNumber(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }

    public static Planet generatePlanet() {
        return new Planet("P" + ServiceGenerator.generateNumber(100, 999));
    }

    public static Galaxy generateGalaxy() {
        Galaxy galaxy = new Galaxy("G" + ServiceGenerator.generateNumber(100, 999));
        int n = generateNumber(1, 5);
        for (int i = 0; i < n; i++) {
            galaxy.add(generatePlanet());
        }
        return galaxy;
    }

    public static ArrayList<Galaxy> generateGalaxies () {
        ArrayList<Galaxy> galaxies = new ArrayList<>();
        int n = generateNumber(1,5);
        for (int i = 0; i < n; i++) {
            galaxies.add(generateGalaxy());
        }
        return galaxies;
    }


}
