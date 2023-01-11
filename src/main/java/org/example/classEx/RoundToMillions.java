package org.example.classEx;

public class RoundToMillions {

    public static void main(String[] args) {
        City city1=new City("germany",15000000);
        City city2=new City("england",1750000);
        City city3=new City("france",1950000);
        City city4=new City("poland",250000);
        //if population <500000 -> 0
        //if population >500000 round -2000000

        City [] cites={city1,city2,city3,city4};
        millionsRounding(cites);

    }


    public static void millionsRounding(City[] cities) {

        for(int i=0;i<cities.length;i++){
            if(cities[i].getPopulation()>500000){
                cities[i].setPopulation(2000000);
            }else if(cities[i].getPopulation()<500000){
                cities[i].setPopulation(0);
            }
        }
        for(int j=0;j<cities.length;j++){
            System.out.println(cities[j].getCityName() + " " + cities[j].getPopulation());
        }
    }

}

 class City{


     private String cityName;
     private long population;

     public City(){

     }
     public City(String cityName,long population){
         this.cityName=cityName;
         this.population=population;
     }

     public String getCityName() {
         return cityName;
     }

     public void setCityName(String cityName) {
         this.cityName = cityName;
     }

     public long getPopulation() {
         return population;
     }

     public void setPopulation(long population) {
         this.population = population;
     }




}
