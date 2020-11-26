package com.example.tournament;

import com.example.tournament.resources.IDGenerator;

import java.util.Date;
import java.util.List;

public class Tournament{

    public Tournament(String name, Date startDate, User manager, Registration registration){
        id = idGenerator.generateID();
        this.name = name;
        this.startDate = (Date) startDate.clone();
        this.manager = manager;
        this.registration = registration;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = (Date) startDate.clone();
    }

    public User getManager(){
        return manager;
    }

    public void setManager(User manager){
        this.manager = manager;
    }

    public Registration getRegistration(){
        return registration;
    }

    public void setRegistration(Registration registration){
        this.registration = registration;
    }

    private String id, name;
    private Date startDate;
    private User manager;
    private Registration registration;
    private IDGenerator idGenerator = IDGenerator.getInstance();
}
