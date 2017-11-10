package io.atlas.medicartcore.Repositories;

import io.atlas.medicartcore.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findAllByName(String name);
}
