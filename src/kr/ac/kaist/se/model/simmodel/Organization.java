package kr.ac.kaist.se.model.simmodel;

import kr.ac.kaist.se.model.abst.obj._SimContainerObject_;

import java.util.ArrayList;

/**
 * Abstract class to represent an Orgniazation (Org)
 * (1-tier _SimContainerObject_)
 *
 * According to the Meta-Model for Systems-of-Systems (M2SoS),
 * an organization consists of multiple SystemEntities,
 * and driven by a task(s) to be accomplished by collective capabilities of the SystemEntities.
 *
 * @author ymbaek, ehcho, yjshin
 */
public abstract class Organization extends _SimContainerObject_ {

    //SoS that this object belongs to
    protected SoS mySoS;
    //Organization that this organization belongs to
    protected Organization parentOrg;

    //Depth of this organization in an organizational structure
    protected int orgDepth;

    //Type of an Organization(" + this.id + "): DIR,ACK,COL,VIR
    protected EnumOrgType orgType;

    //Sub organizations
    protected ArrayList<Organization> subOrgList;

}
