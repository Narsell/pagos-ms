package misiontic.microservicios.pagos.pagos_ms.repositories;

import misiontic.microservicios.pagos.pagos_ms.models.Envios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnviosRepository extends JpaRepository<Envios, Long> {
}
