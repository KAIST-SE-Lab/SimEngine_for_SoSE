package kr.ac.kaist.se.model.intf;

/**
 * Interface for SimObjects that can make own decisions.
 * DecisionMAkeable objects can execute doDecisionMaking(..).
 *
 * @author ymbaek
 */
public interface DecisionMakeable {

    /**
     * A method to make decisions (select actions)
     */
    //TODO: check return
    void doDecisionMaking();
}
