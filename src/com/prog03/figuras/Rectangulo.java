package com.prog03.figuras;

public class Rectangulo {

    //Declare atributos para la base y la altura de un rectángulo.
    public int base;
    public int altura;
    //Declare un constructor vacío que inicialice los atributos a 0.

    public Rectangulo() {
        base = 0;
        altura = 0;
    }
    //Declara un constructor que inicialice base y altura.

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getArea (int base, int altura)
    {
        int area = base*altura;
        return area;
    }        
}