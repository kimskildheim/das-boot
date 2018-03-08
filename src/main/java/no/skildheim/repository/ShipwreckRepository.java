package no.skildheim.repository;

import no.skildheim.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
    
}
