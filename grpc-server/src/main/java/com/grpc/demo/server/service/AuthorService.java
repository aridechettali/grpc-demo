package com.grpc.demo.server.service;

import com.grpc.demo.common.AuthorOuterClass;
import com.grpc.demo.common.AuthorServicesGrpc.AuthorServicesImplBase;
import com.grpc.demo.server.util.DataRecords;
import io.grpc.stub.StreamObserver;


public class AuthorService extends AuthorServicesImplBase {


    public void authorById(AuthorOuterClass.AuthorId authorId, StreamObserver<AuthorOuterClass.Author> responseObserver) {
        AuthorOuterClass.Author author = DataRecords.authorData
                .stream()
                .filter(e -> e.getId().equals(authorId))
                .findFirst()
                .orElse(null);
        responseObserver.onNext(author);
        responseObserver.onCompleted();
    }
}
