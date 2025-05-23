/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo
 */
public class Retangulo extends FiguraGeometrica {

    private double x;
    private double y;

    public Retangulo() {
        this("", 0, 0);
    }

    public Retangulo(String cor, double x, double y) {
        super(cor);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getArea() {
        return (getX() * getY());
    }
}
