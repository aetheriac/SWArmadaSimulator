package com.saylesoft.swarmada.simulator.units.rebellion.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Bomber;
import com.saylesoft.swarmada.simulator.effectors.Escort;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class XWing extends Squadron implements Bomber, Escort {
    public XWing() {
        init();
    }

    protected void init() {
        setDamageCapacity(5);
        setMovement(3);
        diePool.setShipPool(1,0,0);
        diePool.setSquadronPool(0,4,0);
    }
}
