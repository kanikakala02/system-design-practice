package BehaviouralDesignPattern.TemplateMethodPattern;

public class TemplateMethodMain {
    public static void main(String[] args) {
        DataParser csvParser= new CSVParser();
        DataParser jsonParser= new JSONParser();
        csvParser.parser();
        jsonParser.parser();
    }
}
