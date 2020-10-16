package com.grpc.demo.server.service;

import com.grpc.demo.common.BookOuterClass.*;
import com.grpc.demo.common.BookServicesGrpc.BookServicesImplBase;
import com.grpc.demo.server.util.DataRecords;
import io.grpc.stub.StreamObserver;

public class BookService extends BookServicesImplBase {

    public void bookById(BookId bookId, StreamObserver<Book> responseObserver) {

        Book book = DataRecords.bookData
                .stream()
                .filter(e -> e.getId().equals(bookId))
                .findFirst()
                .orElse(null);
        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }
}