
import Extractor.ExtractedDataSet;
import Extractor.SeleniumDataExtractor;

import static com.codeborne.selenide.Selenide.open;

public class UrlExtractionTest {


    public static void main(String[] s){

        System.setProperty("webdriver.chrome.driver", "/Users/nmorozov/IdeaProjects/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        open("http://google.com");
        ExtractedDataSet dataSet = new DataExtractor(new SeleniumDataExtractor()).extract();

    }


}
