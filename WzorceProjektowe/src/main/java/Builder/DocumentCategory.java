package Builder;

public class DocumentCategory {
    private final String name;

    private DocumentCategory(String name) {
        this.name = name;
    }

    public static DocumentCategory of(String name){
        return new DocumentCategory(name);
    }
    public String toString(){
        return "DocumentCategory (name=" + this.name +")";
    }
}
