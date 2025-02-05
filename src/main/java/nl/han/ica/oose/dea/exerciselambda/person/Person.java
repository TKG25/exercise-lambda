package nl.han.ica.oose.dea.exerciselambda.person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isGender(Gender g) {
        return gender.equals(g);
    }

    public boolean isAdult(int adultMinAge) {
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthDate, now);
        return age.getYears() >= adultMinAge;
    }

}
