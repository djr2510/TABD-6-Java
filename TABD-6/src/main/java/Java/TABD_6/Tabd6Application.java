package Java.TABD_6;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
@SpringBootApplication
public class Tabd6Application {

	public static void main(String[] args) {
		SpringApplication.run(Tabd6Application.class, args);


	}

}
