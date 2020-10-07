package com.jasdhir.springboot.tests.repo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepository {
    private List<String> students = new ArrayList<>();
    public void addStudent(String name) {
        students.add(name);
    }
    public List<String> getAllStudents() {
        return students;
    }
    public void printAllStudents() {
        System.out.println(students);
    }
}