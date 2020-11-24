package uz.uzkassa.common.axon.user.commands;


import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class UserCreateCommand {

    @TargetAggregateIdentifier
    public String userId;

    public String companyId;

    public String login;

    public UserCreateCommand(String userId, String companyId, String login) {
        this.userId = userId;
        this.companyId = companyId;
        this.login = login;
    }
}
