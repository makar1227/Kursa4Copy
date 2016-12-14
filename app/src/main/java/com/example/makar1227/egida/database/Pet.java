package com.example.makar1227.egida.database;

/**
 * Created by makar1227 on 12/13/2016.
 */

public class Pet {
    private String Name;
    private String breed;
    private int size;
    private boolean sterile;
    private boolean gender; //mail-false
    private double age;
    private String phone;
    private String img;
    private String description;

    public Pet(String name, String breed, int size, boolean sterile, boolean gender, double age, String img, String description) {
        Name = name;
        this.breed = breed;
        this.size = size;
        this.sterile = sterile;
        this.gender = gender;
        this.age = age;
//        this.phone = phone;
        this.img = img;
        this.description = description;
    }

    public String getName() {
        return Name;
    }

    public String getBreed() {
        return breed;
    }

    public int getSize() {
        return size;
    }

    public boolean isSterile() {
        return sterile;
    }

    public boolean isGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getImg() {
        return img;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "Name='" + Name + '\'' +
                ", breed='" + breed + '\'' +
                ", size=" + size +
                ", sterile=" + sterile +
                ", gender=" + gender +
                ", age=" + age +
                ", img='" + img + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
