package via.sep3.controller.utils.jwt;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ChannelUtils {
    // Static instance of the ChannelUtils class
    private static ManagedChannel instance;

    // Private constructor to prevent external instantiation
    private ChannelUtils() {}

    // Static method to retrieve the Singleton instance
    public static ManagedChannel getInstance() {
        // If the instance has not been created yet, create it
        if (instance == null) {
            instance = ManagedChannelBuilder
                    .forAddress("localhost", 5266)
                    .usePlaintext()
                    .build();
        }

        // Return the existing instance
        return instance;
    }
}
