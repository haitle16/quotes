package quotes;

import com.google.gson.Gson;

public class RandomQuotes {
    String author;
    String likes;
    String text;
    String en;


    public RandomQuotes(String author, String en, String text){
        this.author = author;
        this.likes = en;
        this.text = text;

    }

    public String toString(){
            if(this.text == null) return this.en+ "\nBy: " + this.author;
            else{
                return this.text + "\nBy: " + this.author;
            }
    }

}
