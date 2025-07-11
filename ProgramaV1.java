import java.util.Scanner;

public class ProgramaV1 {

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
        double p1 = (triangulo1.ladoA + triangulo1.ladoB + triangulo1.ladoC) / 2;
        double areaTriangulo1 = Math.sqrt(p1 * (p1 - triangulo1.ladoA) * (p1 - triangulo1.ladoB) * (p1 - triangulo1.ladoC));

        // calcula a área do triangulo2
        double p2 = (triangulo2.ladoA + triangulo2.ladoB + triangulo2.ladoC) / 2;
        double areaTriangulo2 = Math.sqrt(p2 * (p2 - triangulo2.ladoA) * (p2 - triangulo2.ladoB) * (p2 - triangulo2.ladoC));

        System.out.printf("Area do triângulo 1: %.2f\n",areaTriangulo1);
        System.out.printf("Area do triângulo 2: %.2f",areaTriangulo2);

    }
}
