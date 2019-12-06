package com.quinto.a4itb_11292019;

public class Student {
    String id, fname, lname, section;

    public Student(String id, String fname, String lname, String section) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.section = section;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getSection() {
        return section;
    }
}
