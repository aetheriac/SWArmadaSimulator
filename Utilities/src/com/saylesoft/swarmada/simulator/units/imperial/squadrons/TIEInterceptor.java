package com.saylesoft.swarmada.simulator.units.imperial.squadrons;

import com.saylesoft.swarmada.simulator.effectors.CounterX;
import com.saylesoft.swarmada.simulator.effectors.Swarm;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class TIEInterceptor extends Squadron implements CounterX, Swarm {
    public TIEInterceptor() {
        init();
    }

    protected void init() {
        setDamageCapacity(3);
        setMovement(5);
        diePool.setShipPool(0,1,0);
        diePool.setSquadronPool(0,4,0);
    }
}
