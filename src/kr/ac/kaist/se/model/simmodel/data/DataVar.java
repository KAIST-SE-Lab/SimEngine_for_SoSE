package kr.ac.kaist.se.model.simmodel.data;

import kr.ac.kaist.se.model.abst.data._SimVariable_;

/**
 * Concrete class to define information of a geolocation
 *
 * @author ymbaek
 */
public class DataVar extends _SimVariable_ {

    //Domain of a dimension variable
    protected DataVarDomain varDomain;



    /* GETTERS & SETTERS */

    public DataVarDomain getVarDomain() {
        return varDomain;
    }

    public void setVarDomain(DataVarDomain varDomain) {
        this.varDomain = varDomain;
    }
}
