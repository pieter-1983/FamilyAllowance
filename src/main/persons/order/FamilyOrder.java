package main.persons.order;

/**
 * Created by pieterst on 18/01/2017.
 */
public abstract class FamilyOrder {
    private double basicAllowance;

    protected FamilyOrder(double basicAllowance){
        this.basicAllowance = basicAllowance;
    }

    public double getBasicAllowance() {
        return basicAllowance;
    }
}
