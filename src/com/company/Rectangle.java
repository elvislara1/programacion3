package com.company;

public class Rectangle extends Figure{
    private float length, width;

    public float getArea(Figure other)
    {
        return length * width;
    }

    @Override
    public float getArea() {
        return 0;
    }
}