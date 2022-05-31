package Factory;

public class DocumentItem extends Item {
    @Override
    public void fillTemplates() {
        templates.put("title", "<>");
        templates.put("Content", "<>");
    }
}
