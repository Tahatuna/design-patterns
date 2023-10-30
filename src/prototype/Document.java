package prototype;

public class Document implements Cloneable {

    private Long id;
    private String name;
    private DocumentType documentType;
    private Category category;
    private String text;

    public Document(Long id, String name, DocumentType documentType, Category category, String text) {
        this.id = id;
        this.name = name;
        this.documentType = documentType;
        this.category = category;
        this.text = text;
    }

    public Document() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /*
    // Shallow copy =>
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    // Deep copy =>
    @Override
    protected Document clone() throws CloneNotSupportedException {

        Document document = (Document) super.clone();
        DocumentType documentType = document.getDocumentType().clone();
        Category category = document.getCategory().clone();

        document.setDocumentType(documentType);
        document.setCategory(category);

        return document;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", documentType=" + documentType +
                ", category=" + category +
                ", text='" + text + '\'' +
                '}';
    }
}
