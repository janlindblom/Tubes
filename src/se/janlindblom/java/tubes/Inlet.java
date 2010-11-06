package se.janlindblom.java.tubes;

import java.util.Observable;

/**
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 */
public class Inlet extends Observable {

    public void connect(Tube t) {
        t.addInlet(this);
        this.addObserver(t);
    }

    public void disconnect(Tube t) {
        t.deleteInlet(this);
        this.deleteObserver(t);
    }

    public void push(Message m) {
        this.setChanged();
        this.notifyObservers(m);
    }

}
