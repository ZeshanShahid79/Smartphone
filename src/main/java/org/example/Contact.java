package org.example;

public abstract class Contact {


    private String name;

    public Contact(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
