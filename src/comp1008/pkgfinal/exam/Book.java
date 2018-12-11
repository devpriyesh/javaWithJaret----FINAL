/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1008.pkgfinal.exam;

/**
 *
 * @author Priyesh Hingrajia == 200397594
 */
public class Book {
    private String bookName ;
    private Author author;
    private double price ;
    private int quantityInStock ;

    
/**
 * constructor
 * @param bookName
 * @param author
 * @param price
 * @param quantityInStock 
 */
    public Book(String bookName, Author author, double price, int quantityInStock) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if(!bookName.isEmpty())
            this.bookName = bookName;
        else
            throw new IllegalArgumentException("Book title can not be empty !");
    }


    public double getPrice() {
             return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
                this.price = price;
        else 
            throw new IllegalArgumentException("the price must contains numbers only !!");
        
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0)
            this.quantityInStock = quantityInStock;
        else 
            throw new IllegalArgumentException("the quantity must be a whole number !!");
    }
    
    public String toString() {
        return String.format("%s by %s costs $%.2fd" , bookName , author , price) ;
    }
}
