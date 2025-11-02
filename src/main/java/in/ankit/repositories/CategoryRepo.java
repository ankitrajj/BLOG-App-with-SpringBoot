package in.ankit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
