package kr.ac.kaist.se.model.intf;

import kr.ac.kaist.se.model.abst.comm._SimMessage_;
import kr.ac.kaist.se.model.simmodel.cap.CommAction;

/**
 * Interface for objects that can communicate with other objects.
 * Communicatable objects can execute sendMsg(..) and readIncomingMsgs(..).
 *
 * @author ymbaek
 */
public interface Communicateable {

    /**
     * Initialization of communication actions
     */
    void initCommActions();


    /**
     * Read incoming messages from its own msgQueue.
     * According to its implementation, messages are differently handled.
     */
    void readIncomingMsgs();

    /**
     * A method to find an id of a receiver object from SoS with a search condition
     * @param condition Search condition
     * @return An id of a receiver object found
     */
    String findReceiverObjIdFromSoS(String condition);

    /**
     * Make a message for a communication action
     * @param aCommAction
     * @return
     */
    _SimMessage_ makeMsgForCommAction(CommAction aCommAction);
}
