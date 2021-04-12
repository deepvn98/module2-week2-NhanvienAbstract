public abstract class NhanVien {
    private String code;
    private String name;
    private int age;
    private String telephone;
    private String gmail;

    public NhanVien() {
    }

    public NhanVien(String code, String name, int age, String telephone, String gmail) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.gmail = gmail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(double prime) {
        this.gmail = gmail;
    }

    public abstract double totalSalary();

    @Override
    public String toString() {
        return "NhanVien{" +
                "code='" + code +
                ", name='" + name +
                ", age=" + age +
                ", telephone='" + telephone +
                ", gmail='" + gmail +
                '}';
    }
}
