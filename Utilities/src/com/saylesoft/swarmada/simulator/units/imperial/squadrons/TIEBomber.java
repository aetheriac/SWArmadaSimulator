package com.saylesoft.swarmada.simulator.units.imperial.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Bomber;
import com.saylesoft.swarmada.simulator.effectors.Heavy;
import com.saylesoft.swarmada.simulator.units.Squadron;

/**
 * Created by dsayles on 6/10/15.
 */
public class TIEBomber extends Squadron implements Bomber, Heavy {
    public TIEBomber() {
        init();
    }

    protected void init() {
        setDamageCapacity(5);
        setMovement(4);
        diePool.setShipPool(0,0,1);
        diePool.setSquadronPool(0,0,1);
    }
}
