package OOP_Seminar_6.Service.Commands;

import OOP_Seminar_6.Entities.Human;
import OOP_Seminar_6.Main.FTService;
import OOP_Seminar_6.Main.UserCommunication;

import java.util.Map;

public class CommandAdd<T extends Human> extends Command<T> {
    public CommandAdd(FTService<T> fts, UserCommunication<T> uc) {
        super(fts, uc);
    }

    @Override
    public void execute() {
        uc.showHumansFromTree(fts.getAllHumans());

        String fullName = uc.askFullName();
        String gender = uc.askGender();

        Map<Integer, T> availableParents = fts.chooseParent("женский");
        int numberOfParent = uc.chooseParent(availableParents);
        T mother = availableParents.get(numberOfParent);

        availableParents = fts.chooseParent("мужской");
        numberOfParent = uc.chooseParent(availableParents);
        T father = availableParents.get(numberOfParent);

        fts.createHuman(fullName, gender, mother, father);
    }

    @Override
    public String description() {
        return "Добавить нового человека";
    }

} 
