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


    private Pacient(String fullName, String gender){
        this.fullName = fullName;
        this.gender = gender;
        this.age = 18;
        this.address = "";

    }

    public static Pacient make(String fullName, String gender){
        return new Pacient(fullName, gender);
    }
    public Pacient build(){
        return this;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


    public String getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

    public Pacient setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Pacient setAddress(String address) {
        this.address = address;return this;
    }

    public String getPhone() {
        return phone;
    }

    public Pacient setPhone(String phone) {
        this.phone = phone;return this;
    }

    public String getEmail() {
        return email;
    }

    public Pacient setEmail(String email) {
        this.email = email;return this;
    }

    public String getDescription() {
        return description;
    }

    public Pacient setDescription(String description) {
        this.description = description;return this;
    }

    public String getAllergies() {
        return allergies;
    }

    public Pacient setAllergies(String allergies) {
        this.allergies = allergies;return this;
    }


}
