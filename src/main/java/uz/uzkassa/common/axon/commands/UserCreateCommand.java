package uz.uzkassa.common.axon.commands;


import uz.uzkassa.common.axon.base.commands.BaseCommand;

public class UserCreateCommand extends BaseCommand<String> {

    public String login;

    public UserCreateCommand(String id, String login) {
        super(id);
        this.login = login;
    }
}
