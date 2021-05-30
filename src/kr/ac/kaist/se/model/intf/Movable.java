package kr.ac.kaist.se.model.intf;

import kr.ac.kaist.se.model.abst.cap._SimAction_;

import java.util.ArrayList;

/**
 * Interface for objects that can geographically move.
 * Movable objects can execute move(..) by executing a MoveAction(s).
 *
 * @author ymbaek
 */
public interface Movable {

    /**
     * Every Movable has its current location information,
     * thus curLocation can be obtained by calling this method
     *
     * @return current location of this object
     */
    String getCurLocation();

    /**
     * Select a move action(s) among possible move actions.
     * A proper mechanism to select move actions should be implemented in a movable object.
     *
     * @param possibleMoveActions MoveActions that can be executed
     * @return List of selected move actions
     */
    ArrayList<_SimAction_> selectMoveActions(ArrayList<_SimAction_> possibleMoveActions);
}
