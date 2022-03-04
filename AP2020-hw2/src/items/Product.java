package items;

public class Product {
    private String name;
    private int id;

    public Product(String name,int id){
        if(name.length()<1 || name.length()>80){
            System.out.println("Product name is invalid");
            return;
        }
        this.name=name;
        this.id=id;
    }
}
