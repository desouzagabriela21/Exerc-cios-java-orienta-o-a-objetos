import java.util.Scanner;
 
// criar classe
public class Triangulo{

    //definir atributos (carateristicas campos/variaveis)
    double ladoA;
    double ladoB;
    double ladoC;

    //Metodos (ação e comportamento)
    public double area(){
        double p = (ladoA + ladoB + ladoC) / 2.0;
        double area = Math.sqrt(p * (p-ladoA) * (p-ladoB) * (p-ladoC));
        return area;
    }

    }
