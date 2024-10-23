import java.util.Scanner;

public class BTVN_Buoi_1 {
    public class Student{
        String ten, tuoi, diaChi, hocLuc;
        double diemToan, diemVan, diemAnh, diemTrungBinh;
        Student(double diemToan, double diemVan, double diemAnh){
            this.diemToan = diemToan;
            this.diemVan = diemVan;
            this.diemAnh = diemAnh;
        }
        void getDiemTrungBinh()
        {
            this.diemTrungBinh = (this.diemToan + this.diemVan + this.diemAnh)/3;
        }

        void getHocLuc() {
            if (diemTrungBinh >= 8){
                hocLuc = "Xuat sac";
            }
            else if (diemTrungBinh >= 7){
                hocLuc = "Gioi";
            }
            else if (diemTrungBinh >= 6){
                hocLuc = "Kha";
            }
            else if (diemTrungBinh >= 5){
                hocLuc = "Trung binh";
            }
            else {
                hocLuc = "Yeu";
            }
        }
    }

    public class StudentManager{
        void inDiem(Student s) {
            System.out.println(s.ten + " " + s.tuoi + " " + s.diaChi + " " + s.diemToan + " " + s.diemVan + " " + s.diemAnh + " " + s.diemTrungBinh + " " + s.hocLuc);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] sinhVien = new Student[n+1];
        for(int i = 1; i <= n; i++) {
            sinhVien[i] = new Student(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sinhVien[i].diemTrungBinh = (sinhVien[i].diemToan + sinhVien[i].diemVan + sinhVien[i].diemAnh)/3;
            sinhVien[i].getDiemTrungBinh();
            sinhVien[i].getHocLuc();
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int i = sc.nextInt();
            StudentManager.inDiem(sinhVien[i]);
        }
    }
}
