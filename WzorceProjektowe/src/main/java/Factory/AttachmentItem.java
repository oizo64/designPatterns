package Factory;

public class AttachmentItem extends Item {
    @Override
    void fillTemplates() {
        templates.put("name", "");
        templates.put("extension", "");
        templates.put("fullName", String.format("%s - %c" , "<>", 'c'));
    }
}
