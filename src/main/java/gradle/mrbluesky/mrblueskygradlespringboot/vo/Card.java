package gradle.mrbluesky.mrblueskygradlespringboot.vo;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CRD_MASTER_MST")
public class Card {

  /*@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;*/

  @Id
  @Column(name = "crd_no")
  private String cardNo;

  @Column(name = "crd_sts")
  private String cardStatus;

  @Column(name = "crd_cd")
  private String crdCode;

  @Column(name = "register")
  private String register;

  @Column(name = "reg_dt")
  private Date regDayTime;

  @Column(name = "updater")
  private String updater;

  @Column(name = "upd_dt")
  private Date updtDayTime;

  @ManyToOne                        // 이 놈이 없으면 관계 정의가 아예 되지 않음
  @JoinColumn(name = "mbr_id")      // 이 놈이 없으면 어떤 컬럼에 관계 정의를 해야할지 모름
  private Member member;

  /*public Long getId() {
    return id;
  }*/

  /*public void setId(Long id) {
    this.id = id;
  }*/

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public Member getMember() {
    return member;
  }

  public void setMember(String mbrId) {
    this.member = member;
  }

  public String getCardStatus() {
    return cardStatus;
  }

  public void setCardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
  }

  public String getCrdCode() {
    return crdCode;
  }

  public void setCrdCode(String crdCode) {
    this.crdCode = crdCode;
  }

  public Date getRegDayTime() {
    return regDayTime;
  }

  public void setRegDayTime(Date regDayTime) {
    this.regDayTime = regDayTime;
  }

  public String getRegister() {
    return register;
  }

  public void setRegister(String register) {
    this.register = register;
  }

  public Date getUpdtDayTime() {
    return updtDayTime;
  }

  public void setUpdtDayTime(Date updtDayTime) {
    this.updtDayTime = updtDayTime;
  }

  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Card card = (Card) o;

    /*if (!id.equals(card.id)) {
      return false;
    }*/
    if (!cardNo.equals(card.cardNo)) {
      return false;
    }
    if (!cardStatus.equals(card.cardStatus)) {
      return false;
    }
    if (!crdCode.equals(card.crdCode)) {
      return false;
    }
    if (!regDayTime.equals(card.regDayTime)) {
      return false;
    }
    if (!register.equals(card.register)) {
      return false;
    }
    if (!updtDayTime.equals(card.updtDayTime)) {
      return false;
    }
    return updater.equals(card.updater);

  }

}
