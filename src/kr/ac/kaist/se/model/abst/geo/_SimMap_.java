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
    protected ArrayList<DimVar> dimVars = new ArrayList<>();         //LocDimensions of this map
    protected ArrayList<DataVar> dataVars = new ArrayList<>();       //LocInformations of this map
    protected int numOfDims;

    /** Initialization of map */
    protected HashMap<String, ArrayList<DataVar>> locInfo = new HashMap<>(); //HashMap to store location information



    /**
     * A method for initialization of map dimensions (mapDimVars)
     * This method depends on dimensionVars defined for a concrete map
     */
    protected abstract void initMapDimensions();

    /**
     * Initialization of map data variables (mapDataVars)
     * This method depends on dimensionVars defined for a concrete map
     */
    protected abstract void initMapInformation();


    /**
     * A method to add a DimVar into mapDimVars
     * @param aDimVar DimVar to be added
     */
    protected void addDimVar(DimVar aDimVar){
        boolean isDuplicate = false;
        for (DimVar dimVar : dimVars){
            if (aDimVar.getId().equals(dimVar.getId())){
                isDuplicate = true;
            }
        }

        if (!isDuplicate){
            dimVars.add(aDimVar);
        }else{
            System.out.println("[" + this.getClass().getSimpleName() + "] addDimVar failed (duplicate id: " + aDimVar.getId() + ")");
        }
    }

    /**
     * A method to add a DataVar into mapDataVars
     * @param aDataVar DataVar to be added
     */
    protected void addDataVar(DataVar aDataVar){
        boolean isDuplicate = false;
        for (DataVar dataVar : dataVars){
            if (aDataVar.getId().equals(dataVar.getId())){
                isDuplicate = true;
            }
        }

        if (!isDuplicate){
            dataVars.add(aDataVar);
        }else{
            System.out.println("[" + this.getClass().getSimpleName() + "] addDataVar failed (duplicate id: " + aDataVar.getId() + ")");
        }
    }

    /**
     * Get a list of locData with a key
     * @param key   a key to be searched
     * @return      A list of locData objects
     */
    public ArrayList<DataVar> getLocDataWithKey(String key){
        return this.locInfo.get(key);
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
