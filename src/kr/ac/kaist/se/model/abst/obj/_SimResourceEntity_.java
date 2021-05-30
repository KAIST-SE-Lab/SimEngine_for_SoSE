package kr.ac.kaist.se.model.abst.obj;

import kr.ac.kaist.se.model.intf.Occupiable;

/**
 * An abstract class to represent a resource entity
 * ConstituentResource is developed based on _SimResourceEntity_.
 * @author ymbaek
 */
public abstract class _SimResourceEntity_ extends _SimNonActionableEntity_ implements Occupiable {

    /** Resource-specific attributes */
    protected EnumResType resType;
    protected EnumResOwnerType resOwnerType;
    protected EnumResLocation resLocation;


    /* GETTERS & SETTERS */

    public EnumResType getResType() {
        return resType;
    }

    public void setResType(EnumResType resType) {
        this.resType = resType;
    }

    public EnumResOwnerType getResOwnerType() {
        return resOwnerType;
    }

    public void setResOwnerType(EnumResOwnerType resOwnerType) {
        this.resOwnerType = resOwnerType;
    }

    public EnumResLocation getResLocation() {
        return resLocation;
    }

    public void setResLocation(EnumResLocation resLocation) {
        this.resLocation = resLocation;
    }
}
