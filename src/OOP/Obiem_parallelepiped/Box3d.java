package OOP.Obiem_parallelepiped;


public class Box3d extends Box {

    private double depth;
    private double width;
    private double height;

    public Box3d(double width, double height, double depth) {
        super(width, height);
        this.depth = depth;
        this.width = width;
        this.height = height;
//        setWidth(width);
//        setHeight(height);
//        setDepth(depth);
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return super.toString() + "Box3d{" +
                " Глубина =  " + depth + "," + " Ширина =  " + width + "," + " Высота =  " + height +
                '}';
    }

    protected double vol() {
        return width * height * depth;


        //    double corob;
//    Box3d(Box3d obj){
//    super(obj);
//    corob= obj.corob;
//
//}
//
//  public Box3d(double w, double h, double g) {
//        super(w,h,g);
//      System.out.println("Обьект Box:\t" + Double.toHexString(hashCode()));
//    }
//
//    public double getCorob() {
//        return corob;
//    }
//
//    public void setCorob(double corob) {
//        this.corob = corob;
//    }
//
//    {
//
//    }
//    @Override
//    public String toString() {
//        return super.toString()
//                 +
//                '}';
    }
}

