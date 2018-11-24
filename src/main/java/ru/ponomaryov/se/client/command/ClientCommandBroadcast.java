package ru.ponomaryov.se.client.command;

import ru.ponomaryov.se.server.api.ChatService;
import ru.ponomaryov.se.server.model.Session;

import java.util.Scanner;

public class ClientCommandBroadcast extends AbstractClientCommand{

    public ClientCommandBroadcast(ChatService chatService, Session session, Scanner scanner) {
        super(chatService, session, scanner);
    }

    @Override
    public void execute() {
        System.out.println("ENTER MESSAGE: ");
        final String message = scanner.nextLine();
        chatService.sendBroadcast(session, message);
    }
}
