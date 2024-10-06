package Service.Message;

import Model.Message.Message;

public class MessageService implements IMessageService {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Sending the Message : " +message.toString());
    }

    @Override
    public void deleteMessage(Message message) {
        System.out.println("Deleting the message : " +message.toString());
    }
}
