package ru.ponomaryov.se.client.command;

import ru.ponomaryov.se.server.api.ChatService;
import ru.ponomaryov.se.server.model.Message;
import ru.ponomaryov.se.server.model.Session;

import java.util.List;
import java.util.Scanner;

public class ClientCommandRead extends AbstractClientCommand {

    public ClientCommandRead(ChatService chatService, Session session, Scanner scanner) {
        super(chatService, session, scanner);
    }

    @Override
    public void execute() {
        final List<Message> messages = chatService.getMessages(session);
        for (final Message message : messages) {
            System.out.println("** INCOME MESSAGES **");
            System.out.println("FROM: " + message.source);
            System.out.println("TEXT: " + message.text);
        }
    }
}
