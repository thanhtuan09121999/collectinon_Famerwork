public class Customer {
    private  int id;
    private String name;
    private int Age;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        Age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                ", address='" + address + '\'' +
                '}';
    }
}
