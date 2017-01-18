package main.persons.ageClasses;

import main.persons.Child;

/**
 * Created by pieterst on 18/01/2017.
 */
public abstract class AgeClass {

    public static double searchAgeAddition(Child c){
        if (ageBetween(c.getAge(), 6, 11)){
            return AgeSixToEleven.getAgeAddition(c);
        }else if (ageBetween(c.getAge(), 12, 17)){
            return AgeTwelveToSeventeen.getAgeAddition(c);
        }else if (c.getAge() >= 18){
            return AgePlusEighteen.getAgeAddition(c);
        }
        return 0;
    }

    private static boolean ageBetween(int age, int bottom, int top){
        if (age < bottom){
            return false;
        }else if (age > top){
            return false;
        }else {
            return true;
        }
    }

}
