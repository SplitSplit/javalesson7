package ru.ponomaryov.se.server.api;

import ru.ponomaryov.se.server.model.Contact;
import ru.ponomaryov.se.server.model.ContactBox;

public interface ContactService {

    ContactBox contacts(String login);

    Contact create(String source, String target);

    void remove(String source, String target);

    void removeAll(String login);
}
