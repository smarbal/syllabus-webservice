package com.SoftwareQuality.Projet_syllabus;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import org.apache.tomcat.jni.Local;

import javax.print.Doc;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static com.SoftwareQuality.Projet_syllabus.ProjectSyllabusApplication.db;

public class Course {
    private  String id;
    private String name;
    private int teacher;
    private String UE;
    private String academic_year;
    private ArrayList<Document> documents = new ArrayList<>();

    /**
     * Constructor of the Course object
     * @param name course name
     * @param UE name of the UE of the course
     * @param academic_year current academic year
     * @param documents list of all documents included in the course
     */
    public Course(String name, int teacher,  String UE, String academic_year, ArrayList<Document> documents){
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.UE = UE;
        this.academic_year = academic_year;
        this.documents = documents;
    }
    //To delete
    public Course() {};

    //getters et setters

    public String getName() {
        return name;
    }


    public String getUE() {
        return UE;
    }

    public String getAcademic_year() {
        return academic_year;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUE(String UE) {
        this.UE = UE;
    }

    public void setAcademic_year(String academic_year) {
        this.academic_year = academic_year;
    }

    public void setSyllabi(ArrayList<Document> syllabi) {
        this.documents = syllabi;
    }

    public int getTeacher() {return teacher;}

    public void setTeacher(int teacher) {this.teacher = teacher;}
    //fin des getters et des setters
    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    /**
     * method to add a teacher to the course
    @param teacher teacher to add into the course's teachers list
     */

    /**
     * method to add a student to the course
     * @param student student to add into the course's students list
     */
    /**
     * method to add a syllabus to the course's syllabi list
     * @param document document to add into the course's syllabi list
     */
    public void addDocument(Document document) throws SQLException {
        this.documents.add(document);
        Statement stmt= db.con.createStatement();
        stmt.executeQuery("INSERT INTO `map_docu_course`(course, document) VALUES ("+this.id+","+document.getID()+";");
    }
    public void deleteDocument(Document document) throws SQLException {
        this.documents.remove(document);
        Statement stmt= db.con.createStatement();
        stmt.executeQuery("DELETE FROM `map_docu_course` WHERE documentId="+document.getID()+";");
    }

    public void fetchDocuments() throws SQLException {
        ArrayList <Document> result = new ArrayList<Document>();
        Statement stmt= db.con.createStatement();
        ResultSet rs = stmt.executeQuery( "SELECT * from `map_docu_course` m INNER JOIN document d ON m.document = d.documentId WHERE course="+this.id+";" );
        ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
        while (rs.next()) {
            String name = rs.getString("name");
            String author = rs.getString("author");
            String version = rs.getString("version");
            LocalDate date = LocalDate.parse(rs.getString("publishDate"), DateTimeFormatter.BASIC_ISO_DATE);
            int pages = rs.getInt("pages");
            float price =rs.getFloat("price");
            Document document = new Document(name, author, date, pages, version, price);
            System.out.println(document.getPublish_date());
            this.documents.add(document);
        }
    }



}
