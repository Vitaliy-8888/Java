package OOP_Seminar_6.Service.Commands;

import OOP_Seminar_6.Entities.Human;
import OOP_Seminar_6.Main.FTService;
import OOP_Seminar_6.Main.UserCommunication;

public class CommandSortName<T extends Human> extends Command<T> {
    public CommandSortName(FTService<T> fts, UserCommunication<T> uc) {
        super(fts, uc);
    }

    @Override
    public void execute() {
        uc.showSortedHumanList(fts.sortByName());
    }

    @Override
    public String description() {
        return "Сортировка по имени";
    }

} 