import java.util.ArrayList;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;
    private Borrower borrower;

    public Library(){
        this.collection = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int getCapacity() {
        return capacity;
    }

    public int booksCount(){
       return this.collection.size();
    }
    public void addBook(Book book){
        if(this.booksCount() < this.getCapacity()) {
            this.collection.add(book);
        }
    }
    public Book removeBook(){
        return this.collection.remove(0);
    }
}
