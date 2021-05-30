package kr.ac.kaist.se.model.abst.geo;

import kr.ac.kaist.se.model.simmodel.data.DataVar;
import kr.ac.kaist.se.model.simmodel.data.DimVar;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Abstract class to represent a geographical map of an SoS
 * @author ymbaek, sjlee
 */
public abstract class _SimMap_ {

    /** Map-specific attributes */
    protected String id;             //id of a map
    protected String name;           //name of a map

    /** Input file for map initialization (.txt) */
    protected String initFile;

    /** ArrayLists for MapDimensions and MapInformation */
    private ArrayList<DimVar> dimVars = new ArrayList<>();         //LocDimensions of this map
    private ArrayList<DataVar> dataVars = new ArrayList<>();       //LocInformations of this map
    private int numOfDims;

    /** Initialization of map */
    protected HashMap<String, ArrayList<DataVar>> locInfo = new HashMap<>(); //HashMap to store location information




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

    public String getInitFile() {
        return initFile;
    }

    public void setInitFile(String initFile) {
        this.initFile = initFile;
    }

    public ArrayList<DimVar> getDimVars() {
        return dimVars;
    }

    public void setDimVars(ArrayList<DimVar> dimVars) {
        this.dimVars = dimVars;
    }

    public ArrayList<DataVar> getDataVars() {
        return dataVars;
    }

    public void setDataVars(ArrayList<DataVar> dataVars) {
        this.dataVars = dataVars;
    }

    public int getNumOfDims() {
        return numOfDims;
    }

    public void setNumOfDims(int numOfDims) {
        this.numOfDims = numOfDims;
    }

    public HashMap<String, ArrayList<DataVar>> getLocInfo() {
        return locInfo;
    }

    public void setLocInfo(HashMap<String, ArrayList<DataVar>> locInfo) {
        this.locInfo = locInfo;
    }
}
