package kr.ac.kaist.se.model.abst.obj;

import kr.ac.kaist.se.model.abst.cap._SimAction_;
import kr.ac.kaist.se.model.intf.Movable;
import kr.ac.kaist.se.model.intf.Simulatable;
import kr.ac.kaist.se.model.intf.Stateful;
import kr.ac.kaist.se.model.simmodel.state.ObjectState;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Abstract class for general simulation objects
 * A _SimObject_ is simulatable, movable and stateful
 *
 * @author ymbaek
 */
public abstract class _SimObject_ implements Simulatable, Movable, Stateful {

    /** Basic information of a SimObject */
    //Universally unique object id (Every SimObject should have its own unique id)
    protected String id;
    //Name of an object
    protected String name;


    /** Properties and state information of a SimObject */
    //Static object / Dynamic object
    protected boolean isStatic;
    //Activated object / Deactivated object
    protected boolean isActivated;
    //Available object / Unavailable object
    protected boolean isAvailable;

    /** State-related information */
    protected boolean isStateful;
    //States of an object
    protected ArrayList<ObjectState> objStates = new ArrayList<>();
    //Initial state of an object
    protected String initialStateId;
    //Current state of an object
    protected String curStateId;

    /** Geo-location information */
    //Current location of this object
    protected String objLocation;


    /**
     * Initialization of object location
     */
    protected abstract void initObjLocation();



    /**
     * Print object information of a _SimObject_
     */
    protected void printObjInfo() {
        String thisClassName = this.getClass().getSimpleName();

        if (this.getClass() != null) {
            //System.out.println("[" + timestamp + "] (" + thisClassName + ") An object is created.");
            System.out.println("[" + thisClassName + ":printObjInfo()] id: " + this.id +
                    ", name: " + this.name +
                    ", isStatic: " + this.isStatic +
                    ", isActivated: " + this.isActivated +
                    ", isAvailable: " + this.isAvailable
            );
        }

    }


    /* GETTERS & SETTERS */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isStateful() {
        return isStateful;
    }

    public void setStateful(boolean stateful) {
        isStateful = stateful;
    }

    public ArrayList<ObjectState> getObjStates() {
        return objStates;
    }

    public void setObjStates(ArrayList<ObjectState> objStates) {
        this.objStates = objStates;
    }

    public String getInitialStateId() {
        return initialStateId;
    }

    public void setInitialStateId(String initialStateId) {
        this.initialStateId = initialStateId;
    }

    public String getCurStateId() {
        return curStateId;
    }

    public void setCurStateId(String curStateId) {
        this.curStateId = curStateId;
    }

    public String getObjLocation() {
        return objLocation;
    }

    public void setObjLocation(String objLocation) {
        this.objLocation = objLocation;
    }
}
