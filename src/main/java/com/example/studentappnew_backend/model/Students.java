package com.example.studentappnew_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String adno;
    private int rollno;
    private String college;

    public Students() {
    }

    public Students(int id, String name, String adno, int rollno, String college) {
        this.id = id;
        this.name = name;
        this.adno = adno;
        this.rollno = rollno;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdno() {
        return adno;
    }

    public void setAdno(String adno) {
        this.adno = adno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
