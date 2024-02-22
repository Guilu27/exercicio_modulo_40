package com.example.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    @SequenceGenerator(name = "produto_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "CODIGO", nullable = false, length = 50, unique = true)
    private String codigo;

    @Column(name = "VALOR", nullable = false)
    private BigDecimal valor;
}
