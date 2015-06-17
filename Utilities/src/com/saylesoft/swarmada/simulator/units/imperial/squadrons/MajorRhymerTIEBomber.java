package com.saylesoft.swarmada.simulator.units.imperial.squadrons;

import com.saylesoft.swarmada.simulator.effectors.Unique;
import com.saylesoft.swarmada.simulator.units.EliteSquadron;
import com.saylesoft.swarmada.simulator.utilities.DiePool;

/**
 * Created by dsayles on 6/10/15.
 */
public class MajorRhymerTIEBomber extends TIEBomber implements Unique, EliteSquadron {
    public MajorRhymerTIEBomber() {
        super();
        init();
    }

    public void init() {
        diePool.incrementSquadron(DiePool.BLUE_DIE);
    }
}
