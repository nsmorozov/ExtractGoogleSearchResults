
import Extractor.ExtractedDataSet;
import Extractor.GoogleSearchPage;
import Extractor.SeleniumDataExtractor;

import static com.codeborne.selenide.Selenide.open;

public class UrlExtractionTest {


    public static void main(String[] s){

        System.setProperty("webdriver.chrome.driver", "/Users/nmorozov/IdeaProjects/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage("selenium");
        ExtractedDataSet dataSet = new DataExtractor(new SeleniumDataExtractor()).extractFrom(googleSearchPage);

        //System.out.println();
    }


}
