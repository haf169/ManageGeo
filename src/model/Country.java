package model;

public class Country implements Comparable<Country>{

    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country(String countryCode, String countryName, float totalArea)  {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public Country() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    @Override
    public String toString() {
        return "Country{" + "countryCode=" + countryCode + ", countryName=" + countryName + ", totalArea=" + totalArea + '}';
    }

    public void display() {
        System.out.println(countryCode + "\t"+countryName+"\t\t"+totalArea);
    }
    
    @Override
    public int compareTo(Country o) {
        return this.countryName.compareTo(o.getCountryName());
    }
    
    
}
