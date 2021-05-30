package kr.ac.kaist.se.model.simmodel.data;

import kr.ac.kaist.se.model.abst.data._SimVariable_;

/**
 * Abstract class to define a dimension of a geolocation.
 *
 * To enable moving of entities,
 * increaseValueOfDim(..) and decreaseValueOfDim(..) should be implemented
 * to specify how an object can move according to the definition
 *
 * Note that this DimVar class is abstract,
 * so as to allow the definition of abstract classes according to a concrete dimension.
 *
 * @author ymbaek
 */
public abstract class DimVar extends _SimVariable_ {

    protected boolean isCyclic = false;

    //Domain of a dimension variable
    protected DimVarDomain varDomain;


    /**
     * A method to check if a new value is valid
     * @param diff difference from current value
     * @return true if a new value is valid
     */
    public abstract boolean checkUpdateValid(int diff);

    /**
     * A method to update value according to a given diff (0, +1, -1, ...)
     * @param diff difference from current value
     * @return true if the update is successfully performed
     */
    public abstract boolean updateValueOfDim(int diff);

    /**
     * A method to count the number of possible values of this dimVar
     * @return  the number counted
     */
    public int countPossibleValues(){
        //case of integer type
        if (type == "Int"){
            return (int)varDomain.getDomainMaxVal() - (int)varDomain.getDomainMinVal() + 1;
        }
        //case of enum type
        else{
            return varDomain.getDomainEnumVal().size();
        }
    }

    /**
     * A method to get value using index
     * @param index an index of stored data (e.g., 1st, 2nd, ...)
     * @return String-based value of the index
     */
    public String getValueWithIndex(int index){
        //case of integer type
        if (type == "Int"){
            return (int)varDomain.getDomainMinVal() + index + "";
        }
        //case of enum type
        else{
            return varDomain.getDomainEnumVal().get(index);
        }
    }


    /* GETTERS & SETTERS */

    public boolean isCyclic() {
        return isCyclic;
    }

    public void setCyclic(boolean cyclic) {
        isCyclic = cyclic;
    }

    public DimVarDomain getVarDomain() {
        return varDomain;
    }

    public void setVarDomain(DimVarDomain varDomain) {
        this.varDomain = varDomain;
    }
}
