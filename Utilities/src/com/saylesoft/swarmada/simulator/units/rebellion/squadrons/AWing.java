package com.saylesoft.swarmada.simulator.units.rebellion.squadrons;

import com.saylesoft.swarmada.simulator.effectors.CounterX;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class AWing extends Squadron implements CounterX {
    public AWing() {
        init();
    }

    protected void init() {
        setDamageCapacity(4);
        setMovement(5);
        diePool.setShipPool(0,0,1);
        diePool.setSquadronPool(0,3,0);
    }

}
