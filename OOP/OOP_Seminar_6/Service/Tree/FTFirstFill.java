package OOP_Seminar_6.Service.Tree;

import OOP_Seminar_6.Entities.FamilyTree;
import OOP_Seminar_6.Entities.Human;

public class FTFirstFill {

    public FTFirstFill(FamilyTree<Human> familyTree) {
        Human ivanIvanov = new Human("Иван Иванов", "Мужской");
        Human mariaIvanova = new Human("Мария Иванова", "Женский");
        Human petrIvanov = new Human("Петр Иванов", "Мужской", mariaIvanova, ivanIvanov);

        familyTree.addHuman(ivanIvanov);
        familyTree.addHuman(mariaIvanova);
        familyTree.addHuman(petrIvanov);
    }
} 