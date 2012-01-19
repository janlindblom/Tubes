package se.janlindblom.java.tubes;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 */
public class Outlet implements Observer {
    private ArrayList<Message> messages;

    /**
     * 
     */
    public Outlet() {
        messages = new ArrayList<Message>();
    }

    /**
     * 
     * @param t 
     */
    public void connect(Tube t) {
        t.addObserver(this);
    }

    /**
     * 
     * @param t 
     */
    public void disconnect(Tube t) {
        t.deleteObserver(this);
    }

    /**
     * 
     * @param o
     * @param arg 
     */
    public void update(Observable o, Object arg) {
        if (arg.getClass().equals(Message.class)) {
            Message msg = (Message)arg;
            messages.add(msg);
        }
    }
}
