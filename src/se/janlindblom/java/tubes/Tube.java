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
public class Tube extends Observable implements Observer {

    private Vector<Inlet> inlets;

    public Tube() {
        inlets = new Vector<Inlet>();
    }

    public void addInlet(Inlet i) {
        inlets.add(i);
    }

    public void deleteInlets() {

    }

    public void deleteInlet(Inlet i) {
        if (inlets.contains(i)) {
            inlets.remove(i);
        }
    }

    public void update(Observable o, Object arg) {
        if (o.getClass().equals(Manager.class)) {
            Logger.getLogger(Tube.class.getName()).log(Level.INFO, arg.toString());
        } else {
            this.setChanged();
            this.notifyObservers(arg);
        }
    }

}
