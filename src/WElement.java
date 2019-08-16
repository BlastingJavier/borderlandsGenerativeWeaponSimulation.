package weapon;


public enum WElement {
    
    INCENDIARY(1.2, 0.5, 0.8, 60, ["Combustion", "Burning", "Incendiary", "Flaming"]),
    SHOCK(0.9, 1.5, 0.9, 100, ["Fulgurating", "Lightning", "Static", "Shock"]),
    EXPLOSIVE(1.0, 1.0, 1.0, 150, ["Pestilent", "Vitriolic", "Caustic", "Corrosive"]),
    CORROSIVE(0.8, 0.8, 2.0, 40, ["Erupting", "Detonating", "Blast", "Exploding"]);

    private final double cFlesh;
    private final double cShield;
    private final double cArmor;
    private final int dMultiplier;
    private final String[] ePrefixes;

    WElement(double cFlesh, double cShield, double cArmor, int dMultiplier,
            String[] ePrefixes) {

        this.cFlesh = cFlesh;
        this.cShield = cShield;
        this.cArmor = cArmor;
        this.dMultiplier = dMultiplier;
        this.ePrefixes = ePrefixes;
    }



}