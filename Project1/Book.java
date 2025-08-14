package QTechSolutionsProjects.Project1;

public class Book {
    private int Id;
    private String title;
    private String Author;
    private double price;
    private String category;
    public Book(int id, String title, String author, String category,double price) {
        Id = id;
        this.title = title;
        Author = author;
        this.price = price;
        this.category = category;
    }
    

    @Override
    public String toString(){
        return Id + " | "+ title + " | "+ Author+ " | "+ category +" | "+ "$"+price; 
    }

}
