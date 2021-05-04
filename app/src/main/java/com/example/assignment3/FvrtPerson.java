package com.example.assignment3;

import android.widget.ImageView;

public class FvrtPerson {
    String fName;
    String imgPref;

    public FvrtPerson() {
    }


    public FvrtPerson(String fName, String imgPref) {
        this.fName = fName;
        this.imgPref = imgPref;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getImgPref() {
        return imgPref;
    }

    public void setImg(String imgPref) {
        this.imgPref = imgPref;
    }

    @Override
    public String toString() {
        return "FvrtPerson{" +
                "fName='" + fName + '\'' +
                ", img=" + imgPref +
                '}';
    }
}
