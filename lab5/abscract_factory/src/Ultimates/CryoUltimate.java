package Ultimates;

import Abstruction.IUltimateAbility;

public class CryoUltimate implements IUltimateAbility {

    @Override
    public void useUltimate() {
        System.out.println("Unleashing Cryo Burst!");
    }
}
