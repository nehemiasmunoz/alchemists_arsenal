package com.marvic.alchemists_arsenal.model;


public class Pacient {
    private long id;
    private String fullName;
    private String gender;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String allergies;

    public Pacient() {}

    public Pacient(String fullName, String gender, int age, String address, String phone, String email, String description, String allergies) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.description = description;
        this.allergies = allergies;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }


}
