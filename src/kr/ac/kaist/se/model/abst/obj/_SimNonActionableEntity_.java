package kr.ac.kaist.se.model.abst.obj;

import kr.ac.kaist.se.model.simdata.output.intermediate.RunResult;
import kr.ac.kaist.se.model.simdata.output.intermediate.UpdateResult;

/**
 * Abstract class for an object that cannot execute its own behaviors
 *
 * @author ymbaek
 */
public abstract class _SimNonActionableEntity_ extends _SimEntityObject_{

    /** Attributes of Non-Actionable Entity */
    // Id of reference
    protected String referenceId;


    /* GETTERS & SETTERS */

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
}
