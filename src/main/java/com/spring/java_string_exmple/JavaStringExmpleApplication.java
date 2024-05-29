package com.spring.java_string_exmple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStringExmpleApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaStringExmpleApplication.class, args);
       String str ="Niva";
        str = str.concat("Patel");
        System.out.println(str);

        StringBuffer buffer = new StringBuffer();
        buffer.append("str");
        System.out.println("buffer: " + buffer);
    }

}
