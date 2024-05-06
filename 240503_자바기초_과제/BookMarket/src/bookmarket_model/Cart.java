package bookmarket_model;

import java.util.ArrayList;

public class Cart {
  private ArrayList<CartItem> itemList = new ArrayList<>();

  private int numItems = 0;

  public boolean isEmpty() {
    return numItems == 0;
  }

  public ArrayList<CartItem> getItemList() {
    return itemList;
  }

  public void setItemList(ArrayList<CartItem> itemList) {
    this.itemList = itemList;
  }

  public int getNumItems() {
    return numItems;
  }
  
  public void setNumItems(int numItems) {
    this.numItems = numItems;
  }

  public String getItemInfo(int index) {
    return itemList.get(index).toString();
  }

  public void addItem(Book book) {
    CartItem item = getCartItem(book);
    if (item == null) {
      itemList.add(numItems++, new CartItem(book));
    } else {
      item.addQuantity(1);
    }
  }

  private CartItem getCartItem(Book book) {
    for (int i = 0; i < numItems; i++) {
      if (itemList.get(i).getBook() == book) {
        return itemList.get(i);
      }
    }
    return null;
  }

  public void resetCart() {
    numItems = 0;
    this.itemList = new ArrayList<>();
  }

}
