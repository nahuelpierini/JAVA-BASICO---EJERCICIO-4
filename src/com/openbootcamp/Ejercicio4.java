package com.openbootcamp;

public class Ejercicio4 {
  public static void main(String[] args) {

    int i;

    String[] nombres = {"Juan","Pedro","Marco","Roberto","Luca"};
    String nombre = nombres[0];

    for(i=1;i<nombres.length;i++){
        nombre += " " + nombres[i];

    }
    System.out.println(nombre);

}
}
