package tr.com.merciyes.persistance.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.merciyes.persistance.entity.EventEntity;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {

    boolean existsByEventTitle(String eventTitle);

    EventEntity findByResourceId(Long id);

    void deleteByResourceId(Long id);

    Boolean existsByResourceId(Long id);

}
