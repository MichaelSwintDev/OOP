public class Product {

    private String m_code;
    private double m_price;
    private int m_count;

    public Product(String code, double price, int count){
        m_code = code;
        m_price = price;
        m_count = count;
    }
    public void setCode(String code){
        m_code = code;
    }
    public String getCode(){
        return  m_code;
    }
    public void setPrice(double p){
        m_price = p;
    }
    public double getPrice(){
        return m_price;
    }
    public void setCount(int num){
        m_count = num;
    }
    public int getCount(){
        return m_count;
    }
    public void addInventory(int amt){
        m_count += amt;
    }
    public void sellInventory(int amt){
        m_count -= amt;
    }
}
