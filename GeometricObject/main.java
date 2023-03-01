package GeometricObject;

public class main {
    public static void main(String[] args) {
        geometrivObject[] g = new geometrivObject[2];
        g[0] = new Rectangle(4,5);
        g[1] = new Circle(2);
        for(geometrivObject g1: g){
            System.out.println(g1);
        }
    }
}
