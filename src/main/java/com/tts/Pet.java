package com.tts;



public class Pet {
    private String name;
    private int age;
    private String location;
    private String typeOfPet;

    public Pet(String name, int age, String location, String typeOfPet) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.typeOfPet = typeOfPet;
    }

    public Pet(String name, String typeOfPet) {
        this.name = name;
        this.typeOfPet = typeOfPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTypeOfPet() {
        return typeOfPet;
    }

    public void setTypeOfPet(String typeOfPet) {
        this.typeOfPet = typeOfPet;
    }

    public Pet() {
        name = "";
        age = 0;
        location = "";
        typeOfPet = "";
    }


}

