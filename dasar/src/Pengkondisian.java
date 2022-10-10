public class Pengkondisian {
    public static void main(String[] args) {
        // if statement
        int nilai = 80;
        if (nilai >= 80) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 70) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 60) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 50) {
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }

        // switch statement
        int nilai2 = 80;
        switch (nilai2) {
            case 80:
                System.out.println("Nilai anda A");
                break;
            case 70:
                System.out.println("Nilai anda B");
                break;
            case 60:
                System.out.println("Nilai anda C");
                break;
            case 50:
                System.out.println("Nilai anda D");
                break;
            default:
                System.out.println("Nilai anda E");
                break;
        }

        // ternary operator
        int nilai3 = 80;
        String hasil = nilai3 >= 80 ? "Nilai anda A" : "Nilai anda B";
        System.out.println(hasil);

    }
}
