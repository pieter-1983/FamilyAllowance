package main.allowance;

import main.persons.Child;
import main.persons.Person;
import main.persons.ageClasses.AgeClass;
import main.persons.workstate.SelfEmployed;

import java.util.List;

/**
 * Created by pieterst on 18/01/2017.
 */
public class ChildSupport implements Allowance{
    @Override
    public double calculateAllowance(List<Person> family) {
      double allowance=0;
        for (Person p:family) {
            if (p instanceof Child) {
                Child c = (Child)p;
                allowance = getBasicAllowance(c);
                allowance += getAgeAddition(c);
                allowance += unemployedPensionedBonus(c);
                allowance += disabledEmployeeBonus(c);
            }
        }
        return allowance;
    }

    private double disabledEmployeeBonus(Child c) {
        return Disabled.getAllowanceBonus(c);
    }

    private double unemployedPensionedBonus(Child c) {
        return NotEmployed.getAllowanceBonus(c);
    }

    private double getAgeAddition(Child c) {
        return AgeClass.searchAgeAddition(c);
    }

    private double getBasicAllowance(Child c) {
        double allowance = 0;
        if (c.isOrphan() == true){
            allowance += BASIC_ORPHAN;
        }else if (c.getParentWorkStatus() instanceof SelfEmployed){
            allowance +=BASIC_SELF_EMPLOYED_DAD;
        }else{
            allowance += c.getChildOrder().getBasicAllowance();
        }
        return allowance;
    }

}
