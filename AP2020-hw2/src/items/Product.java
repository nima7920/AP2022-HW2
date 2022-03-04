package items;

import users.User;

public class Product {
    protected String name;
    protected User user;
    protected long id;

    public Product(String name,User user) {
        if(name.length()<1 || name.length()>80){
            System.out.println("Invalid Product name");
            return;
        }
        this.name = name;
        this.user=user;
        generateID();
    }

    private void generateID(){
        this.id=System.nanoTime();
    }
}
