package misiontic.microservicios.pagos.pagos_ms.repositories;

import misiontic.microservicios.pagos.pagos_ms.models.Carritos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CarritosRepository extends JpaRepository<Carritos, Long> {

    Optional<List<Carritos>> findByCompraId(Long compraId);

}
