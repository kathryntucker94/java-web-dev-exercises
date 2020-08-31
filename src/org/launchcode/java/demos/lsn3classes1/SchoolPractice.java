package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student studentOne = new Student("Kathryn",1, 1,4.0);
        studentOne.addGrade(0, 3.0);
        System.out.println(studentOne.getGpa());
    }

}
