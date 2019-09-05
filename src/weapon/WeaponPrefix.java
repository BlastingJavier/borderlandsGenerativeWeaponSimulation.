package weapon;

public enum WeaponPrefix {
    CRCOMMON(new String[] {"Deathly", "Scoped"}, new String[] {}),
    COMBATRIFLE(new String[] {"Intense", "Punishing", "Short"}, new String[] {"Combat", "Battle", "War", "Genocide"}),
    MACHINEGUN(new String[] {"Frantic", "Glorious", "Rowdy", "Shattering", "Support"}, new String[] {"Ligth", "Support", "Heavy", "Max"}),

    PISTOLCOMMON(new String[] {"Double", "Fanged", "Sighted", "Stabilized"}),
    REPEATERPISTOL(new String[] {"Nasty"}, new String[] {"Bad", "Cruel", "Wicked"}),
    MACHINEPISTOL(new String[] {"Cold"}, new String[] {"Mean", "Vile", "Grim"}),

    REVOLVER(new String[] {"Bladed", "Bloody", "Raw", "Swift", "Stabilized"}, new String[] {"Brutal", "Primal", "Savage"}),

    ROCKETLAUNCHER(new String[] {"Devastating", "Evil", "Helix", "Recoiless", "Spread", "Triple"}, new String[] {"Big", "Massive", "Colossal"}),

    SHOTGUN(new String[] {"Riot"}),
    ASSAULTSHOTGUN(new String[] {"Angry", "Painful", "Raging", "Spiked"}, new String[] {"Assault", "Grievous", "Lethal", "Fatal"}),
    COMBATSHOTGUN(new String[] {"Frenzied", "Hunter's", "Jagged"}, new String[] {"Terrible", "Battle", "War", "Genocide"}),

    SNIPERRILFE(new String[] {"Hard", "Solid", "Fearsome"}),
    PUMPACTIONSNIPERRIFLE(new String[] {"Distant", "Heavy", "Long"}),
    SEMIAUTOSNIPERRIFLE(new String[] {"Brisk", "Deep", "Sober", "Vicious", "Liquid"}),

    SMG(new String[] {"Double", "Relentless", "Ruthless", "Twisted"}, new String[] {"Patrol", "Hostile", "Violent", "Malevolent"});


    private final String[] specificType;
    private final String[] qualityType;

    WeaponPrefix(String[] specific, String[] quality) {
        this.qualityType = quality;
        this.specificType = specific;
    }

    public String[] getSpecificType() {
        return specificType;
    }

    public String[] getQualityType() {
        return qualityType;
    }

}