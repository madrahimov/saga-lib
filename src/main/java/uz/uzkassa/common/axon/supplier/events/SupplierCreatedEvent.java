package uz.uzkassa.common.axon.supplier.events;


public class SupplierCreatedEvent {

    public String supplierId;

    public String login;


    public SupplierCreatedEvent(String supplierId, String login) {
        this.supplierId = supplierId;
        this.login = login;
    }
}
