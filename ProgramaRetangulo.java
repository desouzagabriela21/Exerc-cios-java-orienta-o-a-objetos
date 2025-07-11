import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Informe a altura do retângulo: ");
        retangulo.altura = scanner.nextDouble();
        System.out.print("Informe a largura do retângulo: ");
        retangulo.largura = scanner.nextDouble();

        double area = retangulo.Area();
        double perimetro = retangulo.Perimetro();
        double diagonal = retangulo.Diagonal();

        System.out.printf("\nArea:  %.2f",area);
        System.out.printf("\nPerímetro:  %.2f",perimetro);
        System.out.printf("\nDiagonal: %.2f", diagonal);

    }

}

