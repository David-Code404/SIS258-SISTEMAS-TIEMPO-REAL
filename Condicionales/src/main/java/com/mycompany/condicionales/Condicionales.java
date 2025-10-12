/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionales;
import java.util.Scanner;
/**
 *
 * @author David-Code
 */
public class Condicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres adulto mayor");
        }
    }
}
