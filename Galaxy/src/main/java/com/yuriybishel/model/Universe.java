package com.yuriybishel.model;

import com.yuriybishel.util.ServiceGenerator;

import java.util.ArrayList;
import java.util.Objects;

public class Universe {
    private String name;
    private ArrayList<Galaxy> galaxies = new ArrayList<>();

    public Universe() {
    }

    public Universe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGalaxy(Galaxy galaxy) {
        this.galaxies.add(galaxy);
    }

    public Galaxy searchGalaxy(String name) {
        for (Galaxy galaxy : this.galaxies) {
            if (name.equals(galaxy.getName())) {
                return galaxy;
            }
        }
        return null;
    }

    public int searchGalaxy (Galaxy galaxy) {
        return this.galaxies.indexOf(galaxy);
    }

    public Planet searchPlanet (String name){
        for (Galaxy galaxy : this.galaxies) {
            Planet search = galaxy.search(name);
            if (search != null) {
                return search;
            }
        }
        return null;
    }

    public int[] searchPlanet(Planet planet){
        for (int i = 0; i < this.galaxies.size(); i++) {
            Galaxy galaxy = this.galaxies.get(i);
            int search = galaxy.search(planet);
            if (search != -1) {
                return new int[]{i,search};
            }
        }
        return new int[]{};
    }

    /**
     * Метод поведение, определить как генерацию случайным образом раз в 30 секунд случайного количества
     * галактик со случайным числом планет, имена галактик и планет генерировать случайным образом
     * (реализовать для этого отдельный класс со специализирующими методами): имя планеты должно начинаться с
     * буквы Р, далее идет последовательность цифр, имя галактики аналогично, начиная с G.
     */

    public void behaviour() {
        while (true){
            ArrayList<Galaxy> galaxies1 = ServiceGenerator.generateGalaxies();
            this.galaxies.addAll(galaxies1);
            System.out.println(this);
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Universe universe = (Universe) o;
        return Objects.equals(name, universe.name) && Objects.equals(galaxies, universe.galaxies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, galaxies);
    }

    @Override
    public String toString() {
        return "Universe{" + "name='" + name + '\'' + ", galaxy=" + galaxies + '}';
    }
}
