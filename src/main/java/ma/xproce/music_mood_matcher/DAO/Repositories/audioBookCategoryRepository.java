package ma.xproce.music_mood_matcher.DAO.Repositories;

import ma.xproce.music_mood_matcher.DAO.Entities.songCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface audioBookCategoryRepository extends JpaRepository<songCategory,Integer> {
}
