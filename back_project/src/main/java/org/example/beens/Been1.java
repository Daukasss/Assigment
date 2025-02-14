package org.example.beens;


import org.example.config.Bean1Config;
import org.springframework.context.annotation.Bean;

public class Been1 {
    private String name;
    private String jodTitle;
    private int age;
    private int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJodTitle() {
        return jodTitle;
    }

    public void setJodTitle(String jodTitle) {
        this.jodTitle = jodTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

