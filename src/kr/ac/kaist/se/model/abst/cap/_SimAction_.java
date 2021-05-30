package kr.ac.kaist.se.model.abst.cap;

import kr.ac.kaist.se.model.abst.obj._SimObject_;
import kr.ac.kaist.se.model.simdata.evnt.SimLogEvent;
import kr.ac.kaist.se.model.simmodel.SoS;

import java.util.ArrayList;

public abstract class _SimAction_ {

    /* ArrayList to store SimLogEvents of executed actions for return */
    protected ArrayList<SimLogEvent> actionLogEvents = new ArrayList<>();

    protected SoS accessibleSoS;            //Accessible SimModel (SoS)
    protected _SimObject_ actionSubject;    //Subject who performs this action

    protected String actionId;      //id of action
    protected String actionName;    //name of action

    protected int actionDuration = -1;  //duration of action execution
    protected float actionCost = -1;    //cost for action execution
    protected float actionBenefit = -1; //benefit from action execution

    public _SimAction_(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName) {
        this.accessibleSoS = accessibleSoS;
        this.actionSubject = actionSubject;
        this.actionId = actionId;
        this.actionName = actionName;
    }

    public _SimAction_(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName, int actionDuration, float actionCost, float actionBenefit) {
        this.accessibleSoS = accessibleSoS;
        this.actionSubject = actionSubject;
        this.actionId = actionId;
        this.actionName = actionName;
        this.actionDuration = actionDuration;
        this.actionCost = actionCost;
        this.actionBenefit = actionBenefit;
    }

    /**
     * A method to check precondition of this action
     *
     * @return true if this action is executable
     */
    public abstract boolean checkPrecondition();

    /**
     * A method to actually execute this action
     *
     * @param tick current tick of simulation
     * @return List of SimLogEvent generated after executing this action
     */
    public abstract ArrayList<SimLogEvent> executeAction(int tick);

    /**
     * A method to generate event specification for SimEventLog
     *
     * @return Generated String-type log event specification
     */
    public abstract String generateLogEventSpec();

}
