package com.saylesoft.swarmada.simulator.units.rebellion.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Unique;
import com.saylesoft.swarmada.simulator.utilities.DiePool;

/**
 * Created by dsayles on 6/10/15.
 */
public class KeyanFarlanderBWing extends BWing implements Unique {
    public KeyanFarlanderBWing() {
        super();
        init();
    }

    public void init() {
        diePool.incrementShip(DiePool.BLACK_DIE);
        diePool.decrementShip(DiePool.BLUE_DIE);
    }
}
