package main.persons.ageClasses;

import main.persons.Child;
import main.persons.order.FirstChild;

/**
 * Created by pieterst on 18/01/2017.
 */
public class AgePlusEighteen {
    private static final double AGE_ADDITION_FIRST = 28.16;
    private static final double AGE_ADDITION_OTHER = 62.15;

    static double getAgeAddition(Child c){
        if (c.getChildOrder() instanceof FirstChild){
            return AGE_ADDITION_FIRST;
        }else {
            return AGE_ADDITION_OTHER;
        }
    }
}
