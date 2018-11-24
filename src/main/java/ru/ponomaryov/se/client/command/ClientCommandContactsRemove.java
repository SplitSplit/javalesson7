package ru.ponomaryov.se.client.command;

import ru.ponomaryov.se.server.api.ChatService;
import ru.ponomaryov.se.server.model.Session;

import java.util.Scanner;

public class ClientCommandContactsRemove extends AbstractClientCommand {

    public ClientCommandContactsRemove(ChatService chatService, Session session, Scanner scanner) {
        super(chatService, session, scanner);
    }

    @Override
    public void execute() {
        if(session == null) return;
        System.out.println("ENTER LOGIN: ");
        final String login = scanner.nextLine();
        chatService.removeContact(session, login);
    }
}
