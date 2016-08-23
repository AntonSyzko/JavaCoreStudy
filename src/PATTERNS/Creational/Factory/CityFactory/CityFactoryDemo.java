package PATTERNS.Creational.Factory.CityFactory;

/**
 * Created by Admin on 31.07.2016.
 */
public class CityFactoryDemo {

    public static void main(String[] args) {
        CityFactory factoryForCities = new CityFactory();
        City london = factoryForCities.getCityByName("London");
        london.liveIn();
        City novayourk = factoryForCities.getCityByName("New York");
        novayourk.liveIn();
        City londonCode = factoryForCities.getCityByCode(1);
        londonCode.liveIn();
        City nyCode = factoryForCities.getCityByCode(2);
        nyCode.liveIn();
    }
}
