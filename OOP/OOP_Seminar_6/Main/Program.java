package OOP_Seminar_6.Main;

import OOP_Seminar_6.Entities.FamilyTree;
import OOP_Seminar_6.Entities.Human;
import OOP_Seminar_6.Service.Tree.FTFirstFill;

public class Program {
    public static void main(String[] args) {
        FamilyTree<Human> familyTree = new FamilyTree<Human>();
        new FTFirstFill(familyTree);
        Controller<Human> control = new Controller<>(familyTree);

        while (control.getControllerStatus()) {
            control.startControl();
        }
    }
 
} 