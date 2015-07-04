package basic;

import java.io.Serializable;

public class Userbean implements Serializable{

 

    private static final long serialVersionUID = 4256272866128337548L;
 

    public String favoriteCar1;
    public String favoriteCar2;

    public String favoriteCar3;

     

   public String getFavoriteCar1() {

        return favoriteCar1;

    }

    public void setFavoriteCar1(String favoriteCar1) {

        this.favoriteCar1 = favoriteCar1;

    }

    public String getFavoriteCar2() {

        return favoriteCar2;
    }

    public void setFavoriteCar2(String favoriteCar2) {

        this.favoriteCar2 = favoriteCar2;

    }
    public String getFavoriteCar3() {

        return favoriteCar3;
    }

    public void setFavoriteCar3(String favoriteCar3) {

        this.favoriteCar3 = favoriteCar3;

    }
}
     

     
