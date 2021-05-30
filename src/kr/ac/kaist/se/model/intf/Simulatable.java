package kr.ac.kaist.se.model.intf;

import kr.ac.kaist.se.model.simdata.output.intermediate.RunResult;
import kr.ac.kaist.se.model.simdata.output.intermediate.UpdateResult;

/**
 * Interface for simulatable objects.
 * Simulatable objects can execute run(..) and update(..) methods.
 *
 * @author ymbaek
 */
public interface Simulatable {


    /**
     * The method run() executes own behaviors, such as actions,
     * by selecting actions among capable actions (a set of actions, i.e., actionList).
     *
     * @param curTick current tick of simulation
     * @return selected actions (result of the action selection)
     */
    RunResult run(int curTick);


    /**
     * The method update() actually executes behaviors allowed by the SimEngine.
     *
     * @param runResult runResult object (i.e., actions allowed to be executed) of current tick
     * @param curTick current tick of simulation
     * @return list of action execution results (i.e., logs)
     */
    UpdateResult update(RunResult runResult, int curTick);
}
