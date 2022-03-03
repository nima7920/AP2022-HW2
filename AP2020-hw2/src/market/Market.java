package market;

public class Market {

    /**
     * For market class, we will use Singleton design pattern.
     * Singleton is used when you want to have only one instance of a class in your entire program
     * In this exercise, all objects should use the instance of Market, so we need only one instance of
     * Market in our entire program. Hence , we make it Singleton.
     */
    private static Market market;

    public static Market getInstance(){
        if(market==null)
            market=new Market();
        return market;
    }

    private Market(){

    }
}
