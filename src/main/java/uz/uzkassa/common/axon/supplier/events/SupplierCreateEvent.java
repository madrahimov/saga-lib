package uz.uzkassa.common.axon.supplier.events;


import uz.uzkassa.common.axon.base.events.BaseEvent;

public class SupplierCreateEvent extends BaseEvent<String> {

   public String login;


    public SupplierCreateEvent(String id, String login) {
        super(id);
        this.login = login;
    }
}
