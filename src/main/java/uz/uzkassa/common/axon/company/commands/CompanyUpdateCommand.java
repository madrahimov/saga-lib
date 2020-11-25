package uz.uzkassa.common.axon.company.commands;


import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CompanyUpdateCommand {

    @TargetAggregateIdentifier
    public String companyId;

    public String userId;

    public String login;


    public CompanyUpdateCommand(String companyId, String userId, String login) {
        this.companyId = companyId;
        this.userId = userId;
        this.login = login;
    }
}
