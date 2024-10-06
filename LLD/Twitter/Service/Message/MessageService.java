package Service.Message;

import Model.Message.Message;

public class MessageService implements IMessageService {
    @Override
    public void send(Message message) {
        System.out.println("User is Sending the Message : " +message.toString());
    }
}
