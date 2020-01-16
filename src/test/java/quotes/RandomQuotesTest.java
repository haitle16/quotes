package quotes;

import com.google.gson.Gson;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import static org.junit.Assert.*;

public class RandomQuotesTest {

    @Test
    public void randomQuotesTest() throws FileNotFoundException {
        int index = (int) (Math.random() * 138);
        Gson gson = new Gson();
        RandomQuotes[] parseSourceQuotes = gson.fromJson(new FileReader("resources/recentquotes.json"), RandomQuotes[].class);
        RandomQuotes randquote = new RandomQuotes(parseSourceQuotes[index].author, parseSourceQuotes[index].likes ,parseSourceQuotes[index].text);
        assertEquals(true, parseSourceQuotes!=null);

    }
}
