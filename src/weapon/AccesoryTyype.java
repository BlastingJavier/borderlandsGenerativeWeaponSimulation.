package weapon;

import Tuple.Tuple;
import java.util.ArrayList;
import java.util.List;


public class AccesoryTyype {
    private int damageMod;
    private int accuracyMod;
    private int fireRateMod;
    private int techLevelMod;
    private int recoilMod;
    
    private List<Tuple<String, Integer>> extraMods = new ArrayList<Tuple<String, Integer>>();
    

    public AccesoryTyype(int damgMod, int AccMod, int FireRMod, int techLevelMod,
                        int RecoilMod, List<Tuple<String, Integer>> extraMods){
                            
        this.damageMod = damgMod;
        this.accuracyMod = AccMod;
        this.fireRateMod = FireRMod;
        this.techLevelMod = techLevelMod;
        this.recoilMod = RecoilMod;
        this.extraMods = extraMods;
    }

    public int getdamageMod() {
        return damageMod;
    }

    public int getaccuracyMod() {
        return accuracyMod;
    }

    public int getFireRateMod() {
        return fireRateMod;
    }

    public int getTechLevelMod() {
        return techLevelMod;
    }

    public int getRecoilMod() {
        return recoilMod;
    }


}

public class 