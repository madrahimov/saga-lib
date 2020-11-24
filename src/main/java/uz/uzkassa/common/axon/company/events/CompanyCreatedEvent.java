package uz.uzkassa.common.axon.company.events;


public class CompanyCreatedEvent {

    public String companyId;

    public String login;


    public CompanyCreatedEvent(String companyId, String login) {
        this.companyId = companyId;
        this.login = login;
    }
}
