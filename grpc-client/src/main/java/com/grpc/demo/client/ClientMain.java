package com.grpc.demo.client;

import com.grpc.demo.common.AuthorOuterClass.Author;
import com.grpc.demo.common.BookOuterClass.Book;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientMain {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();

        BookServiceClient bookServiceClient = new BookServiceClient(channel);
        Book book = bookServiceClient.getBookById(101);
        System.out.println(book);

        AuthorServiceClient authorServiceClient = new AuthorServiceClient(channel);
        Author author = authorServiceClient.getAuthorById(999);
        System.out.println(author);

    }
}