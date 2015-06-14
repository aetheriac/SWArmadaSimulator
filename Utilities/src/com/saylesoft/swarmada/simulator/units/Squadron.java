package com.saylesoft.swarmada.simulator.units;

import com.saylesoft.swarmada.simulator.utilities.DiePool;

/**
 * Created by dsayles on 6/10/15.
 */
public abstract class Squadron {
    protected DiePool diePool = new DiePool();
    protected int damageCapacity = 0;
    protected int movement = 0;
    protected abstract void init();
    protected void setDamageCapacity(int dmgCap) { damageCapacity = dmgCap; }
    protected void setMovement(int move) { movement = move; }
    public boolean damage(int dmg) {
        damageCapacity-=dmg;
        if (damageCapacity <= 0) {
            return true;
        }
        return false;
    }
}
