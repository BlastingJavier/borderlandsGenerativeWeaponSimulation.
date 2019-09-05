package weapon;




public enum Sight {
    COMBATRIFLE(new Integer[] {0, 0, 0, 0, 0, 0},
                new Integer[] {0, 15, 0, 2, 0, 50},
                new Integer[] {-40, 0, 0, 6, 0, 0},
                new Integer[] {-40, 0, 0 , 6, 0, 0},
                new Integer[] {20, 0, 0, 0, 25, 0}),

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

    private final Integer[] Sight1Stats;
    private final Integer[] Sight2Stats;
    private final Integer[] Sight3Stats;
    private final Integer[] Sight4Stats;
    private final Integer[] Sight5Stats;

    
    Sigth(Integer[] Sight1Stats, Integer[] Sight2Stats, Integer[] Sight3Stats,
            Integer[] Sight4Stats, Integer[] Sight5Stats) {
        this.Sight1Stats = Sight1Stats;
        this.Sight2Stats = Sight2Stats;
        this.Sight3Stats = Sight3Stats;
        this.Sight4Stats = Sight4Stats;
        this.Sight5Stats = Sight5Stats;
    }

    public String getSight1Stats() {
        return Sight1Stats;
    }

    public String getSight2Stats() {
        return Sight2Stats;
    }

    public String getSight3Stats() {
        return Sight3Stats;
    }

    public String getSight4Stats() {
        return Sight4Stats;
    }

    public String getSight5Stats() {
        return Sight5Stats;
    }


    
}