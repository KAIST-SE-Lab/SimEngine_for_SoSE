package kr.ac.kaist.se.controller.util.map;

import kr.ac.kaist.se.model.simmodel.geo.SoSMap;

import java.sql.Timestamp;

public class MapManager {

    /* Timestamp for Logging/Snapshots */
    private Timestamp timestamp;

    /* SoSMap to manage */
    private SoSMap mapToManage;     // SoSMap
    private String simMapInitFile;  // Map initialization file


    public MapManager(SoSMap mapToManage, String simMapInitFile) {
        this.mapToManage = mapToManage;
        this.simMapInitFile = simMapInitFile;
    }
}
