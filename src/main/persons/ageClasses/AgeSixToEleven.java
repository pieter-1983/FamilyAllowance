package main.persons.ageClasses;

import main.persons.Child;
import main.persons.order.FirstChild;

/**
 * Created by pieterst on 18/01/2017.
 */
class AgeSixToEleven {
    private static final double AGE_ADDITION_FIRST = 16.04;
    private static final double AGE_ADDITION_OTHER = 31.99;

    static double getAgeAddition(Child c){
        if (c.getChildOrder() instanceof FirstChild){
            return AGE_ADDITION_FIRST;
        }else {
            return AGE_ADDITION_OTHER;
        }
    }
}
