package ru.ponomaryov.se.server.service;

import ru.ponomaryov.se.server.api.SessionService;
import ru.ponomaryov.se.server.api.UserService;
import ru.ponomaryov.se.server.model.Session;
import ru.ponomaryov.se.server.model.User;

import java.util.HashMap;
import java.util.Map;

public final class ServiceSessionBean implements SessionService {

    private final UserService userService;

    private final Map<Session, User> sessions = new HashMap<>();

    public ServiceSessionBean (final UserService userService) {
        this.userService = userService;
    }

    @Override
    public Session signIn(final String login, final String password) {
        if(login == null || login.isEmpty()) return null;
        if(password == null || password.isEmpty()) return null;
        final User user = userService.getUser(login);
        if(user == null) return null;
        if(!password.equals(user.password)) return null;
        final Session session = new Session();
        sessions.put(session, user);
        return session;
    }

    @Override
    public User getUser(final Session session) {
        if(session == null) return null;
        return sessions.get(session);
    }

    @Override
    public void signOut(Session session) {
        if(session == null) return;
        sessions.remove(session);
    }
}
