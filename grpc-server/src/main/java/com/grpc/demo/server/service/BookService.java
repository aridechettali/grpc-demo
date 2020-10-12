package com.grpc.demo.server.service;


import com.grpc.demo.common.BookOuterClass.*;
import com.grpc.demo.common.BookServicesGrpc.BookServicesImplBase;
import io.grpc.stub.StreamObserver;

public class BookService extends BookServicesImplBase {

    public void bookById(BookId bookId, StreamObserver<Book> responseObserver) {
        BookId id = BookId.newBuilder().setId(1234).build();
        Book book = Book.newBuilder().setId(id).setName("abcd").setPageCount(100).build();
        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }

    public void findAllBooks(BookId request, StreamObserver<Book> responseObserver) {
        BookId id = BookId.newBuilder().setId(1234).build();
        Book book = Book.newBuilder().setId(id).setName("abcd").setPageCount(100).build();
        responseObserver.onNext(book);
        responseObserver.onNext(book);
        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }
}