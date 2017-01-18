package main.persons;

import main.persons.order.FamilyOrder;
import main.persons.workstate.Status;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by pieterst on 18/01/2017.
 */
public class Child extends Person {
    private boolean orphan;
    private Parent parent;
    private FamilyOrder childOrder;

    public Child(String name, LocalDate birthdate, boolean orphan) {
        super(name, birthdate);
        this.orphan = orphan;
    }

    public Child(LocalDate birthdate, String name){
       this(name,birthdate,false);

    }
    public int getAge(){
        return Period.between(getBirthdate(),LocalDate.now()).getYears();

    }

    public boolean isOrphan() {
        return orphan;
    }

    public void setOrphan(boolean orphan) {
        this.orphan = orphan;
    }

    public Status getParentWorkStatus() {
        return parent.getWorkStatus();
    }

    public FamilyOrder getChildOrder() {
        return childOrder;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void setChildOrder(FamilyOrder childOrder) {
        this.childOrder = childOrder;
    }

    public boolean hasSingleParent(){return parent.isSingleParent();}
}
