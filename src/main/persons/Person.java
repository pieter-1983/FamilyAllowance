package main.persons;

import java.time.LocalDate;

/**
 * Created by pieterst on 18/01/2017.
 */
public abstract class Person {
    private String name;
    private LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
