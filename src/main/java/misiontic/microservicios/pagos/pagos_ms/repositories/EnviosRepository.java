package misiontic.microservicios.pagos.pagos_ms.repositories;

import misiontic.microservicios.pagos.pagos_ms.models.Envios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EnviosRepository extends JpaRepository<Envios, Long> {

    Optional<Envios> findByCompraId(Long compraId);
    Optional<List<Envios>> findByEmail(String email);
}
