import java.util.Random;

public class RandomNumbers {
	
	Random random = new Random();
   private int m_var1;
   private int m_var2;
   private int m_var3;
   
   
   public void setRandomValues(int low, int high)
   {
      if(low == high)
         {
            m_var1 = low;
            m_var2 = low;
            m_var3 = low;
         }
      else if((high - low)+low == 0)
      {
            m_var1 = 0;
            m_var2 = 0;
            m_var3 = 0;
      }
      else{
      m_var1 = random.nextInt(high-low)+low;
      m_var2 = random.nextInt(high-low)+low;
      m_var3 = random.nextInt(high-low)+low;
      }
   }
   
   public int getVar1(){return m_var1;}
   public int getVar2(){return m_var2;}
   public int getVar3(){return m_var3;}
   
   public void getRandomValues(){
   
   System.out.format("Random values: %d %d %d\n", m_var1,m_var2,m_var3);
   }
   
}