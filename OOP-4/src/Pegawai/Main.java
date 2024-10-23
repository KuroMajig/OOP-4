package Pegawai;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("KuroMajig", 10000000, 2500000);
        Programmer programmer = new Programmer("Kiki", 6000000, 1400000);

        manager.cetakInfo();
        programmer.cetakInfo();
    }
}