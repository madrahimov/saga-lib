package uz.uzkassa.common.axon.company.commands;


import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CompanyCreateCommand {

    @TargetAggregateIdentifier
    public String companyId;

    public String login;

    public CompanyCreateCommand(String companyId, String login) {
        this.companyId = companyId;
        this.login = login;
    }
}
