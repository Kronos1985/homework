package lesson7.com.company.professions;

import homework.Person;

public class Driver extends Person {
    private int experience;

    public Driver(String fullname, int age, int experience) {
        super(fullname, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;

    }

}