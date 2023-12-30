package src;
public class Student {
    private final String firstName;
    private final String secondName;
    private final int age;
    private final double averageGrade;
    public Student(String firstName, String secondName, int age, double averageGrade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.averageGrade = averageGrade;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public int getAge(){
        return this.age;
    }
    public double getAverageGrade(){
        return this.averageGrade;
    }

}