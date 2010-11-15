package se.janlindblom.java.tubes;

import java.util.ArrayList;
import java.util.Observable;

/**
 * A connecting pipe, you attach it to a Tube and then you drop stuff in it.
 * The stuff you drop can be picked up somewhere else through an {@link Outlet}.
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.2
 */
public class Inlet extends Observable {
    private Tube tube;
    private ArrayList<Message> stuff;

    /**
     *
     */
    public Inlet() {
        this.tube = null;
        this.stuff = new ArrayList<Message>();
    }

    /**
     * Connects this Inlet to a {@link Tube}.
     *
     * @param t {@link Tube} to connect this Inlet to.
     */
    public void connect(Tube t) {
        t.addInlet(this);
        this.addObserver(t);
        this.tube = t;
    }

    /**
     * Disconnect this Inlet from a {@link Tube}.
     *
     * @param t
     */
    public void disconnect() {
        tube.deleteInlet(this);
        this.deleteObserver(tube);
        this.tube = null;
    }

    /**
     * Drop stuff in this Inlet.
     *
     * @param m Stuff to drop.
     */
    public void drop(Message m) {
        this.setChanged();
        this.notifyObservers(m);
        stuff.add(m);
    }

}
