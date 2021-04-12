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
                    System.out.println(o.getName());
                }
            }

        }
    }
}
