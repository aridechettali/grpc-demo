package com.grpc.demo.client;


import com.grpc.demo.common.BookOuterClass.*;
import com.grpc.demo.common.BookServicesGrpc.*;
import com.grpc.demo.common.BookServicesGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;


public class BookServiceClient {

    private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();
    private BookServicesBlockingStub bookServicesBlockingStub = BookServicesGrpc.newBlockingStub(channel);

    public Book getBookById(int bookId) {
        BookId id = BookId.newBuilder().setId(1234).build();
        return bookServicesBlockingStub.bookById(id);
    }

   public Iterator<Book> findAllBooks() {
       BookId id = BookId.newBuilder().setId(1234).build();
       return bookServicesBlockingStub.findAllBooks(id);
   }
}