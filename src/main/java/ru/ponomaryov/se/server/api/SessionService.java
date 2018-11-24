package ru.ponomaryov.se.server.api;

import ru.ponomaryov.se.server.model.Session;
import ru.ponomaryov.se.server.model.User;

public interface SessionService {

    Session signIn(String login, String password);

    User getUser(Session session);

    void signOut(Session session);
}
