package kr.ac.kaist.se.model.simmodel;

import kr.ac.kaist.se.model.abst.obj._SimContainerObject_;
import kr.ac.kaist.se.model.abst.obj._SimObject_;
import kr.ac.kaist.se.model.simdata.output.intermediate.RunResult;
import kr.ac.kaist.se.model.simdata.output.intermediate.UpdateResult;
import kr.ac.kaist.se.model.simmodel.geo.SoSMap;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * Abstract class to represent a SimModel of a System-of-Systems (SoS)
 * (0-tier _SimContainerObject_, i.e., an SoS object represents a whole simulation model)
 *
 * According to the Meta-Model for Systems-of-Systems (M2SoS),
 * an SoS is constructed by developing _SimContainerObjects_,
 * which consists of organization(s), infrastructure(s), environment(s),
 * and each _SimContainerObject_ consists of member objects.
 *
 * @author ymbaek, ehcho, yjshin
 */
public abstract class SoS extends _SimContainerObject_ {

    /** Map */
    public SoSMap sosMap;

    /** Member containers */
    //List of organizations
    protected ArrayList<Organization> orgList;
    //List of infrastructures
    protected ArrayList<Infrastructure> infraList;
    //List of environments
    protected ArrayList<Environment> envList;

    /** Member constituents */
    //List of all constituent systems
    protected ArrayList<ConstituentSystem> systemEntityList;

    /** Infrastructure/Environment entities */
    //List of infra service entities
    protected ArrayList<ConstituentService> serviceEntityList;
    //List of resource entities
    protected ArrayList<ConstituentResource> resourceEntityList;



    /**
     * Abstract method for the initialization of simulation models of an SoS.
     * (e.g., Org, Infra, Env, CSs, and so on.)
     * This method should be implemented to build a complete SoS model.
     */
    protected abstract void initSoSModel();

    /**
     * Abstract method for the initialization of a simulation map of an SoS
     */
    protected abstract void initMap();


    @Override
    public RunResult run(int curTick) {
        //TODO: implementation
        return null;
    }

    @Override
    public UpdateResult update(RunResult runResult, int curTick) {
        //TODO: implementation
        return null;
    }

    /**
     * Initialization of member lists
     */
    private void initLists() {

        orgList = new ArrayList<>();
        infraList = new ArrayList<>();
        envList = new ArrayList<>();

        systemEntityList = new ArrayList<>();
        serviceEntityList = new ArrayList<>();
        resourceEntityList = new ArrayList<>();
    }

    /**
     * A method to print member organizations recursively.
     *
     * @param org   An organization to be printed
     * @param depth Depths of organizations (for recursive execution)
     */
    private void printOrgsRecursively(Organization org, int depth) {

        //TODO: implementation
//        //System.out.println("parent: " + org.getParentOrg());
//
//        System.out.print("[" + timestamp + "]    ");
//        for (int i = 0; i < depth; i++) {
//            System.out.print("  ");
//        }
//        System.out.print("------------------------------------\n");
//
//        System.out.print("[" + timestamp + "]    ");
//        for (int i = 0; i < depth; i++) {
//            System.out.print("  ");
//        }
//
//        org.setOrgDepth(depth);
//
//        System.out.print("> [" + org.getId() +
//                " | depth(" + org.getOrgDepth() + ") " +
//                " | suborg size:" + org.subOrgList.size() +
//                " | all-member size:" + org.getAllMemberCSList().size() +
//                " | direct-member size:" + org.getDirectCSList().size() + "] \n");
//
//
//        /* All Member CSs */
//        System.out.print("[" + timestamp + "]    ");
//        for (int i = 0; i < depth; i++) {
//            System.out.print("  ");
//        }
//        System.out.print("└> All Members: ");
//        for (Constituent memberCS : org.allMemberCSList) {
//            System.out.print("[" + memberCS.getId() + "] ");
//        }
//        System.out.print("\n");
//
//        /* Direct CSs */
//        System.out.print("[" + timestamp + "]    ");
//        for (int i = 0; i < depth; i++) {
//            System.out.print("  ");
//        }
//        System.out.print("└> Direct Members: ");
//        for (Constituent memberCS : org.directCSList) {
//            System.out.print("[" + memberCS.getId() + "] ");
//        }
//        System.out.print("\n");
//
//
//        if (org.subOrgList.size() != 0) {
//            for (Organization aOrg : org.subOrgList) {
//                printOrgsRecursively(aOrg, depth + 1);
//            }
//        }

    }

