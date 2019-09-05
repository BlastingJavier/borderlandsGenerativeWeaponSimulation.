package manufactuer;

import Tuple.Tuple;
import Weapon.RocketLauncherWeapon;
import weapon.IWeapon;
import weapon.MaterialGrade;

public abstract class Manufactuer {
    private String typeWeapon;
    private final ManufactuerTier manuTier;
    private final MaterialGrade matGrade;
    private String realManuTier;
    private String realMatGrade;


    public Manufactuer(String typeWeapon, ManufactuerTier manuTier,
                        MaterialGrade matGrade, String realManuTier,
                        String realMatGrade) {
        this.typeWeapon = typeWeapon;
        this.manuTier = manuTier;
        this.matGrade = matGrade;
        this.realManuTier = realManuTier;
        this.realMatGrade = realMatGrade;
    }

    public ManufactuerTier getManuTier() {
        return manuTier;
    }

    public MaterialGrade getMaterialGrade() {
        return matGrade;
    }

    public String getRealManuTier() {
        return realManuTier;
    }
    public String getRealMatGrade() {
        return realMatGrade;
    }

    public abstract String toString();
}


public class AtlasManufactuer extends Manufactuer {
    private double normalization;
    
    public AtlasManufactuer(String typeWeapon, double normalization, 
                            String realManuTier, String realMatGrade){
        super(typeWeapon, ATLAS, ATLAS, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.normalization = normalization;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }

    public double getNormalization() {
        return this.normalization;
    }
    @Override
    public String toString(){
        return "Atlas Manufactuer";
    }
}

public class BanditManufactuer extends Manufactuer {
    private List<String> typeWeapon = new ArrayList<String>()

    @Override
    public String toString(){
        return "Bandit";
    }
}
public class DahlManufactuer extends Manufactuer {
    private int plusAccuracy;
    private double recoilReduction;
    
    public DahlManufactuer(String typeWeapon, int pAccu, double recoRedu,
                            String realManuTier, String realMatGrade) {
        super(typeWeapon, DAHL, DAHL, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.plusAccuracy = pAccu;
            this.recoilReduction = recoRedu;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }
    /**
     * @return the plusAccuracy
     */
    public int getPlusAccuracy() {
        return plusAccuracy;
    }

    /**
     * @return the recoilReduction
     */
    public double getRecoilReduction() {
        return recoilReduction;
    }

    @Override
    public String toString(){
        return "Dahl";
    }
}


public class EridianManufactuer extends Manufactuer {
    private boolean infiniteAmmo;
    private double rechargeTime;

    public EridianManufactuer(double rechargeTime,
                            String realManuTier, String realMatGrade) {
        super("Eridian", ERIDIAN, ERIDIAN, realManuTier, realMatGrade);
        this.infiniteAmmo = true;
        this.rechargeTime = rechargeTime;
    }

    public boolean getInfiniteAmmo() {
        return infiniteAmmo;
    }
    /**
     * @return the rechargeTime
     */
    public double getRechargeTime() {
        return rechargeTime;
    }

    @Override
    public String toString(){
        return "Eridian";
    }
}


public class GearboxManufactuer extends Manufactuer {
    private boolean balanced;

    public GearboxManufactuer(String typeWeapon, String realManuTier, String realMatGrade) {
        super(typeWeapon, GEARBOX, GEARBOX, realManuTier, realMatGrade);
        this.balanced = true;
    }

    public boolean getBalanced() {
        return balanced;
    }
    @Override
    public String toString(){
        return "Gearbox";
    }
}

public class HyperionManufactuer extends Manufactuer {
    private int plusAccuracy; //highest in weapons.
    private int plusDamage;
    private int recoilReduction;
    private int aboveAverage;
    
    

