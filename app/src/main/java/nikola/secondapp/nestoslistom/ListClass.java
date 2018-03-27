package nikola.secondapp.nestoslistom;

import android.graphics.drawable.Drawable;

/**
 * Created by student on 27.3.2018.
 */

public class ListClass {

    String name;
    Drawable picture;

    public ListClass(String name, Drawable picture) {
        this.name = name;
        this.picture = picture;
    }

    String getName (){
        return this.name;
    }

    void setName (String name){
        this.name = name;
    }

    Drawable getPicture(){
        return this.picture;
    }

    void setPicture (Drawable picture){
        this.picture = picture;
    }

}
