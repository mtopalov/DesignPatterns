package com.scalefocus.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Observer class.
 * Declares a dependency one-to-many. Many objects of type {@link Subscriber} can be attached to the current {@link Stream}.
 * The class holds a state of type {@link String} and whenever this state changes -
 * all the subscribers, attached to the current stream will be notified about the new state of the Stream.
 *
 * @author Mariyan Topalov
 */

public class Stream {

    private String state;

    private List<Subscriber> subscribers;

    public Stream() {
        this.subscribers = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    /**
     * Changes the state of the {@link Stream} to a new state, given as param,
     *
     * @param state {@link String} - the new state of the {@link Stream}.
     */
    public void setState(String state) {
        this.state = state;
        notifyAllSubscribers();
    }

    /**
     * Adds a new {@link Subscriber}, given as parameter, to the subscribers {@link List}.
     *
     * @param subscriber {@link Subscriber} - the subscriber to be attached
     */
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    /**
     * Removes a {@link Subscriber}, given as parameter, from the subscribers {@link List}.
     *
     * @param subscriber {@link Subscriber} - the subscriber to be removed
     */
    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    /**
     * Notifies all subscribers attached to the current stream, starting with {@link PremiumSubscriber}s, that stream's state has changed.
     */
    public void notifyAllSubscribers() {
        sortPremiumFirst();
        subscribers.forEach(Subscriber::update);
    }

    /**
     * Sorts the {@link List} of subscribers so that {@link PremiumSubscriber}s are placed at the beginning of the List.
     */
    private void sortPremiumFirst() {
        for (int i = 0; i < subscribers.size(); i++) {
            if (subscribers.get(i) instanceof PremiumSubscriber) {
                Subscriber sub = subscribers.get(i);
                subscribers.remove(subscribers.get(i));
                subscribers.add(0, sub);
            }
        }
    }
}
