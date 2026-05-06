package BehaviouralDesignPattern.TemplateMethodPattern;

abstract class DataParser {

    public void parser(){
        openFile();
        parse();
        closeFile();
    }

    public void openFile(){
        System.out.println("Opening file...");
    }

    public void closeFile(){
        System.out.println("Closing file...");
    }

    abstract void parse();
}
