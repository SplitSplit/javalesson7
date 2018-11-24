package ru.ponomaryov.se.server.model;


import java.util.Objects;
import java.util.UUID;

public class Session {

    public long timestamp = System.currentTimeMillis();

    public String id = UUID.randomUUID().toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        final boolean checkTamestamp = Objects.equals(timestamp, session.timestamp);
        final boolean checkSessionId = Objects.equals(id, session.id);
        return checkTamestamp && checkSessionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, id);
    }
}
