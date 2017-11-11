package Extractor;

public class SeleniumDataExtractor implements PageDataExtractor {

    public ExtractedDataSet extract(AbstractPage page) {

        page.extract();
        return new ExtractedDataSet();
    }

}
