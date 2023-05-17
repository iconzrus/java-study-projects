package com.yuriybishel.model;

public class Plant {
    private String name;
    private String color;
    private int countStems;
    private int lifetime;
    private double cost;
    private Size size = new Size(); //TODO тут вызвать конструктор дефолтный для Size

    public Plant() {
    }

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Plant(String name, String color, int countStems) {
        this.name = name;
        this.color = color;
        this.countStems = countStems;
    }
    //TODO написать конструктор который принимает все параметры что есть в полях, проинициализировать

    public Plant(String name, String color, int countStems, int lifetime, double cost, Size size) {
        this.name = name;
        this.color = color;
        this.countStems = countStems;
        this.lifetime = lifetime;
        this.cost = cost;
        this.size = size;
    }

    public int changeStem(int n) {
        this.countStems += n;
        return this.countStems;
    }

    //TODO геттер автосгенерировать , название с малой буквы
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", countStems=" + countStems +
                ", lifetime=" + lifetime +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }
}
