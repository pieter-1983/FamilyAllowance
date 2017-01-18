package main.family;

import main.persons.Child;
import main.persons.Parent;
import main.persons.Person;
import main.persons.order.FirstChild;
import main.persons.order.NextChild;
import main.persons.order.SecondChild;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pieterst on 18/01/2017.
 */
public class Family {
    private List<Person> familyMembers;

    public Family(List<Person> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public Family() {
        familyMembers = new ArrayList<>();
    }

    public List<Person> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(Person personToAdd){
        familyMembers.add(personToAdd);
        updateFamilyOrder(familyMembers);
    }

    public void removeFamilyMember(Person toRemove) {
        familyMembers.remove(toRemove);
        updateFamilyOrder(familyMembers);
    }

    private void updateFamilyOrder(List<Person> familyMembers) {
        List<Child> children = new ArrayList<>();
        List<Parent> parents = new ArrayList<>();
        for (Person p : familyMembers){
            addPersonToCorrectList(children, parents, p);
        }
        updateSingleParentStatus(parents);
        if (children.size() != 0) {
            updateChildOrder(children);
        }
    }

    private void addPersonToCorrectList(List<Child> children, List<Parent> parents, Person p) {
        if (p instanceof Parent){
            parents.add((Parent)p);
        }
        if (p instanceof Child){
            children.add((Child)p);
        }
    }

    private void updateSingleParentStatus(List<Parent> parents) {
        if (parents.size() < 2){
            parents.get(0).setSingleParent(true);
        }else {
            for (Parent parent : parents){
                parent.setSingleParent(false);
            }
        }
    }

    private void updateChildOrder(List<Child> children) {
        for (int i = 0; i < children.size(); i++) {
            if (i==0){
                children.get(i).setChildOrder(FirstChild.getInstance());
            }else if (i==1){
                children.get(i).setChildOrder(SecondChild.getInstance());
            }else {
                children.get(i).setChildOrder(NextChild.getInstance());
            }
        }
    }

}

