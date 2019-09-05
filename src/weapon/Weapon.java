package Weapon;

import java.util.*;
import java.io.*;

import weapon.Rarity;
import weapon.WElement;
import Tuple.Tuple;
import builder.WeaponBuilder;
import manufactuer.Manufactuer;


public abstract class WeaponType implements IWeapon{

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



    public Weapon (Manufactuer manu, Rarity rar, WElement wele, double mult, double tunlodad,
                    double treload, double rsustained, double dpssustained, double accuracy
                    BodyType bodyType) {
        this.manufactuer = manu;
        this.rarity = rar;
        this.wElement = wele;
        this.multiplier = mult;
        this.baseTUnload = tunlodad;
        this.baseTReload = treload;
        this.baseRSustained = rsustained;
        this.baseDPSSustained = dpssustained;
        this.accuracy = accuracy;
        
    }


    public String name() {
        return name;
    }


    public Manufactuer getManufactuer(){
        return manufactuer;
    }
    public Rarity getRarity(){
        return rarity;
    }
    public WElement getWElement(){
        return wElement;
    }
    public Tuple<String, String> getMaterialGrade(int index){
        return materialGrade.get(index);
    }
    public double getbagetUnload(){
        return baseTUnload;
    }
    public double getbagetReload(){
        return baseTReload;
    }
    public double getbaseRSustained(){
        return baseRSustained;
    }
    public double getbaseDPSSustained(){
        return baseDPSSustained;
    }

    public abstract double getDamage();
    public abstract double getReloadSpeed();
    public abstract double getAccuracy();
    public abstract double getCoolDownRate();
    public abstract double getRateofFire();


    public double getSpread(){
        return (100-accuracy)/12;
    }

    public double getWeaponCardAccuracy(){
        return 100 - (12 * spread);
    }

    public String toString(){
        return "Weapon: ";
    }
    @Override
    public String toString() {
        return "" + manufactuer.toString() + bodyTypes.getModelBybodyType(this.model) +
                    this.modelNumber + this.manufactuer.ge
    }

}

public class WeaponTypeRevolver extends WeaponType {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class WeaponTypeRepeaterPistol extends WeaponType {

    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class WeaponTypeSMGWeapon extends WeaponType {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class WeaponTypeCombatRifle extends WeaponType {

    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }

    public class WeaponTypeMachineGun extends WeaponTypeCombatRifle {

    }

    public class WeaponTypeCombatRifle extends WeaponTypeCombatRifle {

    }

}

public class WeaponTypeShotgun extends WeaponType {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }

    public class WeaponTypeAssaultShotgun extends WeaponTypeShotgun {

    }

    public class WeaponTypeCombatShotgun extends WeaponTypeShotgun {

    }
}

public class WeaponTypeSniperRifle extends WeaponType {
    private double stability;
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }

    public class WeaponTypeSemiAutoSniperRifle extends WeaponTypeSniperRifle {

    }

    public class WeaponTypePumpActionSniperRifle extends WeaponTypeSniperRifle {

    }

}

public class WeaponTypeRocketLauncher extends WeaponType {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class WeaponTypeEridian extends WeaponType {
    private double coolDownRate;
    @Override
    public String toString(){
        return "Weapon type:" + this.;
    }
}