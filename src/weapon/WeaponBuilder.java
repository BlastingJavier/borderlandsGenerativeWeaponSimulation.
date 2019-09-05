package builder;

import org.apache.commons.math;
import builder.IWeaponBuilder;
import manufactuer.Manufactuer;
import weapon.Rarity;
import weapon.WElement;

public class WeaponBuilder implements IWeaponBuilder {

    //Name
    private final BodyType bodyTypes;
    private final int model; //Index of bodyTypes    
    private final int modelNumber;
    private final WeaponPrefix wPrefix;
    private final WeaponTitle wTitle;

    //Active Attributes
    private Manufactuer manufactuer;
    private Rarity rarity;
    private WElement wElement;
    private double multiplier;

    private double damage;       //visible



    private double fireRate;     //visible
    private double baseTUnload; //ocult
    private double baseTReload; //ocult
    private double baseRSustained;//ocult
    private double baseDPSSustained;//ocult


    private double accuracy;     //visible
    private double accuracyMin; //ocult
    private double accuracyMax;//ocult
    private double recoil;//visible
    private double accuracyIdleRegenDelay;//ocult
    private double accuracyRegenRate;//ocult



    public WeaponBuilder(Manufactuer man, Rarity rar, WElement wele, double multiplier,
                        double baseTUnload, double baseTReload, double baseRSustained,
                        double baseDPSSustained) {
        
        this.manufactuer = man;
        this.rarity = rar;
        this.wElement = wele;
        this.multiplier = multiplier;
        this.baseTUnload = baseTUnload;
        this.baseTReload = baseTReload;
        this.baseDPSSustained = baseDPSSustained;
        this.baseRSustained = baseRSustained;
    }


    public WeaponBuilder buildManufactuer(Manufactuer man){
        this.manufactuer = man;
        return this;
    }
    public WeaponBuilder buildRarity(Rarity rar){
        this.rarity = rar;
        return this;
    }
    public WeaponBuilder buildWElement(WElement wele){
        this.wElement = wele;
        return this;
    }
    public WeaponBuilder buildbaseTUnload(double baseTUnload) {
        this.baseTUnload = baseTUnload;
        return this;
    }
    public WeaponBuilder buildbaseTReload(double baseTReload){
        this.baseTReload = baseTReload;
        return this;
    }
    public WeaponBuilder buildbaseRSustained(double baseRSustained) {
        this.baseRSustained = baseRSustained;
        return this;
    }
    public WeaponBuilder buildbaseDPSSustained(double baseDPSSustained){
        this.baseDPSSustained = baseDPSSustained;
        return this;
    }

    public Weapon build() {
        return new Weapon(this);
    }
}