package KiemTraKetThucMon.Cau1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius;
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Nhap ban kinh:");
            radius = in.nextDouble();

            if(radius < 0){
                throw new RuntimeException("Error");
            }else {
                System.out.println(new Circle(radius));
            }
        } catch (NumberFormatException e){
            System.out.println("Nhập sai định dạng bán kính");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
