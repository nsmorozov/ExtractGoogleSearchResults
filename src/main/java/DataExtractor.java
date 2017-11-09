import Extractor.ExtractedDataSet;
import Extractor.PageDataExtractor;

public class DataExtractor {

    private PageDataExtractor extractor;

    public DataExtractor(PageDataExtractor extractor) {
        this.extractor = extractor;
    }

    ExtractedDataSet extract(){

        ExtractedDataSet dataSet = null;

        try {
            dataSet = extractor.extract();
        }catch(Exception ex){
            System.out.println("Cannot extract data as extractor might not be initialized");
        }
        return dataSet;
    }
}
