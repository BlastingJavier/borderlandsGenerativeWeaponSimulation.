package Weapon;

import java.util.*;
import java.io.*;

import weapon.Rarity;
import Tuple.Tuple;
import manufactuer.Manufactuer;


public abstract class Weapon implements IWeapon{

    private Manufactuer manufactuer;
    private Rarity rarity;
    private WElement wElement;
    private List<Tuple<String, Tuple<String, String>>> materialGrade = 
            new ArrayList<Tuple<String, Tuple<String, String>>>();
    private double multiplier;
    private double baseTUnload;
    private double baseTReload;
    private double baseRSustained;
    private double baseDPSSustained;


    public IWeapon setManufactuer(Manufactuer manu){
        this.manufactuer = manu;
    }
    public IWeapon setRarity(Rarity rarity){
        this.rarity = rarity;
    }
    public IWeapon setWElement(WElement wele){
        this.wElement = wElement;
    }
    public IWeapon setMaterialGrade(List<Tuple<String, Tuple<String, String>>> mGrade){
        this.materialGrade = mGrade;
    }
    public IWeapon setbaseTUnload(double baseTUnload){
        this.baseTUnload = baseTUnload;
    }
    public IWeapon setbaseTReload(double baseTReload){
        this.baseTReload = baseTReload;
    }
    public IWeapon setbaseRSustained(double baseRSustained){
        this.baseRSustained = baseRSustained;
    }
    public IWeapon setbaseDPSSustained(double baseDPSSustained){
        this.baseDPSSustained = baseDPSSustained;
    }

    public shot(Enemy e, int nCharges);
    public abstract String toString();

}

public class RevolverWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class RepeatPistolsWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class SMGWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class CombatRifleWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class ShotgunWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class SniperRifleWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class RocketLauncherWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}

public class EridianWeapon extends Weapon {
    @Override
    public String toString(){
        return "Weapon type: Revolver";
    }
}