package pakage.data;

// multiple interface
interface isMaintenance {
    public boolean cek();
}

interface hasBrand {
    public String getBrand();
}

public interface FDM  extends hasBrand, isMaintenance {
    void print();
    int getTime();
    // default method
    default void printTime() {
        System.out.println(getTime() + "AM");
    }
}