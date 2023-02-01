
class Main {
  public static void main(String[] args) {
    Person example = new Person("Example", 21, "Chip");

    System.out.print("name: " + example.getName());
    System.out.print("\nAge: " + example.getAge());
    example.getOlder();
    System.out.print("\nAge: " + example.getAge());
    System.out.print("\nDog: " + example.getDog());
    System.out.print("\n");
    example.getDog().bark();
    System.out.print("\n");
  }
}