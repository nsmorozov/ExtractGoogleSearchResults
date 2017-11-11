import Extractor.AbstractPage;
import Extractor.ExtractedDataSet;
import Extractor.PageDataExtractor;
import Extractor.PageElements;

public class DataExtractor {

    private PageDataExtractor extractor;

    public DataExtractor(PageDataExtractor extractor) {
        this.extractor = extractor;
    }

    ExtractedDataSet extractFrom(AbstractPage source){

        ExtractedDataSet dataSet = null;
        try {
            dataSet = extractor.extract(source);
        }catch(Exception ex){
            System.out.println("Cannot extractFrom data as extractor might not be initialized");
        }

        return dataSet;
    }
}
