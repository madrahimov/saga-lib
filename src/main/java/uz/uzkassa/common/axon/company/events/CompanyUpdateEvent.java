package uz.uzkassa.common.axon.company.events;


public class CompanyUpdateEvent {

    public String updatedCompanyId;

    public String userId;

    public String login;

    public CompanyUpdateEvent(String updatedCompanyId, String userId, String login) {
        this.updatedCompanyId = updatedCompanyId;
        this.userId = userId;
        this.login = login;
    }
}
