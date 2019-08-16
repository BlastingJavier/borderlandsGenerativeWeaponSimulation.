package weapon;

import manufactuer.Manufactuer;

public interface IWeapon {
    public IWeapon setManufactuer(Manufactuer manu);
    public IWeapon setRarity(Rarity rarity);
    public IWeapon setWElement(WElement wele);
    public IWeapon setMaterialGrade(List<Tuple<String, Tuple<String, String>>> mGrade);
    public IWeapon setbaseTUnload(double baseTUnload);
    public IWeapon setbaseTReload(double baseTReload);
    public IWeapon setbaseRSustained(double baseRSustained);
    public IWeapon setbaseDPSSustained(double baseDPSSustained);

}