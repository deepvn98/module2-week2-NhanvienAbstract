public class NhanVienFullTime extends NhanVien{
    private double bonus;
    private double fine;
    private double gossSalary;

    public NhanVienFullTime(String code, String name, int age, String telephone, String gmail, double bonus, double fine, double gossSalary) {
        super(code, name, age, telephone, gmail);
        this.bonus = bonus;
        this.fine = fine;
        this.gossSalary = gossSalary;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getFine() {
        return fine;
    }
    public void setFine(double fine) {
        this.fine = fine;
    }
    public double getGossSalary() {
        return gossSalary;
    }
    public void setGossSalary(double gossSalary) {
        this.gossSalary = gossSalary;
    }
    @Override
    public double totalSalary() {
        return this.gossSalary + this.bonus -this.fine;
    }

    @Override
    public String toString() {
        return super.toString()+ "NhanVienFullTime{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", gossSalary=" + gossSalary +
                '}';
    }
}
