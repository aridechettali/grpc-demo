package com.grpc.demo.client;

import com.grpc.demo.common.AuthorOuterClass.*;
import com.grpc.demo.common.AuthorServicesGrpc.*;
import com.grpc.demo.common.AuthorServicesGrpc;
import io.grpc.ManagedChannel;

public class AuthorServiceClient {


    private AuthorServicesBlockingStub authorServicesBlockingStub;
    public AuthorServiceClient(ManagedChannel channel)
    {
        authorServicesBlockingStub = AuthorServicesGrpc.newBlockingStub(channel);
    }

    public Author getAuthorById(int authorId) {
        AuthorId id = AuthorId.newBuilder().setId(authorId).build();
        return authorServicesBlockingStub.authorById(id);
    }
}
