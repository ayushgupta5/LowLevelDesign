package Service.Message;

import Model.Message.Message;

public class MessageService implements  IMessageService {
    @Override
    public void sendMessage(Message message) {
        System.out.println("Sending the message : " + message.toString());
    }
}
