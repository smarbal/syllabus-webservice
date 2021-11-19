package com.SoftwareQuality.Projet_syllabus;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private String UE;
    private ArrayList<Student> students;
    private String academic_year;
    private ArrayList<Document> syllabi;

    //constructeur
    public Course(String name, Teacher teacher, String UE, ArrayList<Student> students, String academic_year, ArrayList<Document> syllabi){
        this.name = name;
        this.teacher = teacher;
        this.UE = UE;
        this.students = students;
        this.academic_year = academic_year;
        this.syllabi = syllabi;
    }

    //getters et setters

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getUE() {
        return UE;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public ArrayList<Document> getSyllabi() {
        return syllabi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setUE(String UE) {
        this.UE = UE;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    public void setSyllabi(ArrayList<Document> syllabi) {
        this.syllabi = syllabi;
    }
    //fin des getters et des setters

}