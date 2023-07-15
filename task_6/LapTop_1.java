package task_6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class LapTop_1 {
    public static void main(String[] args) {
        Laptop lt1 = new Laptop("Lenovo", "IdeaPad Gaming 3 i5 12450H", 8, 512, "Windows 10", "BLACK");
        Laptop lt2 = new Laptop("Acer", "Aspire 3 A315-23-R0HR", 8, 512, "Windows 10", "BLACK");
        Laptop lt3 = new Laptop("Lenovo", "IdeaPad 3 i5 1235U ", 8, 512, "Windows 11", "SILVER");
        Laptop lt4 = new Laptop("Asus", "ROG Strix G16 G614JU-N3170", 16, 1000, "Windows 11", "BLACK");
        Laptop lt5 = new Laptop("Aser", "Nitro N50-640 (DG.E2VMC.007)", 16, 1000, "Windows 10", "GRAY");
        Laptop lt6 = new Laptop("Huawei", "MateBook D16 RLEF-X", 16, 512, "Windows 10", "SILVER");
        Laptop lt7 = new Laptop("Asus", "ROG Zephyrus G14 GA402RJ-L4045", 8, 1000, "Windows 10", "SILVER");

        HashSet<Laptop> laptop = new HashSet<Laptop>(
                Arrays.asList(lt1, lt2, lt3, lt4, lt5, lt6, lt7 ));

        Scanner sc = new Scanner(System.in, "cp866");

        System.out.println();
        System.out.println("ПРИВЕТ !" +
                "Готов уже выбрать ???\n");
        boolean filter = true;
        while (filter) {
            System.out.println("Выбрать по ОЗУ, введите - 1\n" +
                    "Выбрать по объему жесткого диска, введите - 2\n" +
                    "Выбрать по оперативной системе, введите - 3\n" +
                    "Выбрать по цвету, введите - 4\n" +
                    "Посмотреть все модели, введите - 5\n" +
                    "Для выхода из каталога, введите - 0");
       
            String operation = sc.nextLine();
            switch (operation) {
                case "1":
                    filterDDr(laptop, sc);
                    break;
                case "2":
                    FilterHDD(laptop, sc);
                    break;
                case "3":
                    filterOS(laptop, sc);
                    break;
                case "4":
                    filterColor(laptop, sc);
                    break;
                case "5":
                    showCatalog(laptop);
                    break;
                case "0":
                    System.out.println("Спасибо !");
                    filter = false;
                    break;
                default:
                    System.out.println("НЕВЕРНЫЙ ВВОД !");
                    System.out.println();
                    break;
            }
        }

    }
    // Функция фильтра по объему ОЗУ
    public static void filterDDr(HashSet<Laptop> laptop, Scanner scanner) {
        TreeSet<Integer> ddr = new TreeSet<>();
        for (Laptop note : laptop) {
            ddr.add(note.getDDr());
        }
        System.out.println();
        System.out.println("Объем Памяти : "
                + ddr.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Выберите : ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (ddr.contains(filter)) {
            System.out.println();

            for (Laptop note : laptop) {
                if (note.getDDr() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("УПС!!");
            filterDDr(laptop, scanner);
        }

    }
    // Функция фильтра по объему жесткого диска
    public static void FilterHDD(HashSet<Laptop> laptop, Scanner scanner) {
        TreeSet<Integer> hdd = new TreeSet<>();
        for (Laptop note : laptop) {
            hdd.add(note.getHDD());
        }
        System.out.println();
        System.out.println(" Объемом жесткого диска "
                + hdd.toString().replaceAll("^\\[|\\]$", "") + " Гб\n" +
                "Ваш Выбор : ");

        String oper = scanner.nextLine();
        int filter = Integer.parseInt(oper);
        if (hdd.contains(filter)) {
            System.out.println();
            
            for (Laptop note : laptop) {
                if (note.getHDD() == filter) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Опять-УПС!- Попробуйте снова");
            FilterHDD(laptop, scanner);
        }
    }
    // Функция поиска по ОС
    public static void filterOS(HashSet<Laptop> laptop, Scanner scanner) {
        TreeSet<String> oS = new TreeSet<>();
        for (Laptop note : laptop) {
            oS.add(note.getoS());
        }
        System.out.println();
        System.out.println("Операционные системы: "
                + oS.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Ваш Выбор : ");

        String oper = scanner.nextLine().toUpperCase();
        if (oS.contains(oper)) {
            System.out.println();
           
            for (Laptop note : laptop) {
                if (note.getoS().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("Нет такой ОС. Сори!");
            filterOS(laptop, scanner);

        }
    }
    // Функция поиска по цвету
    public static void filterColor(HashSet<Laptop> laptop, Scanner scanner){
        TreeSet<String> colors = new TreeSet<>();
        for (Laptop note: laptop){
            colors.add(note.getColor());
        }
        System.out.println();
        System.out.println(" Есть сдедующий цвет : "
                + colors.toString().replaceAll("^\\[|\\]$", "") + "\n" +
                "Ваш Выбор : ");
      
        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            
            for (Laptop note : laptop) {
                if (note.getColor().equals(oper)) {
                    note.showInfo();
                }
            }
        } else {
            System.out.println("В наличии нет");
            filterColor(laptop, scanner);
        }
    }
    // Функция вывода полного каталога в консоль
    public static void showCatalog(HashSet<Laptop> laptop){
        System.out.println();
        System.out.println("Все Что Имеем В НАЛИЧИИ : ");
        System.out.println();
        for (Laptop note : laptop) {
                note.showInfo();
        }
    }
}