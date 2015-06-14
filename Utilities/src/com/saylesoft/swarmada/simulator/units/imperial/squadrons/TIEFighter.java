package com.saylesoft.swarmada.simulator.units.imperial.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Swarm;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class TIEFighter extends Squadron implements Swarm {
    public TIEFighter() {
        init();
    }

    protected void init() {
        setDamageCapacity(3);
        setMovement(4);
        diePool.setShipPool(0,1,0);
        diePool.setSquadronPool(0,3,0);
    }
}
