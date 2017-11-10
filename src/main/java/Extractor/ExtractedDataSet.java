package Extractor;

import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;

public class ExtractedDataSet {

    private ArrayList<SelenideElement> list;

    public ExtractedDataSet() {
        this.list = new ArrayList<SelenideElement>();
    }

    public ArrayList<SelenideElement> getList() {
        return list;
    }

    public void add(SelenideElement element){
        list.add(element);
    }





}
