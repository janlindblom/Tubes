package se.janlindblom.java.tubes;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Actually sort of a pipe, where there's sort of this flow of stuff or fluids
 * of some sort. You can drop stuff in the Tube through an {@link Inlet} and the
 * stuff can be picked up somewhere else through an {@link Outlet}.
 *
 * Some might argue it's really some kind of a message bus.
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.2
 */
public class Tube extends Observable implements Observer {
    private ArrayList<Inlet> inlets;

    public Tube() {
        inlets = new ArrayList<Inlet>();
    }

    public void addInlet(Inlet i) {
        inlets.add(i);
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
