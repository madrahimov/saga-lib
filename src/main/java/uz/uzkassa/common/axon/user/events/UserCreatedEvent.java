package uz.uzkassa.common.axon.user.events;


public class UserCreatedEvent {

    public String userId;

    public String companyId;

    public String login;


    public UserCreatedEvent(String userId, String companyId, String login) {
        this.userId = userId;
        this.companyId = companyId;
        this.login = login;
    }
}
