package gradle.mrbluesky.mrblueskygradlespringboot.service;

import gradle.mrbluesky.mrblueskygradlespringboot.persistence.CardRepository;
import gradle.mrbluesky.mrblueskygradlespringboot.persistence.MemberRepository;
import gradle.mrbluesky.mrblueskygradlespringboot.vo.Card;
import gradle.mrbluesky.mrblueskygradlespringboot.vo.Member;
import java.sql.Date;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class MrBlueSkyTestService {

  @Autowired
  MemberRepository memberRepository;
  @Autowired
  CardRepository cardRepository;

  public void testInsert() {
    Member member1 = memberRepository.findOne("1207151001");
    System.out.println(member1);
    Member member2 = memberRepository.findOne("1207151000");
    System.out.println(member2);

    Card card1 = new Card("1597486522547893", "A", "G124", "admin",
                  Date.valueOf(LocalDate.now()), "admin", Date.valueOf(LocalDate.now()), member1);
    cardRepository.save(card1);
    Card card2 = new Card("2596547522502453", "A", "H124", "admin",
                  Date.valueOf(LocalDate.now()), "admin", Date.valueOf(LocalDate.now()), member1);
    cardRepository.save(card2);
  }

}
