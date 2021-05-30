package kr.ac.kaist.se.model.simmodel.cap;

import kr.ac.kaist.se.model.abst.cap._SimAction_;
import kr.ac.kaist.se.model.abst.obj._SimObject_;
import kr.ac.kaist.se.model.simmodel.SoS;

/**
 * An abstract class to represent a general functional action.
 * If a system need to include actions, concrete action classes inheriting FuncAction are needed.
 *
 * @author ymbaek
 */
public abstract class FuncAction extends _SimAction_ {
    public FuncAction(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName) {
        super(accessibleSoS, actionSubject, actionId, actionName);
    }

    public FuncAction(SoS accessibleSoS, _SimObject_ actionSubject, String actionId, String actionName, int actionDuration, float actionCost, float actionBenefit) {
        super(accessibleSoS, actionSubject, actionId, actionName, actionDuration, actionCost, actionBenefit);
    }
}
