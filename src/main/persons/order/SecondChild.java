package main.persons.order;

/**
 * Created by pieterst on 18/01/2017.
 */
public class SecondChild extends FamilyOrder {
    private static final double BASIC_ALLOWANCE = 170.39;
    private static SecondChild onlyInstance = new SecondChild();

    private SecondChild(){
        super(BASIC_ALLOWANCE);
    }

    public static SecondChild getInstance(){
        return onlyInstance;
    }
}
