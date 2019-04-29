package gradle.mrbluesky.mrblueskygradlespringboot.persistence;

import gradle.mrbluesky.mrblueskygradlespringboot.vo.Card;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {

}
