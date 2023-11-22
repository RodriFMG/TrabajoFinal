package com.knf.dev.infrastracture;
import com.knf.dev.domain.Snack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnackRepository extends JpaRepository<Snack,Long> {

}
