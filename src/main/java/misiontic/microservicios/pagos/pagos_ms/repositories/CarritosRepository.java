package misiontic.microservicios.pagos.pagos_ms.repositories;

import misiontic.microservicios.pagos.pagos_ms.models.Carritos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritosRepository extends JpaRepository<Carritos, String> {
}
