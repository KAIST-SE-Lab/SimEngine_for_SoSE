package kr.ac.kaist.se.model.abst.data;

/**
 * An abstract class to specify a (data) variable, which has a specific type
 * @author ymbaek
 */
public abstract class _SimVariable_ {

    /** Variable-specific attributes */
    protected String id;            //id of a data (variable)
    protected String name;          //name of a data (variable)
    protected String type;          //type of a data (variable)

    protected boolean isEnumData = false;
    protected boolean isValueAssigned = false;
    protected boolean isDomainConstrained = false;

    /** Actual value assigned to this variable */
    protected Integer integerData;  //Actual integer-type data
    protected Float floatData;      //Actual float-type data
    protected String stringData;    //String-type or Enum data

    /** Default and current value of this variable */
    private String defaultValue;    //default value of a data (variable)
    private String curValue;        //current value of a data (variable)

    /**
     * A method to check if the given value is valid according to its domain definition.
     * If the dataValue exceeds the domain or outlies from the domain, it returns false.
     *
     * @param dataValue a value to be checked
     * @return true if the given value is valid
     */
    protected boolean isValidValueContained(String dataValue) {
        return true;
    }


    /**
     * An implemented method of Cloneable interface
     * @return cloned object of this class
     */
    public _SimVariable_ clone() {
        _SimVariable_ dimVar = null;

        try {
            dimVar = (_SimVariable_) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return dimVar;
    }



    /* GETTERS & SETTERS */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEnumData() {
        return isEnumData;
    }

    public void setEnumData(boolean enumData) {
        isEnumData = enumData;
    }

    public boolean isValueAssigned() {
        return isValueAssigned;
    }

    public void setValueAssigned(boolean valueAssigned) {
        isValueAssigned = valueAssigned;
    }

    public boolean isDomainConstrained() {
        return isDomainConstrained;
    }

    public void setDomainConstrained(boolean domainConstrained) {
        isDomainConstrained = domainConstrained;
    }

    public Integer getIntegerData() {
        return integerData;
    }

    public void setIntegerData(Integer integerData) {
        this.integerData = integerData;
    }

    public Float getFloatData() {
        return floatData;
    }

    public void setFloatData(Float floatData) {
        this.floatData = floatData;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getCurValue() {
        return curValue;
    }

    public void setCurValue(String curValue) {
        this.curValue = curValue;
    }
}
