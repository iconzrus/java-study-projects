package com.yuriybishel.model;

import com.yuriybishel.util.ServiceGenerator;

import java.util.ArrayList;
import java.util.Objects;
public class Galaxy {
    private String name;
    private ArrayList<Planet> planets = new ArrayList<>();

    public Galaxy(String name) {
        this.name = name;
    }

    public Galaxy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String behaviour() {
        String res = "";
        for (Planet planet : this.planets) {
            String s = planet.behaviour();
            res += s + "\n";
        }
        return res;
    }

    public boolean add(Planet x) {
        if (this.planets.contains(x)) {
            return false;
        }
        this.planets.add(x);
        return true;
    }

    public Planet search(String name) {
        for (Planet planet : this.planets) {
            if (name.equals(planet.getName())) {
                return planet;
            }
        }
        return null;
    }

    public int search(Planet planet) {
        return this.planets.indexOf(planet);
    }

    public Planet delete(String name) {
        Planet search = this.search(name);
        if (search == null) {
            return null;
        }
        this.planets.remove(search);
        return search;
    }
    public boolean delete(Planet planet) {
        return this.planets.remove(planet);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galaxy galaxy = (Galaxy) o;
        return Objects.equals(name, galaxy.name) && Objects.equals(planets, galaxy.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planets);
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "name='" + name + '\'' +
                ", planets=" + planets +
                '}';
    }
}

