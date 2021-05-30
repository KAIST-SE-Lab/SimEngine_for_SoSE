import kr.ac.kaist.se.Execution;
import kr.ac.kaist.se.model.simdata.input.configuration.SimConfiguration;
import kr.ac.kaist.se.model.simdata.input.scenario.SimScenario;
import kr.ac.kaist.se.model.simmodel.SoS;

/**
 * This Class is temporary, which is only used for independent execution of SimEngine.
 * Therefore, instead of running this Main, Execution.main(...) should be called for specific purposes.
 */
public class Main {
    public static void main(String[] args) {
        

        SimScenario simScenario = null;
        SimConfiguration simConfig = new SimConfiguration(10);

        Execution.main(null, null, simScenario, simConfig, null, null);

    }


}
