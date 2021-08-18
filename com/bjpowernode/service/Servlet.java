package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("test");
        Student s1 = new Student(001,"zs",23);
        Student s2 = new Student(002,"ls",24);

       //{"id":"?","name":"?"."age":"?"}
        //{"s1":{"id":"?","name":"?","age":"?"},"s2":{"id":"?","name":"?","age":?}}
        String str ="{\"s1\":{\"id\":\""+s1.getId()
                +"\",\"name\":\""+s1.getName()
                +"\",\"age\":\""+s1.getAge()
                +"\"},\"s2\":{\"id\":\""+s2.getId()
                +"\",\"name\":\""+s2.getName()
                +"\",\"age\":"+s2.getAge()+"}}";

        PrintWriter out = response.getWriter();
        out.print(str);
        out.flush();
        out.close();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
