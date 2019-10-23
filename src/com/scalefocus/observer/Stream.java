package com.scalefocus.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Declares a dependency one-to-many. Many objects of type {@link Subscriber} can be attached to the current {@link Stream}.
 * The class holds a state of type {@link String} and whenever this state changes -
 * all the subscribers, attached to the current stream will be notified about the new state of the Stream.
 *
 * @author Mariyan Topalov
 */

public class Stream {

    private List<Subscriber> subscribers;

    private String state;

    public Stream() {
        this.subscribers = new ArrayList<>();
    }

    public String getState() {
        return state;
    }

    /**
     * Changes the state of the current {@link Stream} to a new state, given as param,
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
        notifyAllSubscribers();
    }

    /**
     * Attaches a new {@link Subscriber}, given as parameter, to the current {@link Stream}.
     *
     * @param subscriber {@link Subscriber} - the subscriber to be attached
     */
    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
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
