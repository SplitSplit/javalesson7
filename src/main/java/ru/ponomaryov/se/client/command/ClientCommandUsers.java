package ru.ponomaryov.se.client.command;

import ru.ponomaryov.se.server.api.ChatService;
import ru.ponomaryov.se.server.model.Session;

import java.util.Scanner;

public class ClientCommandUsers extends AbstractClientCommand {

    public ClientCommandUsers(ChatService chatService, Session session, Scanner scanner) {
        super(chatService, session, scanner);
    }

    @Override
    public void execute() {
        System.out.println(chatService.getListLogin());
    }
}
