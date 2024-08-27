package com.pruebaJPA.demo;

public class temporal {
    /**
     * Returns the sum of two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of the two numbers
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        temporal temp = new temporal();
        System.out.println(temp.sumar(1, 2));
    }
}
