package uz.uzkassa.common.axon.company.commands;


import uz.uzkassa.common.axon.base.commands.BaseCommand;

public class CompanyCreateCommand extends BaseCommand<String> {

    public String login;

    public CompanyCreateCommand(String id, String login) {
        super(id);
        this.login = login;
    }
}
