package misiontic.microservicios.pagos.pagos_ms.controllers;
import misiontic.microservicios.pagos.pagos_ms.models.*;
import misiontic.microservicios.pagos.pagos_ms.repositories.CarritosRepository;
import misiontic.microservicios.pagos.pagos_ms.repositories.ComprasRepository;
import misiontic.microservicios.pagos.pagos_ms.repositories.EnviosRepository;
import misiontic.microservicios.pagos.pagos_ms.repositories.FacturacionesRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
public class ComprasController {

    private final ComprasRepository comprasRepository;
    private final EnviosRepository enviosRepository;
    private final FacturacionesRepository facturacionesRepository;
    private final CarritosRepository carritosRepository;

    public ComprasController(ComprasRepository comprasRepository, FacturacionesRepository facturacionesRepository, EnviosRepository enviosRepository, CarritosRepository carritosRepository) {
        this.comprasRepository = comprasRepository;
        this.enviosRepository = enviosRepository;
        this.facturacionesRepository = facturacionesRepository;
        this.carritosRepository = carritosRepository;
    }

    @PostMapping("/purchase")
    CompraDatos newCompra(@RequestBody CompraDatos compraDatos){

        Compras compra = new Compras(new Date(), "Registrado");
        compra = comprasRepository.save(compra);

        Facturaciones facturacion = compraDatos.getInformacionFacturacion();
        facturacion.setCompraId(compra.getId());
        facturacion = facturacionesRepository.save(facturacion);

        Envios envio = compraDatos.getInformacionEnvio();
        envio.setCompraId(compra.getId());
        envio = enviosRepository.save(envio);

        List<Carritos> carritos = compraDatos.getInformacionCarrito();

        for (Carritos carrito:carritos) {
            carrito.setCompraId(compra.getId());
            carritosRepository.save(carrito);
        }

        return new CompraDatos(
                envio,
                facturacion,
                carritos
        );

    }

}
