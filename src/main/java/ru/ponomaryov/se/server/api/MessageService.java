package ru.ponomaryov.se.server.api;

import ru.ponomaryov.se.server.model.Message;
import java.util.List;

public interface MessageService {

    List<Message> getMessage(String login);

    void sendBroadcast(String source, String text);

    void sendMessage(String source, String target, String text);

    void cleanMessage(String login);
}
