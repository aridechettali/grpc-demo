package com.grpc.demo.server.util;

import com.grpc.demo.common.AuthorOuterClass;
import com.grpc.demo.common.AuthorOuterClass.Author;
import com.grpc.demo.common.BookOuterClass;
import com.grpc.demo.common.BookOuterClass.Book;

import java.util.ArrayList;import java.util.List;


public class DataRecords {

    public static List<Book> bookData = new ArrayList<>();
    public static List<Author> authorData  = new ArrayList<>();


    static  {

        Author author1 =  Author.newBuilder().setId(AuthorOuterClass.AuthorId.newBuilder().setId(997).build()).setFirstName("Joanne").setLastName("Rowling").build();
        Book book1 = Book.newBuilder().setId(BookOuterClass.BookId.newBuilder().setId(101).build()).setName("Harry Potter and the Philosopher's Stone").setAuthor(author1).setPageCount(223).build();

        Author author2 =  Author.newBuilder().setId(AuthorOuterClass.AuthorId.newBuilder().setId(998).build()).setFirstName("Herman").setLastName("Melville").build();
        Book book2 = Book.newBuilder().setId(BookOuterClass.BookId.newBuilder().setId(102).build()).setName("Moby Dick").setAuthor(author2).setPageCount(635).build();

        Author author3 =  Author.newBuilder().setId(AuthorOuterClass.AuthorId.newBuilder().setId(999).build()).setFirstName("Anne").setLastName("Rice").build();
        Book book3 = Book.newBuilder().setId(BookOuterClass.BookId.newBuilder().setId(103).build()).setName("Interview with the vampire").setAuthor(author3).setPageCount(371).build();

        bookData.add(book1);
        bookData.add(book2);
        bookData.add(book3);

        authorData.add(author1);
        authorData.add(author2);
        authorData.add(author3);

    }
}