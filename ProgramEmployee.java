import java.util.Scanner;
public class ProgramEmployee{

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.println("Name: ");
        funcionario.name = scanner.nextLine();
        System.out.println("Gross Salary: ");
        funcionario.glossSalary = scanner.nextDouble();
        System.out.println("Tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.println("\nFuncionario: "+funcionario.name);
        System.out.println("Digite o percentual de aumento: ");
        double percentual = scanner.nextDouble();
        funcionario.incraseSalary(percentual);


        System.out.println("\nDados atualizados: "+funcionario);
        scanner.close();
    }
}