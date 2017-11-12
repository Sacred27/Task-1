package Baza;


public class Tranzaction {
 private Long id;
  private int count;
  private int sum;


  public Tranzaction() {
  }
  public void setId(Long id) {
    this.id = id;
  }
   public Long getId() {
    return id;
  }
  public void setCount(int count) {
    this.count = count;
  }


  public int getCount() {
    return count;
  }
  
  public void setSum(int sum) {
    this.sum = sum;
  }

  public int getSum() {
    return sum;
  }
}
