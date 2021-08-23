package misiontic.microservicios.pagos.pagos_ms.repositories;

import misiontic.microservicios.pagos.pagos_ms.models.Facturaciones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FacturacionesRepository extends JpaRepository<Facturaciones, Long> {

    Optional<Facturaciones> findByCompraId(Long compraId);

}
