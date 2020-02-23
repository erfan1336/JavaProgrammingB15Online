package OffieHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String studentName;

    public Student(String studentName){
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return studentName;
    }
}

class School{
    String schoolName;
    List<Student> AllStudentList;

    public School(String schoolName, List<Student> AllStudentList){
        this.schoolName = schoolName;
        this.AllStudentList = AllStudentList;
    }

    public void AddNewStudent(Student student){
        this.AllStudentList.add(student);
    }

    public void AddNewStudent(Student[] students){
        this.AllStudentList.addAll(Arrays.asList(students));
    }

    public void AddNewStudent(List<Student> listOfStudents){
        this.AllStudentList.addAll(listOfStudents);
    }

    @Override
    public String toString(){
        return ""+AllStudentList;
    }

}

public class AssociationExample {

    public static void main(String[] args) {
        Student s1 = new Student("Hasan");
        System.out.println(s1);
        Student s2 = new Student("Muge");
        Student s3 = new Student("Aiko");
        Student s4 = new Student("Sumeyya");
        Student s5 = new Student("Parvin");

        List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println(list);

        School cybertek = new School("cybertek",list);
        //cybertek.AddNewStudent("Irina",list);
        System.out.println(cybertek.AllStudentList);
        System.out.println(cybertek.schoolName);

        Student[] students = {
                new Student("Gulnaz"),
                new Student("Rukshona"),

        };
        cybertek.AddNewStudent(students);

        System.out.println("cybertek.AllStudentList = " + cybertek.AllStudentList);

        for (Student eachStudent : cybertek.AllStudentList ){
            System.out.println(eachStudent);
        }

        System.out.println(cybertek);


    }
}
