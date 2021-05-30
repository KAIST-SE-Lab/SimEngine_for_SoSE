package kr.ac.kaist.se.model.abst.obj;

import kr.ac.kaist.se.model.intf.DecisionMakeable;
import kr.ac.kaist.se.model.simdata.output.intermediate.RunResult;
import kr.ac.kaist.se.model.simdata.output.intermediate.UpdateResult;
import kr.ac.kaist.se.model.simmodel.data.DataVar;

import java.util.ArrayList;

/**
 * An abstract class to represent a system entity
 * ConstituentSystem is developed based on _SimSystemEntity_.
 * @author ymbaek
 */
public abstract class _SimSystemEntity_ extends _SimActionableEntity_ implements DecisionMakeable {

    /** System-specific attributes */
    protected EnumSystemType sysType;
    protected boolean isLegacy;
    protected boolean isHumanBased;

    /** Knowledge base of this constituent object */
    //Knowledge base of a single constituent
    protected ArrayList<DataVar> knowledgeBase;


    /* GETTERS & SETTERS */

    public EnumSystemType getSysType() {
        return sysType;
    }

    public void setSysType(EnumSystemType sysType) {
        this.sysType = sysType;
    }

    public boolean isLegacy() {
        return isLegacy;
    }

    public void setLegacy(boolean legacy) {
        isLegacy = legacy;
    }

    public boolean isHumanBased() {
        return isHumanBased;
    }

    public void setHumanBased(boolean humanBased) {
        isHumanBased = humanBased;
    }

    public ArrayList<DataVar> getKnowledgeBase() {
        return knowledgeBase;
    }

    public void setKnowledgeBase(ArrayList<DataVar> knowledgeBase) {
        this.knowledgeBase = knowledgeBase;
    }
}
