
package Baza;


public class Product {
private Long idProduct;
  private String name;
  private int price;


  public Product() {
  }
  public void setId(Long id) {
    this.idProduct = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Long getId() {
    return idProduct;
  }
  public String getName() {
    return name;
  }
    public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
