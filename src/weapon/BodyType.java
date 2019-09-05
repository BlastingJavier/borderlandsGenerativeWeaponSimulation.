package weapon;

import java.util.Map;

public enum BodyType {
    COMBATRIFLE(new String [] {"CR", "HVY", "TCH", "HLK", "AR", "GRD"}, new Integer[] {-8, 0, 0, 0, 0, 4},
                                                                        new Integer[] {-10, 0, 0, 0, 0, 4},
                                                                        new Integer[] {-15, 0, 30, 2, 30, 4},
                                                                        new Integer[] {20, 0, -30, 0, -50, 4},
                                                                        new Integer[] {20, 0, 50, 1, 20, 4}),

    PISTOL(new String [] {"BLR", "RF", "TK", "HRD", "TMP", "PRO"}, new Integer[] {-8, 0, 0, 0, 0, 4},
                                                                    new Integer[] {10, 0, -20, 0, -30, 4},
                                                                    new Integer[] {-15, 0, 30, 2, 30, 4},
                                                                    new Integer[] {20, 0, -30, 0, -50, 4},
                                                                    new Integer[] {20, 0, -30, 0, -50, 8}),

    REVOLVER(new String [] {"RV", "DL", "MAL", "KLR", "AX", "EQ"}, new Integer[] {-8, 0, 0, 0, 0, 4},
                                                                    new Integer[] {10, 0, 20, 0, 30, 4},
                                                                    new Integer[] {-15, 0, 30, 3, 30, 4},
                                                                    new Integer[] {20, 0, 30, 1, 50, 4},
                                                                    new Integer[] {20, 0, 50, 1, 20, 4},
                                                                    new Integer[] {25, 0, 30, 4, 30, 4}),

    ROCKETLAUNCHER(new String [] {"RPG", "NOTUSED", "SPC", "NOTUSED", "RWL", "NOTUSED"}, new Integer[] {-8, 0, 0, 0, 0, 4},
                                                                                        new Integer[] {10, 0, -20, 0, 0, 4},
                                                                                        new Integer[] {-15, 0, 30, 3, 30, 4},
                                                                                        new Integer[] {20, 0, -30, 0, 0, 4},
                                                                                        new Integer[] {20, 0, 50, 1, 20, 4}),
    SHOTGUN(new String [] {"SG", "SPR", "ZX", "BA", "ZPR", "DEF"}, new Integer[] {-8, 0, 0, 0, 0, 4},
                                                                    new Integer[] {10, 0, -20, 0, -30, 4},
                                                                    new Integer[] {-15, 0, 30, 3, 30, 4},
                                                                    new Integer[] {20, 0, -30, 0, -50, 4},
                                                                    new Integer[] {20, 0, 50, 0, 20, 4},
                                                                    new Integer[] {25, 0, 30, 3, 30, 4}),
    SNIPERRIFLE(new String [] {"GGN", "LB", "VRR", "DVL", "PPZ", "NOTUSED"}, new Integer[] {-8, 0, 0, 0, 0, 4},
                                                                            new Integer[] {10, 0, -20, 1, -30, 4},
                                                                            new Integer[] {-15, 0, 30, 3, 30, 4},
                                                                            new Integer[] {20, 0, -30, 1, -50, 4},
                                                                            new Integer[] {20, 0, 50, 1, 20, 4}),
    SUBMACHINEGUN(new String [] {"TD", "KKA", "TEK", "RF", "HX", "SV"}, new Integer[] {-8, 0, 0, 0, 0, 4},
                                                                        new Integer[] {10, 0, -20, 0, -30, 4},
                                                                        new Integer[] {-15, 0, 30, 3, 30, 4},
                                                                        new Integer[] {20, 0, -30, 1, -50, 4},
                                                                        new Integer[] {20, 0, 50, 1, 20, 4},
                                                                        new Integer[] {25, 0, 30, 4, 30, 4});

    private final String[] bodyNames;
    private final Integer[] body1Stats;
    private final Integer[] body2Stats;
    private final Integer[] body3Stats;
    private final Integer[] body4Stats;
    private final Integer[] body5Stats;
    private final Integer[] tedioreBodyStats;

    
    BodyType(String[] bodyNames, Integer[] body1Stats, Integer[] body2Stats, Integer[] body3Stats,
            Integer[] body4Stats, Integer[] body5Stats, Integer[] tedioreBodyStats) {
        this.bodyNames = bodyNames;
        this.body1Stats = body1Stats;
        this.body2Stats = body2Stats;
        this.body3Stats = body3Stats;
        this.body4Stats = body4Stats;
        this.body5Stats = body5Stats;
        this.tedioreBodyStats = tedioreBodyStats;
    }

    public String getbodyNames() {
        return bodyNames;
    }

    public String getbody1Stats() {
        return body1Stats;
    }

    public String getbody2Stats() {
        return body2Stats;
    }

    public String getbody3Stats() {
        return body3Stats;
    }

    public String getbody4Stats() {
        return body4Stats;
    }

    public String getbody5Stats() {
        return body5Stats;
    }


    public String getTedioreBodyStats() {
        return tedioreBodyStats;
    }

}