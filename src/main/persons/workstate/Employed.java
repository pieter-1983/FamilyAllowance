package main.persons.workstate;

/**
 * Created by pieterst on 18/01/2017.
 */
public class Employed extends Status {
    public Employed(boolean disabled, boolean unemployed) {
        super(disabled, unemployed);
    }

    public Employed() {
        super(false, false);
    }
}
