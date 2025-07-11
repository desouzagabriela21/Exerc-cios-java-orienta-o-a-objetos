import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        /*Triangulo valido
        a + b > c
        a + c > b
        b + c > a */
        // cria o primeiro objeto
        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 10;
        triangulo1.ladoB = 15;
        triangulo1.ladoC = 20;

        // cria o segundo objeto
        Triangulo triangulo2 = new Triangulo();
        triangulo2.ladoA = 20;
        triangulo2.ladoB = 15;
        triangulo2.ladoC = 10;

        // calcula a área do triangulo1
        double areaTriangulo1 = triangulo1.area();

        // calcula a área do triangulo2
        double areaTriangulo2 = triangulo2.area();

        System.out.printf("Area do triângulo 1: %.2f\n",areaTriangulo1);
        System.out.printf("Area do triângulo 2: %.2f",areaTriangulo2);

    }
}
