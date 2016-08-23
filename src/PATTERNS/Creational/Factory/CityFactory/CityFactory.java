package PATTERNS.Creational.Factory.CityFactory;

/**
 * Created by Admin on 31.07.2016.
 */
public class CityFactory {

    public static final int LONDON_CODE = 1;
    public static final int NY_CODE=2;
    public City getCityByName(String cityName){
        if(cityName == null){
            return null;
        }

        if(cityName.equalsIgnoreCase("London")){
            return new LondonCity();
        }if(cityName.equalsIgnoreCase("New York")){
            return new NewYork();
        }

        return null;//make copiler happy
    }

    public City getCityByCode(int code){
        if((code!=LONDON_CODE)&&(code!=NY_CODE)){
            System.out.println(" no such a city");
            return null;
        }

        if(code==LONDON_CODE){
            return new LondonCity();
        }if(code == NY_CODE){
            return new NewYork();
        }

        return null;
    }
}
