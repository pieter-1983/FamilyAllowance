package main.persons;

import main.persons.workstate.Status;

import java.time.LocalDate;

/**
 * Created by pieterst on 18/01/2017.
 */
public class Parent extends Person {
    private Status workStatus;
    private boolean singleParent;
    private boolean disabledParent;

    public Parent(String name, LocalDate birthdate, Status workStatus) {
        super(name, birthdate);
        this.workStatus = workStatus;
    }

    public void setWorkStatus(Status workStatus) {
        this.workStatus = workStatus;
    }

    public Status getWorkStatus() {

        return workStatus;
    }

    public void setSingleParent(boolean singleParent) {
        this.singleParent = singleParent;
    }

    public boolean isSingleParent() {
        return singleParent;
    }

}
