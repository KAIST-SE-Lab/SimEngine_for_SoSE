package kr.ac.kaist.se.model.abst.obj;

import kr.ac.kaist.se.model.abst.cap._SimAction_;
import kr.ac.kaist.se.model.intf.Actionable;

import java.util.ArrayList;

/**
 * Abstract class for an object that can execute its own behaviors
 * (i.e., objects that are capable of doing individual actions)
 *
 * @author ymbaek
 */
public abstract class _SimActionableEntity_ extends _SimEntityObject_ implements Actionable {

    /** List of capable and selected actions */
    // List of capable actions
    protected ArrayList<_SimAction_> capableActionList = new ArrayList<>();
    // List of selected actions for execution of a particular tick
    protected ArrayList<_SimAction_> selectedActionList = new ArrayList<>();

    /**
     * A method for the initialization of actions
     */
    protected abstract void initCapableActions();

    /**
     * A method to select an action(s) and store into selectedActionList
     * Only actions selected can be executed by the simEngine
     */
    protected abstract void selectActions();



    /* GETTERS & SETTERS */

    public ArrayList<_SimAction_> getCapableActionList() {
        return capableActionList;
    }

    public void setCapableActionList(ArrayList<_SimAction_> capableActionList) {
        this.capableActionList = capableActionList;
    }

    public ArrayList<_SimAction_> getSelectedActionList() {
        return selectedActionList;
    }

    public void setSelectedActionList(ArrayList<_SimAction_> selectedActionList) {
        this.selectedActionList = selectedActionList;
    }
}
