package kr.ac.kaist.se.model.abst.obj;

import java.util.ArrayList;

/**
 * Abstarct class for container classes
 * such as SoS, Organization, Infrastructure, and Environment
 *
 * @author ymbaek
 */
public abstract class _SimContainerObject_ extends _SimObject_{

    /** Attributes of a container */
    protected EnumContainerType containerType;

    /** Constituents of a container */
    protected ArrayList<_SimContainerObject_> subContainers;
    protected ArrayList<_SimEntityObject_> constituentEntities;


    /* GETTERS & SETTERS */

    public EnumContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType(EnumContainerType containerType) {
        this.containerType = containerType;
    }

    public ArrayList<_SimContainerObject_> getSubContainers() {
        return subContainers;
    }

    public void setSubContainers(ArrayList<_SimContainerObject_> subContainers) {
        this.subContainers = subContainers;
    }

    public ArrayList<_SimEntityObject_> getConstituentEntities() {
        return constituentEntities;
    }

    public void setConstituentEntities(ArrayList<_SimEntityObject_> constituentEntities) {
        this.constituentEntities = constituentEntities;
    }
}
