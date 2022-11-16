package via.sep3.grpcclient.implementation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import via.sep3.grpcclient.client.AuthClient;
import via.sep3.protobuf.auth.AuthGrpc;
import via.sep3.protobuf.auth.RegisterUserInput;
import via.sep3.protobuf.auth.RegisterUserOutput;

public class AuthClientImpl implements AuthClient {
    private ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 5266)
            .usePlaintext()
            .build();

    private AuthGrpc.AuthBlockingStub authBlockingStub = AuthGrpc.newBlockingStub(managedChannel);

    @Override
    public boolean register() {
        RegisterUserInput input = RegisterUserInput.newBuilder().build();
        RegisterUserOutput response = authBlockingStub.register(input);

        return response.getIsRegistered();
    }
}
