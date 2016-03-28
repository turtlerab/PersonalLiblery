
 
public class Book {
    private String name;
    private String author;
    private String iconName;
    private String path;
    public Book(String name, String author, String iconName ,String path) {
        super();
        this.name = name;
        this.author = author;
        this.iconName = iconName;
        this.path = path;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public String getIconName() {
        return iconName;
    }
 
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public String path() {
        return path;
    }
 
    public void setpath(String path) {
        this.path = path;
    }
    public String toString() {
    return name ;
}
}