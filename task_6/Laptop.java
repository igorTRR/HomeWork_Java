package task_6;

public class Laptop {
    String brand;
    String model;
    int DDr;
    int HDD;
    String oS;
    String color;

    // Конструктор
    public Laptop(String brand, String model, int DDr, int HDD, String oS, String color){
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.DDr = DDr;
        this.HDD = HDD;
        this.oS = oS.toUpperCase();
        this.color = color.toLowerCase();
    }


    // Сэттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setDDr(int DDr) {
        this.DDr = DDr;
    }
    public void setHDD(int HDD) {
        this.HDD = HDD;
    }
    public void setoS(String oS) {
        this.oS = oS;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Геттеры
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getDDr() {
        return DDr;
    }
    public int getHDD() {
        return HDD;
    }
    public String getoS() {
        return oS;
    }
    public String getColor() {
        return color;
    }
    

    //Вывод в консоль
    public void showInfo(){
        System.out.println(String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n",
        this.brand, this.model, this.DDr, this.HDD, this.oS, this.color));
    }
    
    @Override
    public String toString() {
        return (String.format("Производитель: %s\nМодель: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n"+"\n",
        this.brand, this.model, this.DDr, this.HDD, this.oS, this.color));
    }
}