package com.vs.gestioncontactapp;

public class Contact
{
    private String name;
    private String firstname;
    private String birthDate;
    private int picture;


    private boolean isClicked;

    Contact(String pName, String pFirstName, String pBirthDate, int pPicture)
    {
        name = pName;
        firstname = pFirstName;
        birthDate = pBirthDate;
        picture = pPicture;
        isClicked = false;
    }
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", picture=" + picture +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public int getPicture() {
        return picture;
    }
    public void setPicture(int picture) {
        this.picture = picture;
    }
    public boolean isClicked() {return isClicked;}
    public void setClicked(boolean clicked) {isClicked = clicked;}

}
