
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import manufactuer.AtlasManufactuer;
import manufactuer.DahlManufactuer;
import manufactuer.EridianManufactuer;
import manufactuer.GearboxManufactuer;
import manufactuer.HyperionManufactuer;
import manufactuer.JackobsManufactuer;
import manufactuer.MaliwanManufactuer;
import manufactuer.Manufactuer;
import manufactuer.ManufactuerTier;
import manufactuer.PossibleWeaponsbyManufactuer;
import manufactuer.SandSManufactuer;
import manufactuer.TedioreManufactuer;
import manufactuer.TorgueManufactuer;
import manufactuer.VladofManufactuer;
import weapon.MaterialGrade;
/**
 * Example class
 */
public class WeaponGenerator {

    private Weapon weapon;
    static void print(String value) {
        System.out.println(value);
    }

    public Manufactuer randomGetManufactuer(int actualLevel){
        Manufactuer returnManufactuer;

        String[] possibleManu = new String[] {"Atlas", "Dahl", "Eridian", "Gearbox", "Hyperion",
                                                        "Jackobs", "Maliwan", "SandS", "Tediore", "Torgue",
                                                        "Vladof"};                               
        List<String> possibleManufactuers = Arrays.asList(possibleManu);
        String election;
        int listSize = possibleManufactuers.size();
        ThreadLocalRandom randomMan = ThreadLocalRandom.current();
        typeManufactuer = possibleManufactuers.get(randomMan.nextInt(listSize));


        switch(typeManufactuer) {
            case "Atlas": returnManufactuer = getAtlas(randomMan);
                
            case "Dahl": returnManufactuer = getDahl(randomMan);
                
            case "Eridian": returnManufactuer = getEridian(randomMan);

            case "Gearbox":returnManufactuer = getGearbox(randomMan);
                
            case "Hyperion":returnManufactuer = getHyperion(randomMan);
                
            case "Jackobs":returnManufactuer = getJackobs(randomMan);
               
            case "Maliwan":returnManufactuer = getMaliwan(randomMan);
                
            case "SandS":returnManufactuer = getSandS(randomMan);

            case "Tediore":returnManufactuer = getTediore(randomMan);

            case "Torgue":returnManufactuer = getTorgue(randomMan);
            
            case "Vladof":returnManufactuer = getVladof(randomMan);
        }

        return returnManufactuer;
    }

