package kr.ac.kaist.se.model.intf;

import kr.ac.kaist.se.model.simmodel.data.DataVar;

import java.util.ArrayList;

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

    /**
     * A method to add or update received msg data to CS's knowledge base
     * @param dataList  list of data to be updated
     */
    void updateDataToKnowledgeBase(ArrayList<DataVar> dataList);
}
