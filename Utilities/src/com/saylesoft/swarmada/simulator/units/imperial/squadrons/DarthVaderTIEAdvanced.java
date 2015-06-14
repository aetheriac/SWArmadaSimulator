package com.saylesoft.swarmada.simulator.units.imperial.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Unique;
import com.saylesoft.swarmada.simulator.utilities.DiePool;

/**
 * Created by dsayles on 6/10/15.
 */
public class DarthVaderTIEAdvanced extends TIEAdvanced implements Unique {
    public DarthVaderTIEAdvanced() {
        super();
        init();
    }

    public void init() {
        diePool.incrementSquadron(DiePool.BLACK_DIE);
    }
}
