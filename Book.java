package lab51;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author , double price , int qty){
        this.name = name;
        this.author = author;
        this. price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return "'" + name + "by"+ author;
    }

    public static void main(String[] args) {
        Author codeLean = new Author("Code Learn","codeleanvn@gmail.com",'m');
        System.out.println(codeLean);

        Book dummyBook = new Book("Java for dummy",codeLean,19.95,99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is "+dummyBook.getName());
        System.out.println("price is "+dummyBook.getPrice());
        System.out.println("qty is "+dummyBook.getQty());
        System.out.println("Author's name is "+dummyBook.getAuthor().getName());
        System.out.println("Author's email is "+ dummyBook.getAuthor().getEmail());

//        Book anotherBook = new Book("more Java", new Author("Dang Kim Thi","dangkimthi@gmail,com",'f'),29.95);
//        System.out.println(anotherBook);

    }
}
