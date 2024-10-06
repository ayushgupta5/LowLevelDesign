package Service.Message;

import Model.Message.Message;

public interface IMessageService {
    void sendMessage(Message message);
    void deleteMessage(Message message);
}
