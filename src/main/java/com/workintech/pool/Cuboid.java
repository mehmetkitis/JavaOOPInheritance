package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return this.height * super.getArea();
    }
}
