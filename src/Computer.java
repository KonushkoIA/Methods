import java.util.Random;
import java.util.Scanner;

public class Computer{

    private int cpu;
    private int ram;
    private int hdd;
    private int resource;
    boolean prom = false;
    boolean prom1 = false;
    private int promResource;

    public Computer() {
    }

    public Computer(int cpu, int ram, int hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getPromResource() {
        return promResource;
    }

    public void setPromResource(int promResource) {
        this.promResource = this.promResource + promResource;
    }

    public void description() {
        System.out.println("Процессор: IntelCore i" + cpu);
        System.out.println("Оперативная память: " + ram + " GB");
        System.out.println("Жёсткий диск: " + hdd + " GB");
        System.out.println("Ресурс: " + resource + " полных цикла(ов) работы");
        System.out.println();
    }

    public void start() {
        if (prom1) {
            System.out.println("Компьютер сгорел");
        } else {
        int a = (int) (Math.random() * 2);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число 0 или 1");
        if (scanner1.hasNextInt()) {
            int b = scanner1.nextInt();
            if ( a == b ) {
               prom = true;
            }
        } else {
            System.out.println("Это не число, перезапустите программу");
        }
        scanner1.close();
        if (prom) {
            setPromResource(1);
            if ( promResource == resource) {
                System.out.println("Компьютер сгорел");
                prom1 = true;
            } else
            System.out.println("Компьютер включен");
        } else {
            System.out.println("Компьтер сгорел");
            prom1 = true;
            }
        }
    }

    public void stop() {
        if (prom1) {
            System.out.println("Компьютер сгорел");
        } else {
        if (!prom) {
            System.out.println("Компьютер и так выключен");
        } else {
            int a = (int) (Math.random() * 2);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число 0 или 1");
        if (scanner2.hasNextInt()) {
            int b = scanner2.nextInt();
            if ( a == b ) {
                prom = true;
            }
        } else {
            System.out.println("Это не число, перезапустите программу");
        }
        scanner2.close();
        if (prom) {
            setPromResource(1);
            if ( promResource == resource) {
                System.out.println("Компьютер сгорел");
                prom1 = true;
            } else
            System.out.println("Компьютер выключен");
            prom = false;
        } else {
            System.out.println("Компьтер сгорел");
            prom1 = true;
                }
            }
        }
    }
}