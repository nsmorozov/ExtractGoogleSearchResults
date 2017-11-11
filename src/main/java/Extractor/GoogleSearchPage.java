package Extractor;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchPage implements AbstractPage {

    private static final String GOOGLE_HOME = "https://google.com";
    private static final String searchItem = "div.srg div.g ._Rm";
    private String searchTerm;

    public GoogleSearchPage(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public ExtractedDataSet extract(){

        open(GOOGLE_HOME + "/search?q=" + searchTerm);
        ExtractedDataSet dataSet = new ExtractedDataSet();
        ElementsCollection links = $$(searchItem);
        links.shouldHave(CollectionCondition.sizeGreaterThan(0));
        for(SelenideElement link: links){
            dataSet.add(link);
        }

        return dataSet;
    }

}
