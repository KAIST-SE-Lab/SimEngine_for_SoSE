package kr.ac.kaist.se.model.simmodel.geo;

import kr.ac.kaist.se.controller.util.map.MapBuilder;
import kr.ac.kaist.se.model.abst.geo._SimMap_;
import kr.ac.kaist.se.model.simmodel.data.DimVar;

import java.util.ArrayList;

/**
 * A class to represent a geographical map of an SoS
 * @author ymbaek
 */
public abstract class SoSMap extends _SimMap_ {

    /** MapBuilder */
    protected MapBuilder mapBuilder; //MapBuilder to initialize and update a map

    /**
     * A method to initially assign data values into mapLocInfo hashmap.
     * This mathod is called only if there is a file for the initialization.
     */
    protected void initMapLocInfo(String mapInitFileName){
        //TODO: implementation
    }

    /**
     * A method to initialize keys of mapLoc hashmap (mapLocInfo).
     * Initially, values of the hashmap are initialized as default values
     */
    private void initMapLocKeys(){
        //TODO: implementation
    }

    /**
     * A method to initialize dimVars of a map as minimum values
     */
    private void initMapDimVarsAsMinVal(){
        //Set dataCurValues as minimum values allowed by their domains
        for (DimVar mapDimVar : dimVars){
            initMapDimVarAsMinVal(mapDimVar);
        }
    }

    /**
     * A method to initialize a dimvar as a minimum value
     * @param aDimVar A dimVar to be initialized
     */
    private void initMapDimVarAsMinVal(DimVar aDimVar){
        if (aDimVar.getType().equals("Int")) {
            aDimVar.setCurValue((int) aDimVar.getVarDomain().getDomainMinVal() + "");
        } else {
            aDimVar.setCurValue(aDimVar.getVarDomain().getDomainEnumVal().get(0) + "");
        }
    }

    /**
     * A method to make string-based keys of a map hashmap (mapLocInfo)
     * @return A list of keys generated
     */
    private ArrayList<String> makeKeyStrings(){
        //TODO: implementation
        return null;
    }


    /* GETTERS & SETTERS */

    public MapBuilder getMapBuilder() {
        return mapBuilder;
    }

    public void setMapBuilder(MapBuilder mapBuilder) {
        this.mapBuilder = mapBuilder;
    }
}
