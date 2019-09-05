package manufactuer;

import java.util.Collections;

public enum PossibleWeaponsbyManufactuer {
    ATLAS(new String[] {"CombatShotgun", "MachineGun", "RepeaterPistol",
        "Revolver", "PumpActionSniperRifle"}),//atlas
    DAHL(new String[] {"CombatRifle", "CombatShotgun", "RepeaterPistol",
        "Revolver", "SemiAutoSniper", "SMG"}),//dahl
    HYPERION(new String[] {"AssaultShotgun","CombatRifle", "MachinePistol",
            "RocketLauncher", "RepeaterPistol","SemiAutoSniper", "SMG" }), //hyperion
    GEARBOX(new String[] {"AssaultShotgun","CombatRifle", "CombatShotgun", "MachineGun","MachinePistol",
            "RepeaterPistol","RocketLauncher", "Revolver", "SemiAutoSniperRifle", "PumpActionSniperRifle", "SMG" }), //hyperion
    JACKOBS(new String[] {"CombatShotgun", "Revolver","PumpActionSniperRifle"}), //jackobs
    MALIWAN(new String[] {"AssaultShotgun", "Revolver", "RepeaterPistol", "RocketLauncher",
            "PumpActionSniperRifle", "SMG"}),//maliwan
    SANDS(new String[] {"AssaultShotgun", "MachineGun", "MachinePistol", "RepeaterPistol",
            "SemiAutoSniperRifle"}),//sands
    TEDIORE(new String[] {"CombatRifle", "CombatShotgun", "Revolver", "RepeaterPistol","SMG"}),//tediore
    TORGUE(new String[] {"CombatShotgun", "MachineGun", "RepeaterPistol",
            "RocketLauncher", "SemiAutoSniperRifle","SMG"}),//Torgue     
    VLADOF(new String[] {"AssaultRifle", "MachineGun", "MachinePistol", "RepeaterPistol",
            "RocketLauncher", "PumpActionSniperRifle"}),//vladof
    ERIDIAN(new String[] {"Eridian"});
    private final String[] list;
    PossibleWeaponsbyManufactuer(String[] list) {
        list = list;
    }

    public String[] getArray() {
        return list;
    }
}