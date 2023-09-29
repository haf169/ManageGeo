package controller;

import java.util.ArrayList;
import view.Menu;
import common.Library;
import java.util.Collection;
import java.util.Collections;
import model.Country;
import model.EastAsiaCountries;

public class ManageEastAsia extends Menu<String> {

    Library lib = new Library();
    ArrayList<Country> countryList = new ArrayList();
    static String[] menu = {"Input the information of 11 countries in East Asia",
        "Display the information of country you've just input", "Search the information of country by user-entered name",
        "Display the information of countries sorted name in ascending order", "Exit"
    };

    public ManageEastAsia() {
        super("MENU", menu);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addNewCountry();
                break;
            case 2:
                displayAllCountries();
                break;
            case 3:
                searchCountry();
                break;
            case 4:
                sort();
                displayAllCountries();
            case 5:
                System.exit(0);
            default:
                return;
        }
    }

    
    public void addNewCountry () {
        String code = lib.getString("Enter code of the country");
        String name = lib.getString("Enter name of the country" );
        float area = lib.getFloat("Enter area of the country");
        String terrain = lib.getString("Enter terrain of the country");
        countryList.add(new EastAsiaCountries(terrain,code,name,area));
    }
    public void displayAllCountries() {
        System.out.println("ID\tName\t\tTotal Area\tTerrain");
        for (Country ct : countryList) {
            ct.display();
        }
    }
    public void searchCountry() {
        displayAllCountries();
        String nameSearch = lib.getString("Enter country name you want to find: ");
        System.out.println("Search Result");
        for (Country ct : countryList) {
            if (ct.getCountryName().contains(nameSearch)) ct.display();
        }
    }
    
    public void sort() {
        Collections.sort(countryList);
        
    }
}
