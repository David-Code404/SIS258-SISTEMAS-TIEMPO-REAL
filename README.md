CURSO COMPLETO DE JAVA EN NETBEANS



1.- Instalar NetBeans y JDK

Descarga e instala JDK (Java Development Kit) desde Oracle
 o OpenJDK.

Descarga e instala NetBeans IDE desde NetBeans
.
Abre NetBeans y asegúrate de que reconoce tu JDK (en Tools → Java Platforms).

2.- Crear un nuevo proyecto en NetBeans

Abre NetBeans.

Menú: File → New Project → Java → Java Application → Next

Ponle nombre: HolaMundo

Marca Create Main Class si no está marcado, y asegúrate que el nombre sea holamundo.HolaMundo

Clic en Finish


MÓDULO 3: Estructuras de Control
Concepto general

Las estructuras de control permiten que un programa:

Ejecute código dependiendo de condiciones (condicionales)

Repita código varias veces (repetitivas)

Se dividen en:

Condicionales: if, else if, else, switch

Repetitivas: for, while, do-while

Control de flujo dentro de bucles: break y continue

1. Estructuras condicionales
if, else if, else

Evalúa condiciones booleanas (true/false) y ejecuta bloques de código según corresponda.

Sintaxis:

if (condición) {
    // código si condición verdadera
} else if (otraCondición) {
    // código si segunda condición verdadera
} else {
    // código si ninguna condición es verdadera
}


Ejemplo completo:

import java.util.Scanner;

public class CondicionalIf {
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


Teoría:

&& → operador AND (y lógico)

|| → operador OR (o lógico)

! → operador NOT (negación)

switch

Evalúa una variable y ejecuta el caso que coincida.

Sintaxis:

switch (variable) {
    case valor1:
        // instrucciones
        break;
    case valor2:
        // instrucciones
        break;
    default:
        // instrucciones si ningún caso coincide
}


Ejemplo:

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número inválido");
        }
    }
}


Nota: Siempre usar break para evitar la ejecución de casos posteriores.

2. Estructuras repetitivas
for

Ideal cuando sabemos cuántas veces se ejecutará el bucle.

for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}

while

Se ejecuta mientras la condición sea verdadera.

int i = 1;
while (i <= 5) {
    System.out.println("Contador: " + i);
    i++;
}

do-while

Se ejecuta al menos una vez, luego verifica la condición.

int i = 1;
do {
    System.out.println("Iteración: " + i);
    i++;
} while (i <= 5);

break y continue

break → termina el bucle

continue → salta la iteración actual

for (int i = 1; i <= 10; i++) {
    if (i == 5) continue;
    if (i == 8) break;
    System.out.println(i);
}

MÓDULO 4: Arreglos y Colecciones
Concepto

Arreglos: estructura fija para almacenar elementos del mismo tipo

Colecciones: clases que permiten manipular datos dinámicamente

1. Arreglos unidimensionales
int[] numeros = {10, 20, 30, 40};
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento " + i + ": " + numeros[i]);
}

2. Arreglos bidimensionales (matrices)
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6}
};

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}

3. Recorrer arreglos con foreach
String[] nombres = {"Ana", "Luis", "Pedro"};
for (String nombre : nombres) {
    System.out.println(nombre);
}

4. Clases de colecciones
ArrayList
import java.util.ArrayList;
ArrayList<String> lista = new ArrayList<>();
lista.add("Java");
lista.add("Python");
System.out.println(lista);

LinkedList
import java.util.LinkedList;
LinkedList<String> cola = new LinkedList<>();
cola.add("A");
cola.add("B");
System.out.println(cola);

HashSet
import java.util.HashSet;
HashSet<Integer> conjunto = new HashSet<>();
conjunto.add(10);
conjunto.add(20);
conjunto.add(10); // no se repite
System.out.println(conjunto);

HashMap
import java.util.HashMap;
HashMap<String, Integer> mapa = new HashMap<>();
mapa.put("Ana", 25);
mapa.put("Luis", 30);
System.out.println(mapa.get("Luis"));

MÓDULO 5: Funciones y Métodos
1. Concepto

Un método es un bloque de código que realiza una acción. Puede recibir parámetros y devolver valores.

2. Sintaxis
public static tipoRetorno nombreMetodo(parametros) {
    // código
    return valor; // si no es void
}

3. Ejemplos
Método void
public static void saludar() {
    System.out.println("Hola!");
}

Método con retorno
public static int sumar(int a, int b) {
    return a + b;
}

Sobrecarga
public static int sumar(int a, int b) { return a + b; }
public static double sumar(double a, double b) { return a + b; }

Variables locales y globales
public class Ejemplo {
    int global = 10; // global
    public void mostrar() {
        int local = 5; // local
        System.out.println(global + local);
    }
}

Paso de parámetros por valor
public static void cambiar(int n) { n = 50; }
public static void main(String[] args) {
    int valor = 10;
    cambiar(valor);
    System.out.println(valor); // sigue siendo 10
}

MÓDULO 6: Programación Orientada a Objetos (POO)
1. Conceptos básicos

Clase: plantilla

Objeto: instancia

Atributo: variable de clase

Método: función de clase

2. Creación de clases y objetos
public class Persona {
    String nombre;
    int edad;
    void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
Persona p = new Persona();
p.nombre = "David";
p.edad = 20;
p.saludar();

3. Constructores
public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
}

4. Modificadores de acceso

public: accesible desde cualquier lugar

private: accesible solo dentro de la clase

protected: accesible desde subclases y mismo paquete

5. Encapsulamiento
private String nombre;
public void setNombre(String n) { nombre = n; }
public String getNombre() { return nombre; }

6. Herencia
class Animal { void sonido() { System.out.println("Sonido"); } }
class Perro extends Animal { void sonido() { System.out.println("Guau"); } }

7. Polimorfismo
Animal a = new Perro();
a.sonido(); // imprime "Guau"

8. Clases abstractas e interfaces
abstract class Figura { abstract void dibujar(); }
class Circulo extends Figura { void dibujar() { System.out.println("Círculo"); } }

interface Animal { void sonido(); }
class Gato implements Animal { public void sonido() { System.out.println("Miau"); } }

9. Sobreescritura (@Override)
class Vehiculo { void mover() { System.out.println("Vehículo"); } }
class Auto extends Vehiculo { @Override void mover() { System.out.println("Auto"); } }

MÓDULO 7: Manejo de Excepciones y Archivos
1. Tipos de errores

Compilación: errores de sintaxis

Ejecución: errores durante la ejecución

Lógicos: resultado incorrecto sin error de compilación

2. try-catch-finally
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: División por cero");
} finally {
    System.out.println("Bloque finally ejecutado");
}
