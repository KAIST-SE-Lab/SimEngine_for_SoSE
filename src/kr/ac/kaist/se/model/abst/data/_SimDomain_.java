package kr.ac.kaist.se.model.abst.data;

import java.util.ArrayList;

/**
 * An abstract class to specify a domain of a variable (_SimVariable_)
 * @author ymbaek
 */
public abstract class _SimDomain_ {

    /** Domain-specific attributes */
    protected EnumDomainType domainType = EnumDomainType.NOT_DETERMINED; //Type of domain


    /** Specification of domain (range of values) */
    protected float domainMinVal = -99999;  //Minimum value
    protected float domainMaxVal = 99999;  //Maximum value

    protected ArrayList<String> domainEnumVal = new ArrayList<>();  //Allowed enumeration values


    /**
     * A method to check if a given value is valid according to this domain.
     * This method is overloaded for integer-type value.
     *
     * @param value value to be checked
     * @return true if a given value is valid
     */
    /* For integer variable */
    public boolean isValidValue(int value) {
        if (domainType == EnumDomainType.VALUE_RANGE_DISCRETE) {
            //If the value is lower than domainMinVal or exceeds domainMaxVal
            return value >= domainMinVal && value <= domainMaxVal;
        }
        //Wrong domainType
        else {
            return false;
        }
    }

    /**
     * A method to check if a given value is valid according to this domain.
     * This method is overloaded for float-type value.
     *
     * @param value value to be checked
     * @return true if a given value is valid
     */
    /* For float variable */
    public boolean isValidValue(float value) {
        if (domainType == EnumDomainType.VALUE_RANGE_CONTINUOUS) {
            //If the value is lower than domainMinVal or exceeds domainMaxVal
            return value >= domainMinVal && value <= domainMaxVal;
        }
        //Wrong domainType
        else {
            return false;
        }
    }

    /**
     * A method to check if a given value is valid according to this domain.
     * This method is overloaded for enumeration-type value.
     *
     * @param value value to be checked
     * @return true if a given value is valid
     */
    /* For enumeration variable */
    public boolean isValidValue(String value) {
        boolean isAllowed = false;
        if (domainType == EnumDomainType.ENUMERATION) {
            //If the value is lower than domainMinVal or exceeds domainMaxVal
            for (String allowedString : domainEnumVal) {
                if (value.equals(allowedString)) {
                    isAllowed = true;
                }
            }
        }
        //Wrong domainType
        else {
            return false;
        }
        return isAllowed;
    }



    /* GETTERS & SETTERS */

    public EnumDomainType getDomainType() {
        return domainType;
    }

    public void setDomainType(EnumDomainType domainType) {
        this.domainType = domainType;
    }

    public float getDomainMinVal() {
        return domainMinVal;
    }

    public void setDomainMinVal(float domainMinVal) {
        this.domainMinVal = domainMinVal;
    }

    public float getDomainMaxVal() {
        return domainMaxVal;
    }

    public void setDomainMaxVal(float domainMaxVal) {
        this.domainMaxVal = domainMaxVal;
    }

    public ArrayList<String> getDomainEnumVal() {
        return domainEnumVal;
    }

    public void setDomainEnumVal(ArrayList<String> domainEnumVal) {
        this.domainEnumVal = domainEnumVal;
    }
}
