package uz.uzkassa.common.axon.user.events;


import uz.uzkassa.common.axon.base.events.BaseEvent;

public class UserCreateEvent extends BaseEvent<String> {

    public String login;


    public UserCreateEvent(String id, String login) {
        super(id);
        this.login = login;
    }
}
