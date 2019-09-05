package weapon;




public enum Sight {
    COMBATRIFLE(new Float[] {15.0 ,1.4, 0.0},
                new Float[] {20.0, 2.0, 0},
                new Float[] {30.0 ,2.4, 1.0},
                new Float[] {50.0, 3.2, 0},
                new Float[] {70.0, 3.6, 0}),

    MACHINEGUN(new Float[] {20.0 ,2.1, 0.0},
            new Float[] {15.0, 1.4, 0},
            new Float[] {0, 0, 0},
            new Float[] {0, 0, 0},
            new Float[] {0, 0, 0}),

    REPEATERSMACHINEPISTOL(new Float[] {15.0 ,1.8, 0.0},
                        new Float[] {20.0, 2.6, 0},
                        new Float[] {30.0 ,3.1, 0},
                        new Float[] {50.0, 4.1, 0},
                        new Float[] {70.0, 4.6, 1.0}),

    REVOLVER(new Float[] {0 ,1.6, 0.0},
            new Float[] {0, 2.3, 0},
            new Float[] {0 ,2.8, 0},
            new Float[] {0, 3.7, 0},
            new Float[] {0, 4.2, 0}),

    SMG(new Float[] {15.0 ,1.7, 0.0},
        new Float[] {20.0, 2.4, 0},
        new Float[] {30.0 ,2.9, 0},
        new Float[] {50.0, 3.9, 0},
        new Float[] {70.0, 4.3, 1.0}),

    ASSAULTSHOTGUN(new Float[] {0,1.7, 0.0},
                    new Float[] {0, 2.5, 0},
                    new Float[] {0 ,3.0, 0},
                    new Float[] {0, 4.0, 0},
                    new Float[] {0, 4.5, 0}),

    COMBATSHOTGUN(new Float[] {15.0 ,1.5, 0.0},
                new Float[] {20.0, 2.2, 0},
                new Float[] {30.0 ,2.7, 0},
                new Float[] {50.0, 3.6, 0},
                new Float[] {70.0, 4.0, 0}),

    SNIPER(new Float[] {15.0 ,1.0, 0.0},
            new Float[] {20.0, 1.5, 0},
            new Float[] {30.0 ,1.8, 1.0},
            new Float[] {50.0, 2.4, 0},
            new Float[] {70.0, 2.7, 0}),
    ROCKETLAUNCHER(new Float[] {15.0 ,1.9, 0.0},
                    new Float[] {20.0, 2.7, 0},
                    new Float[] {30.0 ,3.2, 1.0},
                    new Float[] {50.0, 4.3, 0},
                    new Float[] {70.0, 4.9, 0});


    private final Float[] sight1Stats;
    private final Float[] sight2Stats;
    private final Float[] sight3Stats;
    private final Float[] sight4Stats;
    private final Float[] sight5Stats;

    
    Sight(Float[] sight1Stats, Float[] sight2Stats, Float[] sight3Stats,
            Float[] sight4Stats, Float[] sight5Stats) {
        this.sight1Stats = sight1Stats;
        this.sight2Stats = sight2Stats;
        this.sight3Stats = sight3Stats;
        this.sight4Stats = sight4Stats;
        this.sight5Stats = sight5Stats;
    }

    public Float[] getsight1Stats() {
        return sight1Stats;
    }

    public Float[] getsight2Stats() {
        return sight2Stats;
    }

    public Float[] getsight3Stats() {
        return sight3Stats;
    }

    public Float[] getsight4Stats() {
        return sight4Stats;
    }

    public Float[] getsight5Stats() {
        return sight5Stats;
    }


    public float getAccuracy(Float[] adds) {
        return adds[0];
    }

    
    public float getZoom(Float[] adds) {
        return adds[1];
    }

    public float getTech(Float[] adds) {
        return adds[2];
    }


    
}