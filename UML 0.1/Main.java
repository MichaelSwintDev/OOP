
class Main {
  public static void main(String[] args) {
    Person example = new Person("Example", 21);

    System.out.print("name: " + example.getName());
    System.out.print("\nAge: " + example.getAge());
    example.getOlder();
    System.out.print("\nAge: " + example.getAge());
  }
}