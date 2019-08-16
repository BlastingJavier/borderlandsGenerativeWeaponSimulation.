package builder;


public interface WeaponBuilder{
    public IWeapon buildManufactuer();
    public IWeapon buildRarity();
    public IWeapon buildWElement();
    public IWeapon buildMaterialGrade();
    public IWeapon buildbaseTUnload();
    public IWeapon buildbaseTReload();
    public IWeapon buildbaseRSustained();
    public IWeapon buildbaseDPSSustained();
}