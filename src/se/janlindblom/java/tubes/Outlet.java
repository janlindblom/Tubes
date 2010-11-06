package se.janlindblom.java.tubes;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 */
public class Outlet implements Observer {
    private Vector<Message> messages;

    public Outlet() {
        messages = new Vector<Message>();
    }

    public void connect(Tube t) {
        t.addObserver(this);
    }

    public void disconnect(Tube t) {
        t.deleteObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (arg.getClass().equals(Message.class)) {
            Message msg = (Message)arg;
            messages.add(msg);
        }
    }
}