    public HyperionManufactuer(String typeWeapon, int plusAccuracy,
                                int recoilReduction, int aboveAverage,
                                String realManuTier, String realMatGrade) {
        super(typeWeapon, HYPERION, HYPERION, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.plusAccuracy = pAccu;
            this.recoilReduction = recoRedu;
            this.plusDamage = plusDamage;
            this.aboveAverage = aboveAverage;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }

     /**
     * @return the aboveAverage
     */
    public int getAboveAverage() {
        return aboveAverage;
    }
    
    /**
     * @return the plusAccuracy
     */
    public int getPlusAccuracy() {
        return plusAccuracy;
    }
    
    /**
     * @return the recoilReduction
     */
    public int getRecoilReduction() {
        return recoilReduction;
    }
    
    /**
     * @return the plusDamage
     */
    public int getPlusDamage() {
        return plusDamage;
    }

    @Override
    public String toString(){
        return "Hyperion";
    }
}
public class JackobsManufactuer extends Manufactuer {
    private int plusDamage;
    private int plusAccuracy;
    private int plusRecoil;
    private boolean noElement;

    
    public JackobsManufactuer(String typeWeapon, int pAccu, int plusDamage,
                                int plusRecoil, String realManuTier, String realMatGrade) {
        super(typeWeapon, JACKOBS, JACKOBS, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.plusAccuracy = pAccu;
            this.plusRecoil = plusRecoil;
            this.plusDamage = plusDamage;
            this.noElement = true;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }
    
    /**
     * @return the plusAccuracy
     */
    public int getPlusAccuracy() {
        return plusAccuracy;
    }
    
    /**
     * @return the plusRecoil
     */
    public int getPlusRecoil() {
        return plusRecoil;
    }
    
    /**
     * @return the plusDamage
     */
    public int getPlusDamage() {
        return plusDamage;
    }

    public boolean getNoElement() {
        return noElement;
    }

    @Override
    public String toString(){
        return "Jackobs";
    }
}
public class MaliwanManufactuer extends Manufactuer {
    private int pluselementChance;
    private boolean elementOnly;

    public MaliwanManufactuer(String typeWeapon, int pElementChance,
                                String realManuTier, String realMatGrade) {
        super(typeWeapon, MALIWAN, MALIWAN, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.pluselementChance = pElementChance;
            this.elementOnly = true;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }
    
    /**
     * @return the plusElementChance
     */
    public int getPlusElementChance() {
        return pluselementChance;
    }

    
    /**
     * @return the elementOnly
     */
    public boolean getElementOnly() {
        return elementOnly;
    }

    @Override
    public String toString(){
        return "Maliwan";
    }
}


public class SandSManufactuer extends Manufactuer {
    private int plusLoader;

    
    public SandSManufactuer(String typeWeapon, int plusLoader,
                            String realManuTier, String realMatGrade) {
        super(typeWeapon, SANDS, SANDS, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.plusLoader = plusLoader;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }
    
    /**
     * @return the plusLoader
     */
    public int getPlusLoader() {
        return plusLoader;
    }

    @Override
    public String toString(){
        return "S&S";
    }
}
public class TedioreManufactuer extends Manufactuer {
    private int plusReloadSpeed;

    
    public TedioreManufactuer(String typeWeapon, int plusReloadSpeed,
                            String realManuTier, String realMatGrade) {
        super(typeWeapon, TEDIORE, TEDIORE, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.plusReloadSpeed = plusReloadSpeed;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }

    /**
     * @return the plusReloadSpeed
     */
    public int getPlusReloadSpeed() {
        return plusReloadSpeed;
    }

    @Override
    public String toString(){
        return "Tediore";
    }
}
public class TorgueManufactuer extends Manufactuer {
    private int plusDamage;
    private int plusRecoil;
    private int accuracyReduction;
    private boolean explosiveAmmo;
    
    
    public TorgueManufactuer(String typeWeapon, int plusDamage, int plusRecoil,
                                int accuReduction, String realManuTier, String realMatGrade) {
        super(typeWeapon, TORGUE, TORGUE, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.plusDamage = plusDamage;
            this.plusRecoil = plusRecoil;
            this.accuracyReduction = accuReduction;
            this.explosiveAmmo = true;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }

    /**
     * @return the plusDamage
     */
    public int getPlusDamage() {
        return plusDamage;
    }

    /**
     * @return the plusRecoil
     */
    public int getPlusRecoil() {
        return plusRecoil;
    }

    /**
     * @return the accuracyReduction
     */
    public int getAccuracyReduction() {
        return accuracyReduction;
    }

    public boolean getExplosiveAmmo() {
        return explosiveAmmo;
    }

    @Override
    public String toString(){
        return "Torgue";
    }
}


public class VladofManufactuer extends Manufactuer {
    private int plusRateOfFire;
    private int recoilReduction;
    private boolean triggerReduction;

    
    public VladofManufactuer(String typeWeapon, int plusRateOfFire, int recoilReduction,
                            String realManuTier, String realMatGrade) {
        super(typeWeapon, VLADOF, VLADOF, realManuTier, realMatGrade);
        if (possibleWeapons.contains(typeWeapon)) {
            this.plusRateOfFire = plusRateOfFire;
            this.recoilReduction = recoilReduction;
            this.triggerReduction = true;
        }
        else {
            System.out.println("Problem: Wrong brand of Weapon");
        }
    }

    /**
     * @return the plusRateOfFire
     */
    public int getPlusRateOfFire() {
        return plusRateOfFire;
    }

    /**
     * @return the recoilReduction
     */
    public int getRecoilReduction() {
        return recoilReduction;
    }

    public boolean getTriggerReduction() {
        return triggerReduction;
    }
    @Override
    public String toString(){
        return "Vladof";
    }
}
