package weapon;




package weapon;

import java.util.Map;

public enum BarrelType {
    COMBATRIFLE(new Integer[] {-4, 20, 0, 0, 0, 4},
                new Integer[] {15, -28, 0, 0, -20, 4},
                new Integer[] {10, 50, 0, 1, 0, 4},
                new Integer[] {30, 30, 0 , 0, -35, 4},
                new Integer[] {15, 130, 0, 0, 50, 4}),

    PISTOL(new Integer[] {-4, 0, 0, 0, 0, 4},
            new Integer[] {15, -28, 0, 0, -20, 4},
            new Integer[] {10, 50, 0, 2, 0, 4},
            new Integer[] {30, 30, 0 , 0, -35, 4},
            new Integer[] {15, 130, 0, 0, 50, 4}),

    REVOLVER(new Integer[] {-4, 0, 0, 0, 0, 4},
            new Integer[] {15, -28, 0, 0, -20, 4},
            new Integer[] {10, 50, 0, 2, 0, 4},
            new Integer[] {30, 30, 0 , 0, -35, 4},
            new Integer[] {15, 130, 0, 0, 50, 4}),

    ROCKETLAUNCHER1(new Integer[] {-20, 0, 0, 0, 0, 4},
                    new Integer[] {-20, 0, 0, 0, 0, 4},
                    new Integer[] {-20, 0, 600, 0, 0, 4},
                    new Integer[] {-20, -200, 300, 0, 0, 4},
                    new Integer[] {-20, 0, 0, 2, 0, 4}),
    ROCKETLAUNCHER2(new Integer[] {0, 0, 0, 0, 0, 4},
                        new Integer[] {100, 0, 0, 5, 0, 4},
                        new Integer[] {0, 0, 0, 4, 0, 4},
                        new Integer[] {120, 0, 0, 5, 0, 4},
                        new Integer[] {130, 0, 0, 6, 0, 4}),
    ROCKETLAUNCHER3(new Integer[] {-29, 0, 34, 0, 0, 4},
                        new Integer[] {-17, 0, 78, 0, 0, 4},
                        new Integer[] {-30, 0, 40, 0, 0, 4},
                        new Integer[] {-30, 0, 40, 0, 0, 4},
                        new Integer[] {-30, 0, 40, 0, 0, 4}),
    ROCKETLAUNCHER4(new Integer[] {25, 0, 0, 0, 0, 4},
                        new Integer[] {120, 0, 0, 2, 0, 4},
                        new Integer[] {200, 0, 0, 0, 0, 4},
                        new Integer[] {100, 0, 0, 0, 0, 4},
                        new Integer[] {150, 0, 0, 0, 0, 4}),
    ROCKETLAUNCHER5(new Integer[] {0, 0, 0, 0, 0, 4},
                        new Integer[] {0, 0, 0, 2, 0, 4},
                        new Integer[] {0, 0, 0, 0, 0, 4},
                        new Integer[] {0, 0, 0, 0, 0, 4},
                        new Integer[] {0, 0, 0, 0, 0, 4}),
    SHOTGUN(new Integer[] {-4, 0, 0, 0, 0, 4},
                new Integer[] {15, -28, 0, 0, -20, 4},
                new Integer[] {10, 50, 0, 2, 0, 4},
                new Integer[] {30, 30, 0 , 0, -35, 4},
                new Integer[] {15, 130, 0, 0, 50, 4})),
    SNIPERRIFLE(new Integer[] {-4, 0, 0, 0, 0, 4},
                new Integer[] {15, -28, 0, 0, -20, 4},
                new Integer[] {10, 50, 0, 2, 0, 4},
                new Integer[] {30, 30, 0 , 0, -35, 4},
                new Integer[] {15, 130, 0, 0, 50, 4}),
    SUBMACHINEGUN(new Integer[] {-4, 0, 0, 0, 0, 4},
                new Integer[] {15, -28, 0, 0, -20, 4},
                new Integer[] {10, 50, 0, 2, 0, 4},
                new Integer[] {30, 30, 0 , 0, -35, 4},
                new Integer[] {15, 130, 0, 0, 50, 4});

    private final Integer[] barrel1Stats;
    private final Integer[] barrel2Stats;
    private final Integer[] barrel3Stats;
    private final Integer[] barrel4Stats;
    private final Integer[] barrel5Stats;

    
    BodyType(Integer[] barrel1Stats, Integer[] barrel2Stats, Integer[] barrel3Stats,
            Integer[] barrel4Stats, Integer[] barrel5Stats) {
        this.barrel1Stats = barrel1Stats;
        this.barrel2Stats = barrel2Stats;
        this.barrel3Stats = barrel3Stats;
        this.barrel4Stats = barrel4Stats;
        this.barrel5Stats = barrel5Stats;
    }

    public String getbarrel1Stats() {
        return barrel1Stats;
    }

    public String getbarrel2Stats() {
        return barrel2Stats;
    }

    public String getbarrel3Stats() {
        return barrel3Stats;
    }

    public String getbarrel4Stats() {
        return barrel4Stats;
    }

    public String getbarrel5Stats() {
        return barrel5Stats;
    }


}