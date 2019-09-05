package weapon;

import java.util.ArrayList;



public enum AccesoryType {
    COMBATRIFLE(new ArrayList<Integer[]>(null, ),
                new Integer[] {0, 15, 0, 2, 0, 50},
                new Integer[] {-40, 0, 0, 6, 0, 0},
                new Integer[] {-40, 0, 0 , 6, 0, 0},
                new Integer[] {20, 0, 0, 0, 25, 0},
                new Integer[] {-40, 0, 0 , 6, 0, 0},
                new Integer[] {-40, 0, 0, 6, 0, 0}),

    PISTOL(new Integer[] {-0, 0, 0, 0, 0, 0},
            new Integer[] {15, -28, 0, 0, -20, 0},
            new Integer[] {10, 50, 0, 2, 0, 0},
            new Integer[] {30, 30, 0 , 0, -35, 0},
            new Integer[] {15, 130, 0, 0, 50, 0}),

    REVOLVER(new Integer[] {-0, 0, 0, 0, 0, 0},
            new Integer[] {15, -28, 0, 0, -20, 0},
            new Integer[] {10, 50, 0, 2, 0, 0},
            new Integer[] {30, 30, 0 , 0, -35, 0},
            new Integer[] {15, 130, 0, 0, 50, 0}),

    ROCKETLAUNCHER1(new Integer[] {-20, 0, 0, 0, 0, 0},
                    new Integer[] {-20, 0, 0, 0, 0, 0},
                    new Integer[] {-20, 0, 600, 0, 0, 0},
                    new Integer[] {-20, -200, 300, 0, 0, 0},
                    new Integer[] {-20, 0, 0, 2, 0, 0}),
    ROCKETLAUNCHER2(new Integer[] {0, 0, 0, 0, 0, 0},
                        new Integer[] {100, 0, 0, 5, 0, 0},
                        new Integer[] {0, 0, 0, 0, 0, 0},
                        new Integer[] {120, 0, 0, 5, 0, 0},
                        new Integer[] {130, 0, 0, 6, 0, 0}),
    ROCKETLAUNCHER3(new Integer[] {-29, 0, 30, 0, 0, 0},
                        new Integer[] {-17, 0, 78, 0, 0, 0},
                        new Integer[] {-30, 0, 00, 0, 0, 0},
                        new Integer[] {-30, 0, 00, 0, 0, 0},
                        new Integer[] {-30, 0, 00, 0, 0, 0}),
    ROCKETLAUNCHER0(new Integer[] {25, 0, 0, 0, 0, 0},
                        new Integer[] {120, 0, 0, 2, 0, 0},
                        new Integer[] {200, 0, 0, 0, 0, 0},
                        new Integer[] {100, 0, 0, 0, 0, 0},
                        new Integer[] {150, 0, 0, 0, 0, 0}),
    ROCKETLAUNCHER5(new Integer[] {0, 0, 0, 0, 0, 0},
                        new Integer[] {0, 0, 0, 2, 0, 0},
                        new Integer[] {0, 0, 0, 0, 0, 0},
                        new Integer[] {0, 0, 0, 0, 0, 0},
                        new Integer[] {0, 0, 0, 0, 0, 0}),
    SHOTGUN(new Integer[] {-0, 0, 0, 0, 0, 0},
                new Integer[] {15, -28, 0, 0, -20, 0},
                new Integer[] {10, 50, 0, 2, 0, 0},
                new Integer[] {30, 30, 0 , 0, -35, 0},
                new Integer[] {15, 130, 0, 0, 50, 0})),
    SNIPERRIFLE(new Integer[] {-0, 0, 0, 0, 0, 0},
                new Integer[] {15, -28, 0, 0, -20, 0},
                new Integer[] {10, 50, 0, 2, 0, 0},
                new Integer[] {30, 30, 0 , 0, -35, 0},
                new Integer[] {15, 130, 0, 0, 50, 0}),
    SUBMACHINEGUN(new Integer[] {-0, 0, 0, 0, 0, 0},
                new Integer[] {15, -28, 0, 0, -20, 0},
                new Integer[] {10, 50, 0, 2, 0, 0},
                new Integer[] {30, 30, 0 , 0, -35, 0},
                new Integer[] {15, 130, 0, 0, 50, 0});

    private final Integer[] Accesory1Stats;
    private final Integer[] Accesory2Stats;
    private final Integer[] Accesory3Stats;
    private final Integer[] Accesory4Stats;
    private final Integer[] Accesory5Stats;


    //general Statistical adds
    private static Integer[] intenseAdds;
    private static Integer[] corrosiveAdds;
    private static Integer[] shockAdds;
    private static Integer[] deathlyAdds;
    private static Integer[] explosiveAdds;
    private static Integer[] incendiaryAdds;
    private final List<Integer[]> generalAdds;

    //machineGun
    private static Integer[] franticAdds;
    private static Integer[] shatteringAdds;
    private final List<Integer[]> machinegunAdds;


    //repeaters
    private static Integer[] fangedAdds;
    private static Integer[] laceratorAdds;
    private static Integer[] stabilizerAdds;
    private static Integer[] laserSightAdds;
    private static Integer[] doubleShotAdds;
    private final List<Integer[]> machinegunAdds;


    //machine Pistol
    private static Integer[] coldAdds;
    private static Integer[] rageAdds;

    //revolvers
    private static Integer[] bladedAdds;
    private static Integer[] RazorAdds;
    private static Integer[] masherAdds;

    //smg
    private static Integer[] relentlessAdds;
    private static Integer[] vectorAdds;
    private static Integer[] ruthlessAdds;

    //assaultshotgun
    private static Integer[] spikedsAdds;
    private static Integer[] ragingsAdds;
    private static Integer[] painfulAdds;

    //combatshotgun
    private static Integer[] jaggedsAdds;
    private static Integer[] frenziedAdds;
    private static Integer[] terribledAdds;

    //bolt-action rifles
    private static Integer[] rollingAdds;
    private static Integer[] heavyAdds;
    private static Integer[] longAdds;

    //semi auto sniper
    private static Integer[] briskAdds;
    private static Integer[] deepAdds;
    private static Integer[] soberAdds;


    //rocket launcher
    private static Integer[] recoilessAdds;
    private static Integer[] evilAdds;
    private static Integer[] devestatingAdds;


    //to know , static block gets executed exactly once , when the class is first loaded
    static {
        intenseAdds = new Integer[] {0, 15, 0, 2, 0, 0};
        corrosiveAdds = new Integer[] {-40, 0, 0, 6, 0, 0};
        incendiaryAdds = new Integer[] {-40, 0, 0, 6, 0, 0};
        shockAdds = new Integer[] {-40, 0, 0, 6, 0, 0};
        deathlyAdds = new Integer[] {20, 0, 0, 0, 25, 0};
        explosiveAdds = new Integer[] {-40, 0, 0, 6, 0, 0};
        //...
    }

    AccesoryType(Integer[] Accesory1Stats, Integer[] Accesory2Stats, Integer[] Accesory3Stats,
            Integer[] Accesory4Stats, Integer[] Accesory5Stats) {
        this.Accesory1Stats = Accesory1Stats;
        this.Accesory2Stats = Accesory2Stats;
        this.Accesory3Stats = Accesory3Stats;
        this.Accesory4Stats = Accesory4Stats;
        this.Accesory5Stats = Accesory5Stats;
    }

    public String getAccesory1Stats() {
        return Accesory1Stats;
    }

    public String getAccesory2Stats() {
        return Accesory2Stats;
    }

    public String getAccesory3Stats() {
        return Accesory3Stats;
    }

    public String getAccesory4Stats() {
        return Accesory4Stats;
    }

    public String getAccesory5Stats() {
        return Accesory5Stats;
    }


    public List<Integer[]> getSpecificAdds() {
        
    }

}