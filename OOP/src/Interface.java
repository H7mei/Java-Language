import pakage.data.FDM;
public class Interface implements FDM  {
    public boolean cek() {
        return true;
    }
    public String getBrand() {
        return "FDM";
    }
    public void print() {
        System.out.println("Hello World!");
    }

    public int getTime() {
        return 2300 + 100;
    }

    public static void main(String[] args) {
        Interface i = new Interface();
        i.print();
        System.out.println(i.getBrand());
        System.out.println(i.cek());
        System.out.println(i.getTime() + "AM");
        i.printTime();
    }
}