package main.allowance;
import main.persons.Child;
import main.persons.order.FirstChild;
import main.persons.order.SecondChild;
/**
 * Created by pieterst on 18/01/2017.
 */
public class Disabled {
    private static final double FIRST_CHILD_DISABLED = 46.88;
    private static final double SECOND_CHILD_DISABLED = 29.06;
    private static final double OTHER_CHILD_DISABLED = 23.43;


    public static double getAllowanceBonus(Child c) {
        if (c.getParentWorkStatus().isUnemployed()) {
            if (c.getChildOrder() instanceof FirstChild) {
                return FIRST_CHILD_DISABLED;
            } else if (c.getChildOrder() instanceof SecondChild) {
                return SECOND_CHILD_DISABLED;
            } else {
                return OTHER_CHILD_DISABLED;
            }
        }
        return 0;
    }
}
