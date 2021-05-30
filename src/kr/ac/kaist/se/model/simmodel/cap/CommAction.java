package kr.ac.kaist.se.model.simmodel.cap;

import kr.ac.kaist.se.model.abst.cap._SimAction_;
import kr.ac.kaist.se.model.abst.comm._SimMessage_;
import kr.ac.kaist.se.model.abst.obj._SimObject_;
import kr.ac.kaist.se.model.simdata.evnt.SimLogEvent;
import kr.ac.kaist.se.model.simmodel.SoS;

import java.util.ArrayList;

/**
 * A concrete class to represent an action for communication.
 * The communication is performed by sending a message to a specific object.
 *
 * @author ymbaek
 */
public class CommAction extends _SimAction_ {

    /** Attributes for CommAction */
    private ArrayList<_SimMessage_> messages;

    public CommAction(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName) {
        super(accessibleSoS, actionSubject, actionId, actionName);
    }

    public CommAction(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName, int actionDuration, float actionCost, float actionBenefit) {
        super(accessibleSoS, actionSubject, actionId, actionName, actionDuration, actionCost, actionBenefit);
    }

    @Override
    public boolean checkPrecondition() {
        return false;
    }

    @Override
    public ArrayList<SimLogEvent> executeAction(int tick) {
        return null;
    }

    @Override
    public String generateLogEventSpec() {
        return null;
    }
}
