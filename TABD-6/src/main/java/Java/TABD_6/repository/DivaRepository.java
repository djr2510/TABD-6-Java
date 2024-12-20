package Java.TABD_6.repository;

import Java.TABD_6.model.DivaModel;
import org.springframework.data.cassandra.repository.CassandraRepository;
import java.util.UUID;

public interface DivaRepository extends CassandraRepository<DivaModel, UUID> {
}