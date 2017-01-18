package main.allowance;

import main.persons.Child;
import main.persons.order.FirstChild;
import main.persons.order.SecondChild;

/**
 * Created by pieterst on 18/01/2017.
 */
public class NotEmployed {
    private static final double FIRST_CHILD_UNEMPLOYED_PARENT = 46.88;
    private static final double SECOND_CHILD_UNEMPLOYED_PARENT = 29.06;
    private static final double OTHER_CHILD_UNEMPLOYED_PARENT = 5.10;
    private static final double OTHER_CHILD_UNEMPLOYED_SINGLE_PARENT = 23.43;

    public static double getAllowanceBonus(Child c) {
        if (c.getParentWorkStatus().isUnemployed()) {
            if (c.getChildOrder() instanceof FirstChild) {
                return FIRST_CHILD_UNEMPLOYED_PARENT;
            } else if (c.getChildOrder() instanceof SecondChild) {
                return SECOND_CHILD_UNEMPLOYED_PARENT;
            }else if (c.hasSingleParent()){
                return OTHER_CHILD_UNEMPLOYED_SINGLE_PARENT;
            }else {
                return OTHER_CHILD_UNEMPLOYED_PARENT;
            }
        }
        return 0;
    }
}
