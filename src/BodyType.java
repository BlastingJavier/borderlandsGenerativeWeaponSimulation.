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

    private final String[] types;
    private final String[] type2;
    private final String type3;
    private final String type4;
    private final String type5;
    private final String tedioreSpecialType;

    
    BodyType(String type1, String type2, String type3, String type4,
            String type5, String tediore) {
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.type4 = type4;
        this.type5 = type5;
        this.tedioreSpecialType = tediore;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public String getType3() {
        return type3;
    }

    public String getType4() {
        return type4;
    }

    public String getType5() {
        return type5;
    }

    public String getTypeTediore() {
        return tedioreSpecialType;
    }

}