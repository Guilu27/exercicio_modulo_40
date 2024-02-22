package com.example.exercicioModulo40;

import com.example.domain.Produto;
import com.example.repository.IProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "com.example.repository")
@EntityScan("com.example.*")
@ComponentScan(basePackages = "com.example")
public class ExercicioModulo40Application implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(ExercicioModulo40Application.class);

    @Autowired
    private IProdutoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ExercicioModulo40Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("StartApplication...");
        Produto produto = createProduto();
        repository.save(produto);
    }

    private Produto createProduto() {
        return Produto.builder().nome("Produto 1").codigo("A1").valor(BigDecimal.TEN).build();
    }

}
