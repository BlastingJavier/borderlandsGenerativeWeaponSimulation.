package weapon;


public enum MaterialGrade {
    DAHL("-", "U", ".D", new Integer[] {10, 0, 0, 1, -11, 15},
                        new Integer[] {15, 0, 0, 1, -11, 15},
                        new Integer[] {20, 0, 0, 1, -11, 15}),
    GEARBOX( "-",  "-",  "-", new Integer[] {0, -20, 0, 0, 30, 0},
                            new Integer[] {5, -15, 0, 0, 40, 24},
                            new Integer[] {10, -15, 0, 0, 80, 0}),
    ERIDIAN("Er1d1aN",  "Er1d1aN",  "Er1d1aN", new Integer[] {0, 0, 0, 0, 0, 0}),
    HYPERION("-", ".W", ".G", new Integer[] {0, 75, 0, 1, 70, 0},
                            new Integer[] {5, 85, 30, 1, 70, 0},
                            new Integer[] {10, 100, 0, 1, 80, 30}),
    JACKOBS("-", "ZZ",  "XX", new Integer[] {35, 0, -50, 0, -30, 0},
                            new Integer[] {25,  50, -50, 0, -28, 0},
                            new Integer[] {50, -60, -50, 0, -45, 600}),
    MALIWAN("-", "B", "C", new Integer[] {0, 0, 0, 4, 0, 0},
                            new Integer[] {5,  11, 0, 4, 0, 11},
                            new Integer[] {10, 25, 0, 5, 0, 25}),
    SANDS("-", ".2",  ".3", new Integer[] {0, 0, 0, 1, 0, 40},
                            new Integer[] {5,  0, 0, 1, 0, 42},
                            new Integer[] {10, 0, 0, 2, 0, 50}),
    TEDIORE("-", "-A",  "-B", new Integer[] {-20, -35, 0, 0, 0, 70},
                            new Integer[] {-10, -25, 0, 0, 0, 85},
                            new Integer[] {-5, -15, 0, 0, 0, 100}),
    TORGUE("-",  "-",  "-", new Integer[] {20, -35, 16, 0, -54, 0},
                            new Integer[] {25, -35, 16, 0, -54, 0},
                            new Integer[] {30, -35, 16, 0, -54, 0}),
    VLADOF("-", "/V2",  "/V3", new Integer[] {0, -32, 44, 0, 0, 0},
                                new Integer[] {5, -32, 50, 0, 20, 0},
                                new Integer[] {10, -32, 56, 0, 40, 0});

    private final String mat1;
    private final String mat2;
    private final String mat3;
    private final Integer[] statsmod;
    

    MaterialGrade(String mat1, String mat2, String mat3, Integer[] statsmod) {
        this.mat1 = mat1;
        this.mat2 = mat2;
        this.mat3 = mat3;
        this.statsmod = statsmod;
    }

    public String getMat1() {
        return this.mat1;
    }

    public String getMat2() {
        return this.mat2;
    }

    public String getMat3() {
        return this.mat3;
    }
    
    public Integer[] getMods() {
        return this.statsmod;
    }

}