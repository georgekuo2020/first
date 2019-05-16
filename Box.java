public class Box {
    Box next;
    private String key;
    private String value;

    Box(String inputkey,String inputval){
        key=inputkey;
        value=inputval;
    }
    public String getKey(){
        return key;
    }
    public String getValue(){
        return value;
    }
}
