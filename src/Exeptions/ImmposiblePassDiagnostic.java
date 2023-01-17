package Exeptions;

import Transports.Transport;

public class ImmposiblePassDiagnostic extends Exception {

    private Transport<T> transport;


    public ImmposiblePassDiagnostic(String message, Transport<T> transport) {
        super(message);
        this.transport = transport;
    }

    public Transport<T> getTransport() {
        return transport;
    }
}
