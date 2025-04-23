class Book {
  int id;
  String name;
  double price;

  Book(int id, String name) {
    this.id = id;
    this.name = name;
  }

  Book(int id, String name, double price) {
    this(id, name);
    this.price = price;
  }

  void display() {
    System.out.println(String.format("ID: %d \nName: %s \nPrice: %.2f", id, name, price));
  }
}

public class Program05_BookConstructorOverload {
  public static void main(String[] args) {
    Book b = new Book(101, "Java Book", 299.19555);
    b.display();
  }
}
