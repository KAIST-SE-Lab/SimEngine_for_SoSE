package kr.ac.kaist.se.controller.util.scenario;

import kr.ac.kaist.se.model.simdata.input.scenario.SimScenario;

import java.sql.Timestamp;

public class ScenarioManager {

    /* Timestamp for Logging/Snapshots */
    private Timestamp timestamp;

    /* SimScenario to manage */
    private SimScenario simScenarioToManage;

    public ScenarioManager(SimScenario simScenarioToManage) {
        this.simScenarioToManage = simScenarioToManage;
    }
}
