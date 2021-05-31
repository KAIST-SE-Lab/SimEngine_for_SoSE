package kr.ac.kaist.se.model.simmodel;

import kr.ac.kaist.se.model.abst.obj._SimSystemEntity_;

public abstract class ConstituentSystem extends _SimSystemEntity_ {
    //SoS that this object belongs to
    protected SoS mySoS;
    //Organization that this object belongs to
    protected Organization myOrg;
}
