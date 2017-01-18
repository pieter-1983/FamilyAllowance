package main.persons.workstate;

/**
 * Created by pieterst on 18/01/2017.
 */
public class Status {
    private boolean disabled;
    private boolean unemployed;

    public Status(boolean disabled, boolean unemployed) {
        this.disabled = disabled;
        this.unemployed = unemployed;
    }
    public Status() {
        this.disabled = false;
        this.unemployed = false;
    }


    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isUnemployed() {
        return unemployed;
    }

    public void setUnemployed(boolean unemployed) {
        this.unemployed = unemployed;
    }
}