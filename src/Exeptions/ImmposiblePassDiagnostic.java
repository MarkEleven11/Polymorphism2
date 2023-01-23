package Exeptions;

import Transports.Transport;

public class ImmposiblePassDiagnostic extends Exception {

    private Transport transport;


    public ImmposiblePassDiagnostic(String message, Transport transport) {
        super(message);
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
}
