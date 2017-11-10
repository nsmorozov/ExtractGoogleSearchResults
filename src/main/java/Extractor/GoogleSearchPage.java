package Extractor;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchPage implements AbstractPage {

    private String url;
    public static final String searchItem = "div.srg div.g ._Rm";


    public GoogleSearchPage(String url) {
        this.url = url;
    }


    public ExtractedDataSet extract(PageElements elements){

        open(url);
        ExtractedDataSet dataSet = new ExtractedDataSet();
        ElementsCollection links = $$(searchItem);
        links.shouldHave(CollectionCondition.sizeGreaterThan(0));
        for(SelenideElement link: links){
            dataSet.add(link);
        }

        return dataSet;
    }

}
