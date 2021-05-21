public class Main {
    public static void main(String[] args) {
        ManageCustomer manageCustomer =new ManageCustomer();
        manageCustomer.add(new Customer(1,"tuấn ",22,"hn"));
        manageCustomer.add(new Customer(2,"tân ",23,"hn"));
        manageCustomer.add(new Customer(3,"ngọc ",24,"hn"));
        manageCustomer.add(new Customer(4,"lan ",25,"hn"));
        manageCustomer.add(new Customer(5,"hoa ",26,"hn"));
        manageCustomer.add(new Customer(6,"huệ ",27,"hn"));
        manageCustomer.display();
        manageCustomer.delete("tuấn");
        manageCustomer.display();
    }

}
