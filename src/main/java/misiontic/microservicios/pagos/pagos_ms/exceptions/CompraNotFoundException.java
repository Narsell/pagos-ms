package misiontic.microservicios.pagos.pagos_ms.exceptions;

public class CompraNotFoundException extends RuntimeException {
    public CompraNotFoundException(String message) {
        super(message);
    }
}
