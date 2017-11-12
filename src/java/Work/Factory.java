
package Work;

import Baza.Product;


public class Factory {
  
  private static ProductW product = null;
  private static StoreW store = null;
  private static TranzactionW tranzaction = null;
  private static Factory instance = null;

  public static synchronized Factory getInstance(){
    if (instance == null){
      instance = new Factory();
    }
    return instance;
  }

  public ProductW getProductW(){
    if (product == null){
      product = new ProductW();
    }
    return product;
  }

  public StoreW getStoreW(){
    if (store == null){
      store = new StoreW();
    }
    return store;
  }

   public TranzactionW getTranzactionW(){
    if (tranzaction == null){
      tranzaction = new TranzactionW();
    }
    return tranzaction;
  }
}