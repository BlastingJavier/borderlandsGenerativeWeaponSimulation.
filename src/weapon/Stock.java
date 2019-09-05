package weapon;




package weapon;

import java.util.Map;

public enum Stock {
    //las one stat is reload speed
    COMBATRIFLE(new Integer[] {0, 0, 0, 0, -40, 30},
                new Integer[] {0, 0, 0, 0, 0, 0},
                new Integer[] {0, 0, 0, 0, 30, 4},
                new Integer[] {0, 0, 0 , 0, 80, -20},
                new Integer[] {0, 0, 0, 0, 100, 0}),

    PISTOL(new Integer[] {0, 0, 0, 0, 0, 0},
            new Integer[] {0, 0, 0, 0, 0, 0},
            new Integer[] {0, 0, 0, 0, 0, 4},
            new Integer[] {0, 0, 0 , 0, 0, 0},
            new Integer[] {0, 0, 0, 0, 0, 0}),

    REVOLVER(new Integer[] {0, 0, 0, 0, -40, 30},
            new Integer[] {0, 0, 0, 0, 0, 0},
            new Integer[] {0, 0, 0, 0, 40, -30},
            new Integer[] {0, 0, 0 , 0, 30, -20},
            new Integer[] {0, 0, 0, 0, 35, -30}),

    SMG(new Integer[] {0, 0, 0, 0, -40, 30},
                    new Integer[] {0, 0, 0, 0, 40, -30},
                    new Integer[] {0, 0, 0 , 1, 30, -20},
                    new Integer[] {0, 0, 0, 0, 80, -20},
                    new Integer[] {0, 0, 0, 1, 100, -20}),
    SHOTGUN(new Integer[] {0, 0, 0, 0, -40, 30},
            new Integer[] {0, 0, 0, 0, 0, 0},
            new Integer[] {0, 0, 0, 0, 40, -30},
            new Integer[] {0, 0, 0 , 0, 30, -20},
            new Integer[] {0, 0, 0, 0, 35, -30}),
    SNIPER(new Integer[] {0, 0, 0, 0, -40, 30},
            new Integer[] {0, 0, 0, 0, 40, -30},
            new Integer[] {0, 0, 0 , 1, 30, -20},
            new Integer[] {0, 0, 0, 0, 80, -20},
            new Integer[] {0, 0, 0, 1, 100, -20}),
    ROCKETLAUNCHER(new Integer[] {0, 0, 0, 0, -40, 30},
                new Integer[] {0, 0, 0, 0, 40, -30},
                new Integer[] {0, 0, 0 , 1, 30, -20},
                new Integer[] {0, 0, 0, 0, 80, -20},
                new Integer[] {0, 0, 0, 1, 100, -20});


    private final Integer[] stock1Stats;
    private final Integer[] stock2Stats;
    private final Integer[] stock3Stats;
    private final Integer[] stock4Stats;
    private final Integer[] stock5Stats;

    
    Stock(Integer[] stock1Stats, Integer[] stock2Stats, Integer[] stock3Stats,
            Integer[] stock4Stats, Integer[] stock5Stats) {
        this.stock1Stats = stock1Stats;
        this.stock2Stats = stock2Stats;
        this.stock3Stats = stock3Stats;
        this.stock4Stats = stock4Stats;
        this.stock5Stats = stock5Stats;
    }

    public Integer[] getstock1Stats() {
        return stock1Stats;
    }

    public Integer[] getstock2Stats() {
        return stock2Stats;
    }

    public Integer[] getstock3Stats() {
        return stock3Stats;
    }

    public Integer[] getstock4Stats() {
        return stock4Stats;
    }

    public Integer[] getstock5Stats() {
        return stock5Stats;
    }


    private Integer[] getStatsbyIndex(int index) {
        switch(index) {
            case 0: return getstock1Stats();
            case 1: return getstock2Stats();
            case 2: return getstock3Stats();
            case 3: return getstock4Stats();
            default: return getstock5Stats();
        }
    }


}