package uz.uzkassa.common.axon.supplier.commands;


import uz.uzkassa.common.axon.base.commands.BaseCommand;

public class SupplierCreateCommand extends BaseCommand<String> {

    public String login;

    public SupplierCreateCommand(String id, String login) {
        super(id);
        this.login = login;
    }
}
