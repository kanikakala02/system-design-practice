package BehaviouralDesignPattern.TemplateMethodPattern;

public class CSVParser extends DataParser{
    @Override
    public void parse() {
        System.out.println("Parsing CSV file...");
    }
}
