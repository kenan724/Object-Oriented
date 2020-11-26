package com.example.tournament.resources;

import java.util.UUID;

public class IDGenerator {

    private boolean checkUniqueness(String id){
        boolean unique = true;
        /* Code to check uniqueness from the database here */
        return unique;
    }

    public String generateID(){
        String id = UUID.randomUUID().toString();
        while(!checkUniqueness(id)){
            id = UUID.randomUUID().toString();
        }
        return id;
    }

    public static IDGenerator getInstance(){
        return instance;
    }

    private static IDGenerator instance = new IDGenerator();
}
