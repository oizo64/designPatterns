package Builder;

import java.util.List;

public class DocumentItemBuilder {
    private String title;
    private DocumentCategory category;
    private List<String> signatures;

    public DocumentItemBuilder title(String title){
        this.title = title;
        return this;
    }

    public DocumentItemBuilder category(DocumentCategory category){
        this.category = category;
        return this;
    }
    public DocumentItemBuilder signatures(List<String> signatures){
        this.signatures = signatures;
        return this;
    }

    //Koniec budowania, zwróć obiekt.
    public DocumentItem build(){
        return new DocumentItem(title, category, signatures);
    }
}
