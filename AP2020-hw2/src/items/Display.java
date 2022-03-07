package items;

public class Display {

    private double size;
    private double ratio;
    private double density;

    public Display(double size, double ratio, int density) {
        this.size = size;
        this.ratio = ratio;
        this.density = density;
    }

    public double getSurfaceArea(){
        double width =  Math.cos(Math.atan(ratio)) * size;
        double height =  Math.sin(Math.atan(ratio)) * size;
        return width * height;
    }

    public double getResolution(){
        return getSurfaceArea() * density;
    }

    public double getPrice(){
        return 1.5 * getResolution() + 500 * getSurfaceArea();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }
}
