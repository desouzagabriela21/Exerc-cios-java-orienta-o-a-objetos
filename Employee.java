public class Employee {

    //atributos
    public String name;
    public double glossSalary;
    public double tax;

    // metodos 
    public double netSalary(){
        return glossSalary - tax;
    }

    public void incraseSalary(double percentage){
        glossSalary += glossSalary * percentage / 100.0;
    }

    public String toString(){
        // pode substituir printf
        return name + ", $"+String.format("%.2f", netSalary());
    }
}
