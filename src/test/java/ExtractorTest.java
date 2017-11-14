import Extractor.ExtractedDataSet;
import Extractor.GoogleSearchPage;
import Extractor.SeleniumDataExtractor;
import com.codeborne.selenide.SelenideElement;
import org.hamcrest.Matcher;
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
        SeleniumDataExtractor seleniumDataExtractor = Mockito.mock(SeleniumDataExtractor.class);
        DataExtractor dataExtractor = Mockito.mock(DataExtractor.class);
        Mockito.when(dataExtractor.extractFrom(googleSearchPage)).thenReturn(dataSetTest);
        System.out.println(dataExtractor.extractFrom(googleSearchPage).getList().size());

        assertThat(dataExtractor.extractFrom(googleSearchPage).getList().size(), is(greaterThan(0)));
    }


}
