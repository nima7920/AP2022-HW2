package market;

public class Market {

    private static Market market;

    public static Market getInstance(){
        if(market==null)
            market=new Market();
        return market;
    }

    private Market(){

    }
}
