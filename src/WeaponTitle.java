package weapon;


public enum WeaponTitle {
    COMBATRIFLE(new String[] {"Rifle", "Cobra", "Pounder", "Stomper"}),
    AUTIMATICRIFLE(new String[] {"Machine Gun", "Havoc", "Mauler", "Massacre"}),
    
    REPEATERPISTOL(new String[] {"Repeater", "Lacerator", "Needler", "Swatter", "Raptor"}),
    MACHINEPISTOL(new String[] {"Machine Pistol", "Torment", "Fury", "Rage"}),

    REVOLVER(new String[] {"Revolver", "Razor", "Masher", "Justice", "Law", "Viper"}),
    
    ROCKETLAUNCHER(new String[] {"Rocket Launcher", "Destructor", "Masher", "Harpoon"}),

    SHOTGUN(new String[] {"Shotgun"}),
    COMBATSHOTGUN(new String[] {"Matador", "Scattergun", "Shredder", "Carnage"}),
    ASSAULTSHOTGUN(new String[] {"Brute", "Death", "Sweeper"}),

    SNIPERRIFLE(new String[] {"Sniper"}),
    PUMPACTIONSNIPERRIFLE(new String[] {"Gamble", "Hawkeye", "Thunder"}),
    SEMIAUTOSNIPERRIFLE(new String[] {"Lance", "Thunder", "Wrath"}),

    SMG(new String[] {"SMG", "Anarchy", "Bruiser", "Thumper", "Stinger"});

    private final String[] titles;

    WeaponTitle(String[] titles) {
        titles = titles;
    }

    private String[] getTitles() {
        return titles;
    }

}
