 package weapon;


 public enum Rarity {
    WHITE(0, 4),
    GREEN(5, 10),
    BLUE(11, 15),
    PURPLE(16, 49),
    YELLOW(50, 60),
    ORANGE(61, 65),
    DARKORANGE(66, 100),
    PEARLESCENT(101, 115);

    private final int fProbability;
    private final int finalProbability;

    Rarity(int fProbability, int finalProbability) {
        this.fProbability = fProbability;
        this.finalProbability = finalProbability;
    }

    private int gfProbability() {
        return this.fProbability;
    }

    private int finalProbability() {
        return this.finalProbability;
    }


 }