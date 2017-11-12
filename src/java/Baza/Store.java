package Baza;



public class Store {
 private Long idStore;
  private String name;


  public Store() {
  }
  public void setId(Long id) {
    this.idStore = id;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return idStore;
  }
  public String getName() {
    return name;
  }
   
}
