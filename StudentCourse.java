import java.util.Scanner;

class Student {
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;
    Student(String name, int roll, double m, String course, int credits) {
        studentName = name;
        rollNumber = roll;
        marks = m;
        courseName = course;
        courseCredits = credits;
    }

    double calculateFee() {
        return courseCredits * 1500;
    }

    boolean checkEligibility() {
        return marks >= 50;
    }

    double calculateScholarship() {
        if (marks >= 85)
            return 20;
        else if (marks >= 70)
            return 10;
        else
            return 0;
    }

    double calculateFinalFee() {
        double fee = calculateFee();
        double scholarship = calculateScholarship();

        return fee - (fee * scholarship / 100);
    }

    void displayDetails() {
        double fee = calculateFee();
        double scholarship = calculateScholarship();
        double scholarshipAmount = fee * scholarship / 100;
        double finalFee = calculateFinalFee();

        System.out.println("\nStudent Course Registration Details ");
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Fee: Rs. " + fee);
        System.out.println("Scholarship: " + scholarship + "%");
        System.out.println("Scholarship Amount: Rs. " + scholarshipAmount);
        System.out.println("Final Fee: Rs. " + finalFee);
    }
}

public class StudentCourse {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scn.nextLine();

        System.out.print("Enter roll number: ");
        int roll = scn.nextInt();

        System.out.print("Enter marks: ");
        double m = scn.nextDouble();

        scn.nextLine();

        System.out.print("Enter course name: ");
        String course = scn.nextLine();

        System.out.print("Enter course credits: ");
        int credits = scn.nextInt();

        Student s = new Student(name, roll, m, course, credits);

        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("Student is not eligible for course registration");
        }

        scn.close();
    }
}