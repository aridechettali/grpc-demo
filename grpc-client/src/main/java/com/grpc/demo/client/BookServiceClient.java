package com.grpc.demo.client;


import com.grpc.demo.common.BookOuterClass.*;
import com.grpc.demo.common.BookServicesGrpc.*;
import com.grpc.demo.common.BookServicesGrpc;
import io.grpc.ManagedChannel;



public class BookServiceClient {

    private BookServicesBlockingStub bookServicesBlockingStub;

    public BookServiceClient(ManagedChannel channel)
    {
        bookServicesBlockingStub = BookServicesGrpc.newBlockingStub(channel);
    }

    public Book getBookById(int bookId) {
        BookId id = BookId.newBuilder().setId(bookId).build();
        return bookServicesBlockingStub.bookById(id);
    }

}