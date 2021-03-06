package com.saylesoft.swarmada.simulator.units.rebellion.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Bomber;
import com.saylesoft.swarmada.simulator.effectors.Heavy;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class YWing extends Squadron implements Bomber, Heavy {
    public YWing() {
        init();
    }

    protected void init() {
        setDamageCapacity(6);
        setMovement(3);
        diePool.setShipPool(0,0,1);
        diePool.setSquadronPool(0,2,0);
    }
}
