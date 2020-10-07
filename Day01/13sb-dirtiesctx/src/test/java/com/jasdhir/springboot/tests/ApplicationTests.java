package com.jasdhir.springboot.tests;

import com.jasdhir.springboot.tests.repo.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class ApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testMethod1() {
        studentRepository.addStudent("Jasdhir");
        studentRepository.printAllStudents(); //[Jasdhir]
        assertEquals(1, studentRepository.getAllStudents().size());
    }

    @Test
    public void testMethod2() {
        studentRepository.addStudent("Rajesh");
        studentRepository.printAllStudents(); //[Jasdhir, Rajesh]
        assertEquals(2, studentRepository.getAllStudents().size());
    }

  // @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    @Test
    public void testMethod3() {
        studentRepository.addStudent("Kamal");
        studentRepository.printAllStudents(); //[Kamal]
        assertEquals(1, studentRepository.getAllStudents().size());
    }

    @DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD)
    @Test
    public void testMethod4() {
        studentRepository.addStudent("Ravi");
        studentRepository.printAllStudents(); //[Kamal, Ravi]
        assertEquals(2, studentRepository.getAllStudents().size());
    }

    @Test
    public void testMethod5() {
        studentRepository.printAllStudents(); //[]
        assertEquals(0, studentRepository.getAllStudents().size());
    }

}
