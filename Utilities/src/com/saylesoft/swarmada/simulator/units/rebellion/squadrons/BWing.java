package com.saylesoft.swarmada.simulator.units.rebellion.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Bomber;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class BWing extends Squadron implements Bomber {
    public BWing() {
        init();
    }

    protected void init() {
        setDamageCapacity(5);
        setMovement(2);
        diePool.setShipPool(0,1,1);
        diePool.setSquadronPool(0,3,0);
    }
}
