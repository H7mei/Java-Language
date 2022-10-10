public class Perulangan {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println("Hello World");
            i++;
        }

        // do while loop
        int si = 0;
        do {
            System.out.println("Hello World");
            si++;
        } while (si < 5);

        // for each loop
        String[] names = {"John", "Doe", "Jane"};
        for (String name : names) {
            System.out.println(name);
        }

        // break
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j);
        }

        // continue
        for (int j = 0; j < 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println(j);
        }

        // nested loop
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.println(j + " " + k);
            }
        }

    }
}
