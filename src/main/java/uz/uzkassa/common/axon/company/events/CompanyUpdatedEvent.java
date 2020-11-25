package uz.uzkassa.common.axon.company.events;


public class CompanyUpdatedEvent {

    public String companyId;

    public String userId;

    public String login;

    public CompanyUpdatedEvent(String companyId, String userId, String login) {
        this.companyId = companyId;
        this.userId = userId;
        this.login = login;
    }
}
