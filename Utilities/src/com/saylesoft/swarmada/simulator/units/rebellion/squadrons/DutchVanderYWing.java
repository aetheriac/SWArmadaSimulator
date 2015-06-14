package com.saylesoft.swarmada.simulator.units.rebellion.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Unique;
import com.saylesoft.swarmada.simulator.utilities.DiePool;

/**
 * Created by dsayles on 6/10/15.
 */
public class DutchVanderYWing extends YWing implements Unique {

    public DutchVanderYWing() {
        super();
        init();
    }

    public void init() {
        diePool.incrementSquadron(DiePool.BLUE_DIE);
    }
}
