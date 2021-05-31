import kr.ac.kaist.se.model.abst.cap._SimAction_;
import kr.ac.kaist.se.model.simdata.evnt.SimLogEvent;
import kr.ac.kaist.se.model.simmodel.SoS;

import java.util.ArrayList;

public class ExampleSoS extends SoS {

    @Override
    public ArrayList<SimLogEvent> doStateTransition(String newStateId, int tick) {
        return null;
    }

    @Override
    protected void initSoSModel() {

    }

    @Override
    protected void initMap() {

    }
}
