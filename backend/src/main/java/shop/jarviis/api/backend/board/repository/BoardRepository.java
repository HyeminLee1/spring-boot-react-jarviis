package shop.jarviis.api.backend.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.jarviis.api.backend.board.domain.Article;

@Repository
public interface BoardRepository extends JpaRepository<Article, Long> {
}
