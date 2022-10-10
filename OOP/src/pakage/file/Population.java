package pakage.file;

class County {
    String name;
    int population;
    int liveRate;
}

public class Population {
    public static void main(String[] args) {
        // Population
        int population = 100000;
        int year = 0;
        while(population < 200000){
            population += (int) (population * 0.1);
            year++;
        }
        System.out.println("Population will reach 200000 in " + year + " years");

        var country = new County();
        country.name = "Indonesia";
        country.population = population + year * (int) 0.1;
        country.liveRate = liveRate(country.population, year);

        printData(country);
    }

    static int liveRate(int population, int liveRate){
        return population * liveRate / 100;
    }

    static void printData(County country){
        System.out.println("Country: " + country.name);
        System.out.println("Population: " + country.population);
        System.out.println("Live Rate: " + country.liveRate);
    }
}
