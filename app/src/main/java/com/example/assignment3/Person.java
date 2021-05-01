package com.example.assignment3;

import android.widget.ImageView;

public class Person {
    String fName;
    String PrefName;
    String contactNumber;

    public Person() {
    }

    public Person(String fName, String PrefName, String contactNumber) {
        this.fName = fName;
        this.PrefName = PrefName;
        this.contactNumber = contactNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getPrefName() {
        return PrefName;
    }

    public void setlName(String PrefName) {
        this.PrefName = PrefName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", PrefName='" + PrefName + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
