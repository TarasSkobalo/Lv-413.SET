package com.softserve.set.homework.n6_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Student {

    private String name;
    private Integer courseNumb;
    private static List<Student> students2 = new ArrayList<Student>();

    public Student(String name, Integer courseNumb) {
        this.name = name;
        this.courseNumb = courseNumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourseNumb() {
        return courseNumb;
    }

    public void setCourseNumb(Integer courseNumb) {
        this.courseNumb = courseNumb;
    }

    // Printing students with course number you enter
    public static void printStudents(List<Student> students, Integer course) {
        ListIterator<Student> litr = students.listIterator();

        while (litr.hasNext()) {
            Student element = (Student) litr.next();
            if ((element.getCourseNumb().equals(course))) {
                students2.add(element);
            }
        }
        if (students2.isEmpty()) {
            System.out.println("No such course number :-(");
        } else {
            System.out.println(students2);
        }
    }

    @Override
    public String toString() {
        return "Student name: " + name + " | Course: " + courseNumb;
    }

    // Comparator by Name
    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String StudentName1 = s1.getName().toUpperCase();
            String StudentName2 = s2.getName().toUpperCase();

            return StudentName1.compareTo(StudentName2);
        }
    };

    // Comparator by Course number
    public static Comparator<Student> StuCoursComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            Integer StudentName1 = s1.getCourseNumb();
            Integer StudentName2 = s2.getCourseNumb();

            return StudentName1.compareTo(StudentName2);
        }
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Put course number you need: ");

        int putCourse = Integer.parseInt(br.readLine());
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Taras", 5));
        students.add(new Student("Yurii", 2));
        students.add(new Student("Alex", 3));
        students.add(new Student("Orest", 4));
        students.add(new Student("Yarik", 2));
        students.add(new Student("Yurii", 4));

        //  Method printStudents
        Student.printStudents(students, putCourse);
        System.out.println();

        System.out.println("Sorting students by name: ");
        Collections.sort(students, Student.StuNameComparator);
        for (Student str : students) {
            System.out.println(str);
        }
        System.out.println();
        System.out.println("Sorting students by cours number: ");
        Collections.sort(students, Student.StuCoursComparator);
        for (Student str : students) {
            System.out.println(str);
        }

    }
}