    /**
     * Method to obtain an object of a member of this SimModel (SoS)
     *
     * @param objId unique id of object
     * @return object that has the given id
     */
    public _SimObject_ getMemberSimObjectById(String objId) {

        //TODO: implementation
//        //SoS
//        if (this.id.equals(objId)) {
//            return this;
//        }
//
//        for (Organization org : orgList) {
//            if (org.getId().equals(objId)) {
//                return org;
//            }
//        }
//        for (Infrastructure infra : infraList) {
//            if (infra.getId().equals(objId)) {
//                return infra;
//            }
//        }
//        for (Environment env : envList) {
//            if (env.getId().equals(objId)) {
//                return env;
//            }
//        }
//
//
//        for (ConstituentSystem systemEntity : systemEntityList) {
//            if (systemEntity.getId().equals(objId)) {
//                return systemEntity;
//            }
//        }
//        for (ConstituentService serviceEntity : serviceEntityList) {
//            if (serviceEntity.getId().equals(objId)) {
//                return serviceEntity;
//            }
//        }
//        for (ConstituentResource resourceEntity : resourceEntityList) {
//            if (resourceEntity.getId().equals(objId)) {
//                return resourceEntity;
//            }
//        }
//
//        //If any object is not found, null is returned.
        return null;
    }

    /**
     * A method to get all SimObjects of this SoS
     *
     * @return All SimObjects of this SoS
     */
    public ArrayList<_SimObject_> getAllSimObjects() {
        ArrayList<_SimObject_> allSimObjects = new ArrayList<>();

        //TODO: implementation
//        for (Organization aOrg : this.orgList) {
//            allSimObjects.add(aOrg);
//            for (Constituent aCS : aOrg.getDirectCSList()) {
//                allSimObjects.add(aCS);
//            }
//        }
//
//        for (Infrastructure aInfra : this.infraList) {
//            allSimObjects.add(aInfra);
//        }
//
//        for (Environment aEnv : this.envList) {
//            allSimObjects.add(aEnv);
//        }


        return allSimObjects;
    }


    /**
     * Check duplicate Ids of _SimObjects_ of an SoS
     *
     * @param objId an object's id to be checked
     * @return true if the given id is duplicate (i.e., it must be false if you want to add an object into a list)
     */
    public boolean isDuplicateId(String objId) {
        //There is no duplicate id
        return getMemberSimObjectById(objId) != null;    //There is a duplicate id
    }



    /* ADDERS & REMOVERS */

    public void addOrg(Organization aOrg){
        //TODO: implementation
    }

    public void removeOrg(Organization aOrg){
        //TODO: implementation
    }

    public void addInfra(Infrastructure aInfra){
        //TODO: implementation
    }

    public void removeInfra(Infrastructure aInfra){
        //TODO: implementation
    }

    public void addEnv(Environment aEnv){
        //TODO: implementation
    }

    public void removeEnv(Environment aEnv){
        //TODO: implementation
    }

    public void addSystem(ConstituentSystem aCS){
        //TODO: implementation
    }

    public void removeSystem(ConstituentSystem aCS){
        //TODO: implementation
    }

    public void addService(ConstituentService aSvc){
        //TODO: implementation
    }

    public void removeService(ConstituentService aSvc){
        //TODO: implementation
    }

    public void addResource(ConstituentResource aRes){
        //TODO: implementation
    }

    public void removeResource(ConstituentResource aRes){
        //TODO: implementation
    }


    /* GETTERS & SETTERS */

    public SoSMap getSosMap() {
        return sosMap;
    }

    public void setSosMap(SoSMap sosMap) {
        this.sosMap = sosMap;
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Organization> orgList) {
        this.orgList = orgList;
    }

    public ArrayList<Infrastructure> getInfraList() {
        return infraList;
    }

    public void setInfraList(ArrayList<Infrastructure> infraList) {
        this.infraList = infraList;
    }

    public ArrayList<Environment> getEnvList() {
        return envList;
    }

    public void setEnvList(ArrayList<Environment> envList) {
        this.envList = envList;
    }

    public ArrayList<ConstituentSystem> getSystemEntityList() {
        return systemEntityList;
    }

    public void setSystemEntityList(ArrayList<ConstituentSystem> systemEntityList) {
        this.systemEntityList = systemEntityList;
    }

    public ArrayList<ConstituentService> getServiceEntityList() {
        return serviceEntityList;
    }

    public void setServiceEntityList(ArrayList<ConstituentService> serviceEntityList) {
        this.serviceEntityList = serviceEntityList;
    }

    public ArrayList<ConstituentResource> getResourceEntityList() {
        return resourceEntityList;
    }

    public void setResourceEntityList(ArrayList<ConstituentResource> resourceEntityList) {
        this.resourceEntityList = resourceEntityList;
    }
}
