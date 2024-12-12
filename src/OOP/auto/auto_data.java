package OOP.auto;

public class auto_data {
    private String model;
    private String year;
    private String manufacturer;
    private String power;
    private String color;
    private String price;

    auto_data() {}

    public auto_data(String model, String year, String manufacturer, String power, String color, String price) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.power = power;
        this.color = color;
        this.price = price;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public void printInfo() {
        System.out.println("************ Данные Автомобиля ************");
        System.out.println("Название модели: " + this.model);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Производитель: " + this.manufacturer);
        System.out.println("Мощность двигателя: " + this.power);
        System.out.println("Цвет машины: " + this.color);
        System.out.println("Цена: " + this.price);
    }
}
