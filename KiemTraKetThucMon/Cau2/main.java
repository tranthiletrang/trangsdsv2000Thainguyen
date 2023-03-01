package KiemTraKetThucMon.Cau2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KyThuat kt1 = new KyThuat("012345","Trần Thị Lệ Trang","27/10/2000","Thái Nguyên","Kỹ thuật phần mềm");
        KyThuat kt2 = new KyThuat("54321");
        System.out.print("Nhap ten:");
        kt2.setHoTen(scanner.nextLine());
        System.out.print("Nhap ngay sinh theo dang dd/mm/yyyy:");
        kt2.setNamSinh(scanner.nextLine());
        System.out.print("Nhap dia chi:");
        kt2.setChuyenNganh(scanner.nextLine());
        System.out.print("Nhap chuyen nganh:");
        kt2.setChuyenNganh(scanner.nextLine());
        System.out.println(kt1.toString());
        System.out.println(kt2.toString());
    }
}

