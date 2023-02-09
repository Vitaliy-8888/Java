package OOP_Seminar_6.Service.Tree;

import OOP_Seminar_6.Entities.Human;

import java.util.Comparator;

public class HumanComparatorChildCount implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o2.getChildrensNumber(), o1.getChildrensNumber());
    }
} 