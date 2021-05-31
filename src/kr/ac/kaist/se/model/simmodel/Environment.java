package kr.ac.kaist.se.model.simmodel;

import kr.ac.kaist.se.model.abst.obj._SimContainerObject_;

/**
 * Abstract class to represent an Environment (Env)
 * (1-tier _SimContainerObject_)
 *
 * According to the Meta-Model for Systems-of-Systems (M2SoS),
 * an environment consists of multiple external EnvElements (passive or active),
 * which interact with constituent objects of an SoS.
 *
 * @author ymbaek, ehcho, yjshin
 */
public abstract class Environment extends _SimContainerObject_ {

    //SoS that this object belongs to
    protected SoS mySoS;

    //Type of an environment
    protected EnumEnvType envType;

}
