package main.allowance;

import main.persons.Person;

import java.util.List;

/**
 * Created by pieterst on 18/01/2017.
 */
public interface Allowance {
    public final double BASIC_ORPHAN = 353.76;
    public final double BASIC_SELF_EMPLOYED_DAD = 61.79;
    public double calculateAllowance(List<Person> family);
   /* public void getFirstChild();
    public void getSecondChild();
    public void getNextChildren();



*/}
