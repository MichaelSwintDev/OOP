public class Person
{
  private String m_name;
  private int m_age;

  public Person(String name, int age){
    m_name = name;
    m_age = age;
  }
  public String getName(){
    return m_name;
  }
  public void getOlder(){
    m_age += 1;
  }
  public int getAge(){
    return m_age;
  }
}