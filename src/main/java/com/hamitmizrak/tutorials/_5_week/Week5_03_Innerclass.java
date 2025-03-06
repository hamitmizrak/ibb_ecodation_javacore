package com.hamitmizrak.tutorials._5_week;



// Javada;
// 1 tane public class yazabilirsiniz (inner class hariç)
// static class yazamayız (inner class hariç)
public class Week5_03_Innerclass {
    // Variable
    private String countryName;

    // GETTER AND SETTER
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    // INNER CLASS
    public static class City{
        // Variable
        private String cityName;

        // GETTER AND SETTER
        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
    } // end inner class

} //end Country

class MainInnerClass{
    public static void main(String[] args) {

        // Country
        Week5_03_Innerclass country= new Week5_03_Innerclass();
        country.setCountryName("Türkiye");

        // City
        Week5_03_Innerclass.City city= new Week5_03_Innerclass.City();
        city.setCityName("Malatya");

        System.out.println("Ulke: "+country.getCountryName()+" Sehir: "+city.getCityName());

    }
}