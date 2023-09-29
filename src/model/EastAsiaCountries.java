package model;

public class EastAsiaCountries extends Country{
    private String countryTerrain;

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries() {
        super();
    }
    
    @Override
    public void display() {
        System.out.println(countryCode + "\t"+countryName+"\t"+totalArea+"\t"+countryTerrain);
    }
}
