package misiontic.microservicios.pagos.pagos_ms.repositories;

import misiontic.microservicios.pagos.pagos_ms.models.Facturaciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturacionesRepository extends JpaRepository<Facturaciones, Long> {
}
