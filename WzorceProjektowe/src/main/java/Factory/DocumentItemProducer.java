package Factory;

public class DocumentItemProducer implements ItemFactory{

    @Override
    public Item createItem() {
        DocumentItem documentItem = new DocumentItem();
        documentItem.fillTemplates();
        return documentItem;
    }
}
