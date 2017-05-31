package com.example.lenovo.fragmentsdialogslists.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.orm.SugarRecord;

import java.io.Serializable;

/**
 * Created by Lenovo on 5/5/2017.
 */

public class CategoryItems extends SugarRecord implements Serializable{
    private int imageURI;
    private String itemDescription;
    private String itemTitle;
    private String itemPrice;

    private String category;

    public CategoryItems(String category,int imageURI, String itemDescription, String itemTitle, String itemPrice) {
        this.setImageURI(imageURI);
        this.setItemDescription(itemDescription);
        this.setItemTitle(itemTitle);
        this.setItemPrice(itemPrice);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public CategoryItems() {
    }

    public int getImageURI() {
        return imageURI;
    }

    public void setImageURI(int imageURI) {
        this.imageURI = imageURI;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }



   /* protected CategoryItems(Parcel in) {
        imageURI = in.readInt();
        itemDescription = in.readString();
        itemTitle = in.readString();
        itemPrice = in.readString();
        category = (String) in.readString();

    }
*/
  /*  @Override
    public int describeContents() {
        return 0;
    }*/

  /*  @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageURI);
        dest.writeString(itemDescription);
        dest.writeString(itemTitle);
        dest.writeString(itemPrice);
        dest.writeValue(category);
    }*/

   /* @SuppressWarnings("unused")
    public static final Parcelable.Creator<CategoryItems> CREATOR = new Parcelable.Creator<CategoryItems>() {
        @Override
        public CategoryItems createFromParcel(Parcel in) {
            return new CategoryItems(in);
        }*/

     /*   @Override
        public CategoryItems[] newArray(int size) {
            return new CategoryItems[size];
        }
    };*/
}
