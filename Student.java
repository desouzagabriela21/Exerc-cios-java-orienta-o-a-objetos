public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double finalGrade(){
        double finalGrade = grade1 + grade2 + grade3;
        return finalGrade;
    }

    public double missingPoints(){
        double finalGrade = finalGrade();
        double missingPoints = 60 - finalGrade;
        return missingPoints;
    }

}
