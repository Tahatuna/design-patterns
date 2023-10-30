package prototype;

public class Main {
    public static void main(String... args) {


        EntityService entityService = new EntityService();

        Document document1 = entityService.findDocumentById(1L);

        Document document2 = entityService.findDocumentById(2L);

        System.out.println(document1);
        System.out.println(document2);

        Document documentClone;
        try {
            documentClone = document1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        documentClone.setName("clone letter");
        documentClone.setText("clone text");
        documentClone.getDocumentType().setName("clone type");

        System.out.println(document1);

        System.out.println(documentClone);

    }
}
