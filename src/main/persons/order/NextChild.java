package main.persons.order;

/**
 * Created by pieterst on 18/01/2017.
 */
public class NextChild extends FamilyOrder {
    private static final double BASIC_ALLOWANCE = 254.40;
    private static NextChild onlyInstance = new NextChild();

    private NextChild(){
        super(BASIC_ALLOWANCE);
    }

    public static NextChild getInstance(){
        return onlyInstance;
    }

}
