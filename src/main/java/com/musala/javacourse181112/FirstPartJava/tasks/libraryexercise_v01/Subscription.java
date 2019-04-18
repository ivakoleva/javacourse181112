package com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01;

import com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01.Users.Client;
import com.musala.javacourse181112.FirstPartJava.tasks.libraryexercise_v01.Users.Employ;

import java.time.LocalDateTime;

public class Subscription {
    private Client subscriber;
    private Library storedAt;
    private Employ subscribedBy;
    private LocalDateTime subscribedAtTime;
    private LocalDateTime subscribedUntilTime;

    public Subscription() {
    }

    public Client getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Client subscriber) {
        this.subscriber = subscriber;
    }

    public Library getStoredAt() {
        return storedAt;
    }

    public void setStoredAt(Library storedAt) {
        this.storedAt = storedAt;
    }

    public Employ getSubscribedBy() {
        return subscribedBy;
    }

    public void setSubscribedBy(Employ subscribedBy) {
        this.subscribedBy = subscribedBy;
    }

    public LocalDateTime getSubscribedAtTime() {
        return subscribedAtTime;
    }

    public void setSubscribedAtTime(LocalDateTime subscribedAtTime) {
        this.subscribedAtTime = subscribedAtTime;
    }

    public LocalDateTime getSubscribedUntilTime() {
        return subscribedUntilTime;
    }

    public void setSubscribedUntilTime(LocalDateTime subscribedUntilTime) {
        this.subscribedUntilTime = subscribedUntilTime;
    }
}
