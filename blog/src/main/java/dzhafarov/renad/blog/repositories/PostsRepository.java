package dzhafarov.renad.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import dzhafarov.renad.blog.models.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
