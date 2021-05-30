package kr.ac.kaist.se.model.abst.obj;

import kr.ac.kaist.se.model.abst.comm._SimMessage_;
import kr.ac.kaist.se.model.intf.Communicateable;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Abstract class for representing an entity object
 * Entity objects can be specialized into (a)actionable and (b)non-actionable entities
 *
 * @author ymbaek
 */
public abstract class _SimEntityObject_ extends _SimObject_ implements Communicateable {

    /** Entity-specific attributes */
    protected EnumEntityType entityType;

    /** Attributes for communication (Communicateable) */
    //Queue for storing incoming messages from other objects
    protected Queue<_SimMessage_> msgQueue = new LinkedList<>();



    /* GETTERS & SETTERS */

    public EnumEntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EnumEntityType entityType) {
        this.entityType = entityType;
    }

    public Queue<_SimMessage_> getMsgQueue() {
        return msgQueue;
    }

    public void setMsgQueue(Queue<_SimMessage_> msgQueue) {
        this.msgQueue = msgQueue;
    }
}
