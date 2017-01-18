package main.persons.order;

/**
 * Created by pieterst on 18/01/2017.
 */
public class FirstChild extends FamilyOrder {

    private static final double BASIC_ALLOWANCE = 92.09;
    private static FirstChild onlyInstance = new FirstChild();

    private FirstChild(){
        super(BASIC_ALLOWANCE);
    }

    public static FirstChild getInstance(){
        return onlyInstance;
    }
}
