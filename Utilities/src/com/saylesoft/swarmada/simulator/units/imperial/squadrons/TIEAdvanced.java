package com.saylesoft.swarmada.simulator.units.imperial.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Escort;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class TIEAdvanced extends Squadron implements Escort {
    public TIEAdvanced() {
        init();
    }

    protected void init() {
        setDamageCapacity(5);
        setMovement(4);
        diePool.setShipPool(0,0,1);
        diePool.setSquadronPool(0,3,0);
    }
}
