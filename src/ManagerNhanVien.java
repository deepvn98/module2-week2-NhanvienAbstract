public class ManagerNhanVien {
    private NhanVien[] nhanViens;

    public ManagerNhanVien(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public NhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public void display(){
        for (NhanVien a: nhanViens) {
            if (a != null)
            System.out.println(a.toString());
        }

    }

    public void totalsalary1(){
         int count = 0;
         int sum = 0;
        for (NhanVien o: nhanViens) {
            if (o != null){
                sum += o.totalSalary();
                count++;
            }
        }
        for (NhanVien o: nhanViens) {
            if (o instanceof NhanVienFullTime){
                if (o.totalSalary() < sum/count){
//   hiển thị nhân viên có mức lương thấp hơn mức lương trung bình!
                    System.out.println(o.getName());
                }
            }

        }
    }
//    Tổng lương nhân viên parttime
    public void totalsalaryOfNVPartTime(){
        int count = 0;
        for (NhanVien o: nhanViens) {
            if (o != null){
                if (o instanceof NhanVienPartTime){
                    count += o.totalSalary();
                }
            }
        } System.out.println("Tổng lương nhân viên partTime là : " + count);

    }
}
