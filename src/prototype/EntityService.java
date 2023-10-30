package prototype;

public class EntityService {

    public DocumentType findDocumentTypeById(Long id) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "private";
        } else if (id.compareTo(2L) == 0) {
            name = "corporation";
        } else {
            name = "general";
        }

        documentType.setName(name);
        return documentType;
    }

    public Category findCategoryById(Long id) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "private";
        } else if (id.compareTo(2L) == 0) {
            name = "business";
        } else {
            name = "general";
        }

        category.setName(name);
        return category;
    }

    public Document findDocumentById(Long id) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Document document = new Document();

        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));

        String name;
        String text;
        if (id.compareTo(1L) == 0) {
            name = "letter";
            text = "lorem ipsum";
        } else if (id.compareTo(2L) == 0) {
            name = "report";
            text = "lorem ipsum";
        } else {
            name = "business rules";
            text = "lorem ipsum";
        }

        document.setName(name);
        document.setText(text);

        return document;
    }

}
