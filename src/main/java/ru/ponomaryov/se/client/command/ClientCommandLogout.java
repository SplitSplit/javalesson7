package ru.ponomaryov.se.client.command;

import ru.ponomaryov.se.server.api.ChatService;
import ru.ponomaryov.se.server.model.Session;

import java.util.Scanner;

public class ClientCommandLogout extends AbstractClientCommand {

    public ClientCommandLogout(ChatService chatService, Session session, Scanner scanner) {
        super(chatService, session, scanner);
    }

    @Override
    public void execute() {
        chatService.signOut(session);
    }
}
