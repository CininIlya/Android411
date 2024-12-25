package OOP.Obiem_parallelepiped;

public class Box {
    private double width;
    private double height;

    public Box(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("Обьект Box3d:\t" + Integer.toHexString(hashCode()));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;

    }
}

//   private double width;
//    double height;
//    double glubina;
//Box(Box obj){
//    width  = obj.width;
//    height  = obj.height;
//    glubina  = obj.glubina;
//}
//
//    public Box(double w, double h, double g) {
//        this.width = w;
//        this.height = h;
//        this.glubina = g;
//        System.out.println("Обьект Box3d:\t" + Double.toHexString(hashCode()));
//    }
//
//    public Box(Box3d obj) {
//
//    }
//
//    @Override
//    public String toString() {
//        return "Box {" +
//                "ширина = " + width +
//                ", высота = " + height +
//                ", глубина = " + glubina +
//                '}';
//    }
//
//    double vol (){
//        return width*height*glubina;

