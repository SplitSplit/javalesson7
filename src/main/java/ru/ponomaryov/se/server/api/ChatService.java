package ru.ponomaryov.se.server.api;

import ru.ponomaryov.se.server.model.Contact;
import ru.ponomaryov.se.server.model.Message;
import ru.ponomaryov.se.server.model.Session;
import ru.ponomaryov.se.server.model.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;
import java.util.Set;

@WebService
public interface ChatService {

    @WebMethod
    boolean register(@WebParam String login, @WebParam String password);

    @WebMethod
    List<String> getListLogin();

    @WebMethod
    boolean isLoginExists(@WebParam String login);

    @WebMethod
    Session signIn(@WebParam String login, @WebParam String password);

    @WebMethod
    User getUser(@WebParam Session session);

    @WebMethod
    void signOut(@WebParam Session session);

    @WebMethod
    List<Message> getMessages(@WebParam Session session);

    @WebMethod
    void sendBroadcast(@WebParam Session session, @WebParam String message);

    @WebMethod
    void sendMessage(final Session session, final String login, final String message);

    @WebMethod
    void clearMessages(@WebParam Session session);

    @WebMethod
    void createContact(Session session, String login);

    @WebMethod
    void removeContact(Session session, String login);

    @WebMethod
    Set<Contact> getContacts(Session session);
}
