package kr.ac.kaist.se;

import kr.ac.kaist.se.controller.sim.SimEngine;
import kr.ac.kaist.se.model.simdata.input.configuration.SimConfiguration;
import kr.ac.kaist.se.model.simdata.input.rule.SimRule;
import kr.ac.kaist.se.model.simdata.input.scenario.SimScenario;
import kr.ac.kaist.se.model.simmodel.SoS;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * A main class of SimEngine to be used as a submodule
 * Other projects that use SimEngine module can call this main as follows:
 *      Execution.main(params)
 *
 * @author ymbaek, ehcho
 */
public class Execution {

    Timestamp timestamp;

    /**
     * A main method of SimEngine's Execution class to run SimEngine
     * Among the following arguments, simModel is mandatory and others are not.
     *
     * Based on projects, scenario, configuration, map, rule can be managed externally first,
     * and they can be given to SimEngine as external inputs.
     *
     * @param args              args[0]:isGuiModeOn, args[1]:isMapeOn
     * @param simModel          Simulation model to be simulated
     * @param simScenario       Simulation scenario to be executed by this SimEngine
     * @param simConfiguration  Simulation configuration for this simulation
     * @param simMapInitFile    Map initialization file to initialize an SoSMap of SimModel
     * @param simRules          A list of rules (policies) to be simulated
     */
    public static void main(String[] args,
                            SoS simModel,
                            SimScenario simScenario,
                            SimConfiguration simConfiguration,
                            String simMapInitFile,
                            ArrayList<SimRule> simRules) {

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("· Execution:main() method is executed");
        System.out.println("· \tsimModel: " + simModel);
        System.out.println("· \tsimScenario: " + simScenario);
        System.out.println("· \tsimConfiguration: " + simConfiguration);
        System.out.println("· \tsimMapInitFile: " + simMapInitFile);
        System.out.println("· \tsimRules: " + simRules);
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────");

        //Create a simEngine and initialize with required inputs
        SimEngine simEngine = new SimEngine(simModel, false, simScenario, simConfiguration, null, null);

        //Start simulation with the simEngine
        simEngine.startSimulation();
    }

}
