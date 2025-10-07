package design_principles.adapter;

public interface IBankApi {
    
    void checkBalance(String a, String b);

    void transferAmount(String destination, String source , int amount);

}
