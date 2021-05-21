import java.util.ArrayList;

public class ManageCustomer {
    ArrayList<Customer> khachHangs;

    public ManageCustomer() {
        this.khachHangs = new ArrayList<>();
    }
    public void add(Customer khachhang){
        khachHangs.add(khachhang);
    }
    public void display(){
        for (int i=0;i< khachHangs.size();i++){
            System.out.println(khachHangs.get(i));
        }
    }
    public int findByName(String name){
        for ( int i=0;i<khachHangs.size();i++){
            if ( khachHangs.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void delete(String name){
        int indexofCustomer=findByName(name);
        if( indexofCustomer==-1){
            System.out.println("không thấy");
        }else {
            khachHangs.remove(indexofCustomer);
        }
    }
}