    public Manufactuer getAtlas(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.ATLAS;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.ATLAS;
        MaterialGrade matG = MaterialGrade.ATLAS;
        matGCodes = matG.getCodes();
        returnManufactuer = new AtlasManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                                randomMan.nextGaussian(),
                                                manuTier.getByIndex(actualLevel),
                                                matGCodes[randomMan.nextInt(matGCodes.length)]);                                            matGCodes[randomMan.nextInt(matGCodes.length)]);

    }

    public Manufactuer getDahl(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.DAHL;
                typeWeapon = possibleW.getArray();

                ManufactuerTier manuTier = ManufactuerTier.DAHL;
                MaterialGrade matG = MaterialGrade.DAHL;
                matGCodes = matG.getCodes();
                returnManufactuer = new DahlManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                                randomMan.nextGaussian(),
                                                manuTier.getByIndex(actualLevel),
                                                matGCodes[randomMan.nextInt(matGCodes.length)]);
    }

    public Manufactuer getEridian(ThreadLocalRandom randomMan) {
        ManufactuerTier manuTier = ManufactuerTier.ERIDIAN;
        MaterialGrade matG = MaterialGrade.ERIDIAN;
        matGCodes = matG.getCodes();
        returnManufactuer = new EridianManufactuer("Eridian",
                                                randomMan.nextGaussian(),
                                                manuTier.getByIndex(actualLevel),
                                                matGCodes[randomMan.nextInt(matGCodes.length)]);   
    }

    public Manufactuer getGearbox(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.GEARBOX;
                typeWeapon = possibleW.getArray();

                ManufactuerTier manuTier = ManufactuerTier.DAHL;
                MaterialGrade matG = MaterialGrade.DAHL;
                matGCodes = matG.getCodes();
                returnManufactuer = new GearboxManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                                randomMan.nextGaussian(),
                                                manuTier.getByIndex(actualLevel),
                                                matGCodes[randomMan.nextInt(matGCodes.length)]);
    }

    public Manufactuer getHyperion(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.HYPERION;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.HYPERION;
        MaterialGrade matG = MaterialGrade.HYPERION;
        matGCodes = matG.getCodes();
        returnManufactuer = new HyperionManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                        randomMan.nextInt(),
                                        randomMan.nextInt(),
                                        randomMan.nextInt(),
                                        manuTier.getByIndex(actualLevel),
                                        matGCodes[randomMan.nextInt(matGCodes.length)]);
    }
    public Manufactuer getJackobs(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.JACKOBS;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.JACKOBS;
        MaterialGrade matG = MaterialGrade.JACKOBS;
        matGCodes = matG.getCodes();
        returnManufactuer = new JackobsManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                        randomMan.nextInt(),
                                        randomMan.nextInt(),
                                        randomMan.nextInt(),
                                        manuTier.getByIndex(actualLevel),
                                        matGCodes[randomMan.nextInt(matGCodes.length)]);
    }
    public Manufactuer getMaliwan(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.MALIWAN;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.MALIWAN;
        MaterialGrade matG = MaterialGrade.MALIWAN;
        matGCodes = matG.getCodes();
        returnManufactuer = new MaliwanManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                        randomMan.nextInt(),
                                        manuTier.getByIndex(actualLevel),
                                        matGCodes[randomMan.nextInt(matGCodes.length)]);
    }
    public Manufactuer getSandS(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.SANDS;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.SANDS;
        MaterialGrade matG = MaterialGrade.SANDS;
        matGCodes = matG.getCodes();
        returnManufactuer = new SandSManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                        randomMan.nextInt(),
                                        manuTier.getByIndex(actualLevel),
                                        matGCodes[randomMan.nextInt(matGCodes.length)]);
    }

    public Manufactuer getTediore(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.TEDIORE;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.TEDIORE;
        MaterialGrade matG = MaterialGrade.TEDIORE;
        matGCodes = matG.getCodes();
        returnManufactuer = new TedioreManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                        randomMan.nextInt(),
                                        manuTier.getByIndex(actualLevel),
                                        matGCodes[randomMan.nextInt(matGCodes.length)]);
    }
    public Manufactuer getTorgue(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.TORGUE;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.TORGUE;
        MaterialGrade matG = MaterialGrade.TORGUE;
        matGCodes = matG.getCodes();
        returnManufactuer = new TorgueManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                        randomMan.nextInt(),
                                        randomMan.nextInt(),
                                        manuTier.getByIndex(actualLevel),
                                        matGCodes[randomMan.nextInt(matGCodes.length)]);
    }
    
    public Manufactuer getVladof(ThreadLocalRandom randomMan) {
        PossibleWeaponsbyManufactuer possibleW = PossibleWeaponsbyManufactuer.VLADOF;
        typeWeapon = possibleW.getArray();

        ManufactuerTier manuTier = ManufactuerTier.VLADOF;
        MaterialGrade matG = MaterialGrade.VLADOF;
        matGCodes = matG.getCodes();
        returnManufactuer = new VladofManufactuer(typeWeapon[randomMan.nextInt(typeWeapon.length)],
                                        randomMan.nextInt(),
                                        manuTier.getByIndex(actualLevel),
                                        matGCodes[randomMan.nextInt(matGCodes.length)]);
    }

    public Rarity randomGetRarity(int actualLevel) {

    }


    public static void main(String[] args) {
        //random Gaussian
        Random random = new Random();
        double val = random.nextGaussian() * 100 + 500;
        int mili = (int) Math.round(val);
        print("" + mili);
        print("Random Gausian (0, 1) : "+ThreadLocalRandom.current().nextGaussian());
        print("Random Gaussian mu =  80 and sigma = 10 : "+ (ThreadLocalRandom.current().nextGaussian()*100 + 500));
        print("Random Gaussian mu =  80 and sigma = 20: "+ (ThreadLocalRandom.current().nextGaussian()*100 + 1000));
    }
}