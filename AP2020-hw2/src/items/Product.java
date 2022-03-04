package items;

public class Product {
    private String name;
    private long id;

    public Product(String name, long id) {
        if(name.length()<1 || name.length()>80){
            System.out.println("Invalid Product name");
            return;
        }
        this.name = name;
        this.id = id;
    }
}
