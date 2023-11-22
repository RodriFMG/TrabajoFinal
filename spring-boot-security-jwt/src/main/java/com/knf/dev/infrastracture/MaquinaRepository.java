package com.knf.dev.infrastracture;
import com.knf.dev.domain.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaquinaRepository extends JpaRepository<Maquina,Long> {
}
