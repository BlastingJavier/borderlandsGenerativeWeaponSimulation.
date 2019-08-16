package manufactuer;


public abstract class Manufactuer {


    public abstract String toString();
}


public class AtlasManufactuer extends Manufactuer {

    @Override
    public String toString(){
        return "Atlas";
    }
}

public class BanditManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Bandit"
    }
}
public class DahlManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Dahl";
    }
}
public class EridianManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Eridian";
    }
}
public class GearboxManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Gearbox";
    }
}
public class HyperionManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Hyperion";
    }
}
public class JackobsManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Jackobs";
    }
}
public class MaliwanManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Maliwan";
    }
}
public class SandSManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "S&S";
    }
}
public class TedioreManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Tediore";
    }
}
public class TorgueManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Torgue";
    }
}
public class VladofManufactuer extends Manufactuer {
    @Override
    public String toString(){
        return "Vladof";
    }
}
