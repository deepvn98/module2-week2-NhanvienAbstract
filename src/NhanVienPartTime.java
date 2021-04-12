public class NhanVienPartTime extends NhanVien {
    private double timeWork;

    public NhanVienPartTime(String code, String name, int age, String telephone, String gmail, double timeWork) {
        super(code, name, age, telephone, gmail);
        this.timeWork = timeWork;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public double totalSalary() {
        return this.timeWork * 100000;
    }

    @Override
    public String toString() {
        return  super.toString()+ "NhanVienPartTime{" +
                "timeWork=" + timeWork +
                '}';
    }
}
