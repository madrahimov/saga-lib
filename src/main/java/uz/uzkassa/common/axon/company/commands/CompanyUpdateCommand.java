package uz.uzkassa.common.axon.company.commands;


import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class CompanyUpdateCommand {

    @TargetAggregateIdentifier
    public String updatedCompanyId;

    public String userId;

    public String login;


    public CompanyUpdateCommand(String updatedCompanyId, String userId, String login) {
        this.updatedCompanyId = updatedCompanyId;
        this.userId = userId;
        this.login = login;
    }
}
