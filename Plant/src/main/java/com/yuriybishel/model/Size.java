package com.yuriybishel.model;

public class Size {
    private double length;
    private double height;
    private double perimeter;

    public Size() {
    }

    public Size(double length, double height) {
        this.length = length;
        this.height = height;
        this.setPerimeter();
    }

    //TODO вызвать данный setter в конструкторе
    // и во всех методах где изменяется длина или высота
    private void setPerimeter() {
        this.perimeter = 2 * (this.height + this.length);
    }

    //TODO getters, setters для всех полей кроме length, height

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    //TODO getter для perimeter
}
