
public class ReplaceTester {
	private String string;

    
    public ReplaceTester(String str)
    {
        this.string = str;
    }

    public static void main(String[] args)
    {
        String str = "Mississippi";
        ReplaceTester replace = new ReplaceTester(str);

        replace.replace("i", "!");
        replace.replace("s", "$");
        
        System.out.println("Given :" + "Mississippi");
        System.out.println("Actual: " + replace.getString());
        System.out.println("Expected: " + "M!$$!$$!pp!");
    }

    
    public void replace(String toReplace, String replaceWith)
    {
        string = string.replace(toReplace, replaceWith);
    }

    
    public String getString()
    {
        return this.string;
    }
    
}
