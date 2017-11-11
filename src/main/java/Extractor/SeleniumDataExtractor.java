package Extractor;

public class SeleniumDataExtractor implements PageDataExtractor {

    public ExtractedDataSet extract(AbstractPage page) {

        return page.extract();

    }

}
