import Builder.DocumentCategory;
import Builder.DocumentItem;
import Facade.DeliveryBoxFacade;
import Factory.AttachmentItemProducer;
import Factory.DocumentItemProducer;
import Factory.Item;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        //Builder method
        DocumentItem documentItem = DocumentItem
                .builder()
                .title("Szybcy i wsciekli")
                .category(DocumentCategory.of("kryminal"))
                .signatures(Arrays.asList("Jan", "Kowalski"))
                .build();
        System.out.println(documentItem);

        //Factory method
        DocumentItemProducer documentItemProducer = new DocumentItemProducer();
        Item document = documentItemProducer.createItem();

        AttachmentItemProducer attachmentItemProducer = new AttachmentItemProducer();
        Item attachment = attachmentItemProducer.createItem();
        documentTemplate(document);
        documentUseCase(document);


        //Facade method
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();


    }
    private static void documentTemplate(Item document) {

        System.out.println(String.format("%s: %s", "Document title",
                document.getTemplates().get("title")));
        System.out.println(String.format("%s: %s", "Who created",
                document.getTemplates().get("whoCreated")));
        System.out.println(String.format("%s: %s", "When document was created",
                document.getTemplates().get("whenCreated")));
        System.out.println("\n");
    }

    private static void documentUseCase(Item document) {

        document.putTemplateValue("title", "Kontrakt b2b");
        document.putTemplateValue("whoCreated", "Jan Kowalski");
        document.putTemplateValue("whenCreated",
                DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm").format(LocalDateTime.now()));

        System.out.println(String.format("%s: %s", "Document title",
                document.getTemplates().get("title")));
        System.out.println(String.format("%s: %s", "Who created",
                document.getTemplates().get("whoCreated")));
        System.out.println(String.format("%s: %s", "When document was created",
                document.getTemplates().get("whenCreated")));
    }
}
