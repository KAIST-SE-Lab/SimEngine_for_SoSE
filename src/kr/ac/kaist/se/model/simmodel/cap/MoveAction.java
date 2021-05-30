package kr.ac.kaist.se.model.simmodel.cap;

import kr.ac.kaist.se.model.abst.cap._SimAction_;
import kr.ac.kaist.se.model.abst.obj._SimObject_;
import kr.ac.kaist.se.model.simdata.evnt.SimLogEvent;
import kr.ac.kaist.se.model.simmodel.SoS;
import kr.ac.kaist.se.model.simmodel.data.DimVar;

import java.util.ArrayList;

/**
 * A concrete class to represent an action for geographical movement.
 *
 * @author ymbaek
 */
public class MoveAction extends _SimAction_ {

    /** Attributes for MoveAction */
    private ArrayList<DimVar> allowedDims;

    private ArrayList<String> allowedDimVarIds; //Ids of allowed dimensions
    private ArrayList<Integer> dimVarDiffList;

    public MoveAction(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName) {
        super(accessibleSoS, actionSubject, actionId, actionName);
    }

    public MoveAction(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName, int actionDuration, float actionCost, float actionBenefit) {
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
