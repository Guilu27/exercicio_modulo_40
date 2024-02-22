package com.example.repository;

import com.example.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, String> {
}
