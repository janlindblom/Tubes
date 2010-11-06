package se.janlindblom.java.tubes;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.1
 */
public class Manager implements Observer {
    private Vector<Tube> tubes;

    public Manager() {
        tubes = new Vector<Tube>();
    }

    public Tube createTube() {
        Tube t = new Tube();
        t.addObserver(this);
        tubes.add(t);
        return t;
    }

    public void destroyTube(Tube t) {
        if (tubes.contains(t)) {
            t.deleteObservers();
        }
    }

    public void update(Observable o, Object arg) {
        Logger.getLogger(Manager.class.getName()).log(Level.INFO, arg.toString());
    }
}
