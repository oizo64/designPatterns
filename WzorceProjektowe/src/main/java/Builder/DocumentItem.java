package Builder;

import java.util.List;
import java.util.stream.Collectors;

public class DocumentItem {
    private final String title;
    private final DocumentCategory category;
    private final List<String> signatures;



    public DocumentItem(String title, DocumentCategory category, List<String> signatures) {
        this.title = title;
        this.category = category;
        this.signatures = signatures;
    }
    //To pozwala zacząć tworzyć obiekt metodą Builder!!
    public static DocumentItemBuilder builder(){
        return new DocumentItemBuilder();
    }
    public String toString() {
        return "DocumentItem(title=" + this.title + ", \ncategory=" + this.category
                + ", \nsignatures=" + this.signatures.stream()
                .map(String::toString)
                .collect(Collectors.joining(",")) + ")";
    }
}
