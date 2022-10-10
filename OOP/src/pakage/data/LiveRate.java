package pakage.data;

class SAP {
    String name;
    double rate;

    SAP(String name, double rate){
        this.name = name;
        this.rate = rate;
    }
}

public class LiveRate {
    public static void main(String[] args) {
        // Live Rate Data
        var Indonesia = new SAP("Indonesia", 0.1);
        var Malaysia = new SAP("Malaysia", 0.2);
        var Singapore = new SAP("Singapore", 0.3);

        // make list of SAP
        var SAP = new SAP[3];
        SAP[] data = {
            Indonesia,
            Malaysia,
            Singapore
        };

        // print SAP
        for (int i = 0; i < SAP.length; i++) {
            printData(data[i]);
        }

    }

    static void printData(SAP country){
        System.out.println("Country: " + country.name);
        System.out.println("Live Rate: " + country.rate);
    }


}
