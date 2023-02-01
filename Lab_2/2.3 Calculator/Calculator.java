public class Calculator
{
    private double m_value;

    public Calculator() {
        m_value = 0;
    }

    public void add(double val){
        m_value += val;
    }
    public void subtract(double val){
        m_value -= val;
    }
    public void multiply(double val){
        m_value *= val;
    }
    public void divide(double val){
        m_value /= val;
    }
    public void clear( ){
        m_value = 0;
    }
    public double getValue( ){
        return m_value;
    }
}