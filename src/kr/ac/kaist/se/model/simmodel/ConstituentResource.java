package kr.ac.kaist.se.model.simmodel;

import kr.ac.kaist.se.model.abst.obj._SimResourceEntity_;

public abstract class ConstituentResource extends _SimResourceEntity_ {
    //SoS that this object belongs to
    protected SoS mySoS;
    //Infrastructure that this object belongs to
    protected Infrastructure myInfra;
    //Infrastructure that this object belongs to
    protected Environment myEnv;
}
