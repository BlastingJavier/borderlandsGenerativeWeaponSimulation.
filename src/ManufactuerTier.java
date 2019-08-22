package manufactuer;



public enum ManufactuerTier {
    
    ATLAS("Champion", "Heroic", "Herculean", "Legendary", "Tital"),
    DAHL("Mercenary", "Soldier", "Freelancer", "Veteran", "Elite"),
    ERIDIAN("0001", "0010", "0100", "0101", "0111"),
    HYPERION("Valde", "Melior", "Ultra", "Magnus", "Optimus"),
    GEARBOX("Gearbox","Gearbox", "Gearbox", "Gearbox", "Gearbox"),
    JACKOBS("Classic", "Vintage", "Choice", "Antique", "Original"),
    MALIWAN("Standard", "Sterling", "Prototype", "Paradigm", "Pure"),
    SANDS("Revised", "Upgraded", "Enhanced", "Faultless", "Perfect"),
    TEDIORE("Value", "Special", "Super", "Limited", "Supreme"),
    TORGUE("Power", "Force", "Excellent", "Awesome", "Ultimate"),
    VLADOF("Peasants", "Peoples", "Workers", "Soldiers", "Patriots");

    private final String firstLevels;
    private final String secondLevels;
    private final String thirdLevels;
    private final String fourthLevels;
    private final String fifthLevels;

    ManufactuerTier(String first, String second, String third,
                    String fourth, String fifth) {
        this.firstLevels = first;
        this.secondLevels = second;
        this.thirdLevels = third;
        this.fourthLevels = fourth;
        this.fifthLevels = fifthLevels;
    }

    public String getFirstLevels() {
        return firstLevels;
    }

    public String getSecondLevels() {
        return secondLevels;
    }

    public String getThirdLevels() {
        return thirdLevels;
    }

    public String getFourthLevels() {
        return fourthLevels;
    }

    public String getFifthLevels() {
        return fifthLevels;
    }

    public String getByIndex(int levelActual) {
        if (levelActual >= 13 && levelActual <= 21) {
            return this.getFirstLevels();
        }
        else if(levelActual >= 22 && levelActual <= 30) {
            return this.getSecondLevels();
        }
        else if(levelActual >= 31 && levelActual <= 39) {
            return this.getThirdLevels();
        }
        else if(levelActual >= 40 && levelActual <= 47) {
            return this.getFourthLevels();
        }
        else {
            return this.getFifthLevels();
        }
    }
}