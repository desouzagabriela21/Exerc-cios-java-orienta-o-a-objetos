import java.util.Scanner;

public class ProgramStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student estudante = new Student();

        System.out.print("Nome: ");
        estudante.name = scanner.nextLine();
        System.out.print("Grade 1: ");
        estudante.grade1 = scanner.nextDouble();
        System.out.print("Grade 2: ");
        estudante.grade2 = scanner.nextDouble();
        System.out.print("Grade 3: ");
        estudante.grade3 = scanner.nextDouble();

        double gradeFinal = estudante.finalGrade();
        System.out.printf("Grade final: %.2f",gradeFinal);

        if(gradeFinal >= 60){
        System.out.println("\nAprovado!");
        }
        else {
        System.out.println("\nReprovado!");
        double pontosFaltantes = estudante.missingPoints();
        System.out.printf("Pontos faltantes:  %.2f",pontosFaltantes);

        }

    }
}