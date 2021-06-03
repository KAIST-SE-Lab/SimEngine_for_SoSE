package kr.ac.kaist.se.controller.util.rule;

import kr.ac.kaist.se.model.simdata.input.rule.SimRule;

import java.sql.Timestamp;
import java.util.ArrayList;

public class RuleManager {

    /* Timestamp for Logging/Snapshots */
    private Timestamp timestamp;

    /* SimRule to manage */
    private ArrayList<SimRule> rulesToManage;

    public RuleManager(ArrayList<SimRule> rulesToManage) {
        this.rulesToManage = rulesToManage;
    }
}
