import Extractor.ExtractedDataSet;
import Extractor.GoogleSearchPage;
import Extractor.SeleniumDataExtractor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class ExtractorTest {

    @Test
    public void extractorShouldReturnNonEmptyDataSet(){

        ExtractedDataSet dataSetTest = new ExtractedDataSet();
        dataSetTest.add($("Fake"));
        GoogleSearchPage googleSearchPage =  Mockito.mock(GoogleSearchPage.class);
        SeleniumDataExtractor seleniumDataExtractor = new SeleniumDataExtractor();
        DataExtractor dataExtractor = new DataExtractor(seleniumDataExtractor);
        Mockito.when(dataExtractor.extractFrom(googleSearchPage)).thenReturn(dataSetTest);
        System.out.println(dataExtractor.extractFrom(googleSearchPage).getList().size());

        assertThat(dataExtractor.extractFrom(googleSearchPage).getList().size(), is(greaterThan(0)));
    }


}
