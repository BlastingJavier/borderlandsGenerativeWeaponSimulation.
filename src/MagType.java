package weapon;


public enum MagType {
    //Damage, accuracy, firerate, techLevel, recoilred, reloadSpeed, burstFire, plusRounds
    COMBATRIFLE(new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0},
                new Integer[] {52 , 0  , -200, 0   , 0   , 40  , -200, 6}, //
                new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , -30 , 6},
                new Integer[] {0  , 0  , 0   , 3   , 0   , -30 , 200 , 9},
                new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0}),

    MACHINEGUN(new Integer[] {0  , 0  , 0   , 0   , 0   , 15   , 0   , 0},
                new Integer[] {15 , 0  , 0   , 0   , 0   , 25  , 0   , 12}, //
                new Integer[] {18 , 0  , -50 , 1   , 0   , 30  , 0   ,  24},
                new Integer[] {18 , 0  , -50 , 1   , 0   , 35  , 0   , 24},
                new Integer[] {18 , 0  , -50 , 1   , 100 , -40 , -300, 56}),

    REPEATERPISTOL(new Integer[] {0  , 0  , 0   , 0   , 0   , 30   , 0   , 0},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 4}, //
            new Integer[] {0  , 0  , 0   , 0   , 0   , 50  , 0   , 6},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 12},
            new Integer[] {12 , 0  , 20  , 0   , 0   , 15   , 0   , 22}),

    MACHINEPISTOL(new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 60}, //
            new Integer[] {0  , 0  , 0   , 0   , 20  , 25   , 0  , 30},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0}),

    REVOLVER(new Integer[]{-18, 0  , 0   , 0   , 0   , 30   , 0   , 0},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0}, //
            new Integer[] {0  , 0  , 0   , 0   , 3   , 15  , 0   , -3},
            new Integer[] {0  , 0  , 21  , 0   , 0   , 100 , 0   , 0},
            new Integer[] {102, 0  , 0   , 2   , 0   , 50  , 0   , -4}),

    ROCKETLAUNCHER(new Integer[] {0  , 0  , 0   , 0   , 0   , 10   , 0   , 0},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0},
            new Integer[] {0  , 0  , 0   , 0   , 0   , 30  , 0   , 0}, //
            new Integer[] {15 , 0  , 0   , 0   , 0   , -30 , 0   , 0},
            new Integer[] {1  , 0  , 0   , 0   , 0   , 40  , 0   , 2}),

    SHOTGUN(new Integer[] {-18  , 0  , 0   , 0   , 0   , 40   , 0   , 0},
                new Integer[] {0  , 0  , 0   , 0   , 0   , -60 , 0   , 6}, //
                new Integer[] {0  , 0  , 20  , 2   , 0   , 50  , 0   , 14},
                new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0},
                new Integer[] {102, 0  , 0   , 0   , 0   , 50   , 0  , -4}),

    BOLTACTIONSNIPER(new Integer[] {0  , 0  , 0   , 0   , 0   , O   , 0   , 0},
                    new Integer[] {0  , 0  , 0   , 0   , 0   , 0    , 0   ,  0},
                    new Integer[] {21 , 0  , 0   , 3   , 0   , 15   , 0   , -3}, //
                    new Integer[] {0  , 0  , 21  , 3   , 0   , 40   , 0   , 0},
                    new Integer[] {0  , 0  , 0   , 0   , 0   , 0    , 0   , 0}),

    SEMIAUTOSNIPER(new Integer[] {0  , 0  , 0   , 0   , 0   , O   , 0   , 0},
                    new Integer[] {0  , 0  , 0   , 0   , 0   , 0   , 0   , 0},
                    new Integer[] {0  , 0  , 0   , 0   , 0   , O   , 0   , 0}, //
                    new Integer[] {0  , 0  , 0   , 0   , 0   , O   , 0   , 0},
                    new Integer[] {0  , 0  , 21  , 0   , 0   , 50  , 0   , 2}),

    SUBMACHINEGUN(new Integer[] {70  , 0  ,-200   , 0   , 0   , 25   , 0   , -10},
                new Integer[] {0  , 0  , 0   , 0   , 0   , 15  , 0   , 0}, //
                new Integer[] {0  , 0  , 0   , 2   , 0   , 20  , 0   , 8},
                new Integer[] {0  , 0  , 0   , 0   , 0   , -60 , 0   , 27},
                new Integer[] {0  , 0  , 0   , 1   , 0   , -40 , 0  , 18});

    private final Integer[] mag1Stats;
    private final Integer[] mag2Stats;
    private final Integer[] mag3Stats;
    private final Integer[] mag4Stats;
    private final Integer[] mag5Stats;

    
    BodyType(Integer[] mag1Stats, Integer[] mag2Stats, Integer[] mag3Stats,
            Integer[] mag4Stats, Integer[] mag5Stats) {
        this.mag1Stats = mag1Stats;
        this.mag2Stats = mag2Stats;
        this.mag3Stats = mag3Stats;
        this.mag4Stats = mag4Stats;
        this.mag5Stats = mag5Stats;
    }

    public String getmag1Stats() {
        return mag1Stats;
    }

    public String getmag2Stats() {
        return mag2Stats;
    }

    public String getmag3Stats() {
        return mag3Stats;
    }

    public String getmag4Stats() {
        return mag4Stats;
    }

    public String getmag5Stats() {
        return mag5Stats;
    }


}