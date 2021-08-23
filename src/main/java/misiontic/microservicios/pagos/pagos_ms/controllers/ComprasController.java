package misiontic.microservicios.pagos.pagos_ms.controllers;
import misiontic.microservicios.pagos.pagos_ms.exceptions.CompraNotFoundException;
import misiontic.microservicios.pagos.pagos_ms.models.*;
import misiontic.microservicios.pagos.pagos_ms.models.entradas.CompraDatosIn;
import misiontic.microservicios.pagos.pagos_ms.models.salidas.CompraDatosOut;
import misiontic.microservicios.pagos.pagos_ms.repositories.CarritosRepository;
import misiontic.microservicios.pagos.pagos_ms.repositories.ComprasRepository;
import misiontic.microservicios.pagos.pagos_ms.repositories.EnviosRepository;
import misiontic.microservicios.pagos.pagos_ms.repositories.FacturacionesRepository;
import org.springframework.web.bind.annotation.*;

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
    CompraDatosIn newCompra(@RequestBody CompraDatosIn compraDatosIn){

        Compras compra = new Compras(new Date(), "Registrado");
        compra = comprasRepository.save(compra);

        Facturaciones facturacion = compraDatosIn.getInformacionFacturacion();
        facturacion.setCompraId(compra.getId());
        facturacion = facturacionesRepository.save(facturacion);

        Envios envio = compraDatosIn.getInformacionEnvio();
        envio.setCompraId(compra.getId());
        envio = enviosRepository.save(envio);

        List<Carritos> carritos = compraDatosIn.getInformacionCarrito();

        for (Carritos carrito:carritos) {
            carrito.setCompraId(compra.getId());
            carritosRepository.save(carrito);
        }

        return new CompraDatosIn(
                envio,
                facturacion,
                carritos
        );

    }

    @GetMapping("/purchase/{compraId}")
    CompraDatosOut listCompras(@PathVariable Long compraId){

         Envios infoEnvio = enviosRepository.findByCompraId(compraId)
                 .orElse(null);
         Facturaciones infoFacturacion = facturacionesRepository.findByCompraId(compraId)
                 .orElse(null);
         List<Carritos> infoCarrito = carritosRepository.findByCompraId(compraId)
                 .orElse(null);
         Compras infoCompra = (Compras) comprasRepository.findById(compraId)
                 .orElse(null);

         if (infoCompra == null || infoEnvio == null || infoCarrito == null || infoFacturacion == null)
             throw new CompraNotFoundException("No se encontró una compra con el ID " + compraId);

        CompraDatosOut compraDatosOut = new CompraDatosOut(
                infoEnvio,
                infoFacturacion,
                infoCarrito,
                infoCompra
        );

        return compraDatosOut;
    }

}
