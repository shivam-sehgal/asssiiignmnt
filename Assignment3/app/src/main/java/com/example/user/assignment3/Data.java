package com.example.user.assignment3;

import android.graphics.Bitmap;

/**
 * Created by user on 3/30/2017.
 */

public class Data {

    private Bitmap imageID;
    private int position;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }



    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    private String dateofBirth;
    public Bitmap getImageID() {
        return imageID;
    }

    public void setImageID(Bitmap imageID) {
        this.imageID = imageID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
    public Data( Bitmap img,String first,String last,String dob,int position,String gender){
        this.imageID=img;
        this.dateofBirth=dob;
        this.firstName=first;
        this.lastName=last;
        this.position=position;
        this.gender=gender;
    }



}
