package uz.uzkassa.common.axon.supplier.commands;


import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class SupplierCreateCommand {

    @TargetAggregateIdentifier
    public String supplierId;

    public String login;

    public SupplierCreateCommand(String supplierId, String login) {
        this.supplierId = supplierId;
        this.login = login;
    }
}
