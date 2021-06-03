package kr.ac.kaist.se.controller.util.configuration;

import kr.ac.kaist.se.model.simdata.input.configuration.SimConfiguration;

import java.sql.Timestamp;

public class ConfigurationManager {

    /* Timestamp for Logging/Snapshots */
    private Timestamp timestamp;

    /* Configuration to manage */
    private SimConfiguration simConfigToManage;


    public ConfigurationManager(SimConfiguration simConfigToManage) {
        this.simConfigToManage = simConfigToManage;
    }
}
