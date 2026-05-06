package BehaviouralDesignPattern.TemplateMethodPattern;

public class JSONParser extends DataParser{
    @Override
    public void parse() {
        System.out.println("Parsing JSON file...");
    }
}
