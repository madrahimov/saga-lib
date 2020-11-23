package uz.uzkassa.common.axon.company.events;


import uz.uzkassa.common.axon.base.events.BaseEvent;

public class CompanyCreateEvent extends BaseEvent<String> {

   public String login;


    public CompanyCreateEvent(String id, String login) {
        super(id);
        this.login = login;
    }
}
