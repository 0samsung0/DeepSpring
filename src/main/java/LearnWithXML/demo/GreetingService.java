package LearnWithXML.demo;

public class GreetingService {
    public void init() { System.out.println("GreetingService init"); }
    public String greet() { return "Hello!"; }
    public void cleanup() { System.out.println("GreetingService destroy"); }
}
