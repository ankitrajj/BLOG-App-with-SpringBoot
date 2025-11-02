package in.ankit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment	, Integer> {

}
