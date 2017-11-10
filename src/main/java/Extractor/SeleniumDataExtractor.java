package Extractor;

public class SeleniumDataExtractor implements PageDataExtractor {

    public ExtractedDataSet extract(AbstractPage page, PageElements elements) {

        page.extract(elements);
        return new ExtractedDataSet();
    }

}
