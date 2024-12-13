package com.marvic.alchemists_arsenal.model.patient;

import com.marvic.alchemists_arsenal.dtos.patient.PatientDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue
    private long id;
    private String fullName;
    private String gender;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String allergies;

    public Patient() {
    }

    public Patient(PatientDTO dto) {
        this.fullName = dto.fullName();
        this.gender = dto.gender();
        this.age = dto.age();
        this.address = dto.address();
        this.phone = dto.phone();
        this.email = dto.email();
        this.description = dto.description();
        this.allergies = dto.allergies();
    }

    private Patient(String fullName, String gender) {
        this.fullName = fullName;
        this.gender = gender;
        this.age = 18;
        this.address = "";

    }

    public static Patient make(String fullName, String gender) {
        return new Patient(fullName, gender);
    }

    public Patient build() {
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

    public Patient setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Patient setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Patient setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Patient setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Patient setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAllergies() {
        return allergies;
    }

    public Patient setAllergies(String allergies) {
        this.allergies = allergies;
        return this;
    }

    public PatientDTO toDto() {
        return new PatientDTO(
                this.fullName,
                this.gender,
                this.age,
                this.address,
                this.phone,
                this.email,
                this.description,
                this.allergies
        );
    }
}
