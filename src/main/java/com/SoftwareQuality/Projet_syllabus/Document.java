package com.SoftwareQuality.Projet_syllabus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Document {
    private String name;
    private ArrayList<String> author;
    private Date publish_date;
    private int pages;
    private String version;
    private String ID;
    /**
     * Constructor of Document object
     * @param name document name
     * @param author authors name
     * @param publish_date publish date
     * @param pages number of pages
     * @param version version of the syllabus
     */
    public Document(String name, ArrayList<String> author, Date publish_date, int pages,String version){
        this.name = name;
        this.author = author;
        this.publish_date = publish_date;
        this.pages = pages;
        this.version = version;
        this.ID = name + "_" + version;
    }

    //getters et setters de la classe
    public String getName() {
        return name;
    }
    public ArrayList<String> getAuthor() {
        return author;
    }
    public Date getPublish_date() {
        return publish_date;
    }
    public int getPages() {
        return pages;
    }
    public String getVersion() {
        return version;
    }
    public String getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(ArrayList<String> author) {
        this.author = author;
    }
    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    //fin des getters et setters
}
