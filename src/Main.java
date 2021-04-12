public class Main {
    public static void main(String[] args) {
        NhanVien [] nhanviens = new NhanVien[10];
        nhanviens[0] = new  NhanVienFullTime("nhanvien11", "lực điên", 23, "23094893","djshf",23423,2353463,66355);
        nhanviens[1] = new  NhanVienFullTime("nhanvien13", "lực", 23, "23094893","djshf",23423,2353463,663553213);
        nhanviens[2] = new NhanVienPartTime("nhanvien15", "Hiếu",20,"ưet32423","fgdsfg",15);
        nhanviens[3] = new NhanVienPartTime("nhanvien17", "Hiếu",20,"ưet32423","fgdsfg",15);
        nhanviens[4] = new NhanVienPartTime("nhanvien19", "Hiếu",20,"ưet32423","fgdsfg",15);
//       khai báo đối tượng quản lý
        ManagerNhanVien luc = new ManagerNhanVien(nhanviens);
        luc.display();
        luc.totalsalary1();
        luc.totalsalaryOfNVPartTime();

    }


}
