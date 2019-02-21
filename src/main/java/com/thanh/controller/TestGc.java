package com.thanh.controller;

import com.thanh.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/testGc")

public class TestGc {


    @GetMapping("/testGc")
    public void testtt() throws InterruptedException {
        var start = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            test();
            Thread.sleep(100);

        }
        System.out.println("done : " + (System.currentTimeMillis() - start));
    }

    public void test() throws InterruptedException {
        List<Student> student = new ArrayList<Student>();
        for (int i = 0; i < 1000000; i++) {
            student.add(new Student(i));
        }
        Thread.sleep(100);

    }
}

