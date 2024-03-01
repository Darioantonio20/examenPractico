package com.examenpractico.app.models;

public class Person {
    private Long identifier;
    private String completeName;
    private int agePerson;

    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }
}
