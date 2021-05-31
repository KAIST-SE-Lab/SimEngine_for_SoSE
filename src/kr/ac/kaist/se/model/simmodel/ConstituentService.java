package kr.ac.kaist.se.model.simmodel;

import kr.ac.kaist.se.model.abst.obj._SimServiceEntity_;

public abstract class ConstituentService extends _SimServiceEntity_ {
    //SoS that this object belongs to
    protected SoS mySoS;
    //Infrastructure that this object belongs to
    protected Infrastructure myInfra;
}
