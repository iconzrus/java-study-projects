package com.yuriybishel.model;

import com.yuriybishel.util.ServiceGenerator;

import java.util.Objects;

public class Planet {
    private String name;
    private double radius;
    private int orbitalPeriod;

    public Planet() {
    }

    public Planet(String name) {
        this.name = name;
    }

    public Planet(String name, double radius, int orbitalPeriod) {
        this.name = name;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
    }

    public String behaviour() {
        return this.name + " " + this.rotationSpeed();
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double rotationSpeed() {
        return this.radius * 6.28;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(planet.radius, radius) == 0 && orbitalPeriod == planet.orbitalPeriod && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius, orbitalPeriod);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", orbitalPeriod=" + orbitalPeriod +
                '}';
    }
}
