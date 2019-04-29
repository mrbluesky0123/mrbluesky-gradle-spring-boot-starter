package gradle.mrbluesky.mrblueskygradlespringboot.vo;

import java.sql.Date;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Merchant {

  private Long id;
  private String mchtNo;
  private String mchtName;
  private String bizNo;
  private String mchtFlag;
  private String creditStatus;
  private Date regDayTime;
  private String register;
  private Date updtDayTime;
  private String updater;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMchtNo() {
    return mchtNo;
  }

  public void setMchtNo(String mchtNo) {
    this.mchtNo = mchtNo;
  }

  public String getMchtName() {
    return mchtName;
  }

  public void setMchtName(String mchtName) {
    this.mchtName = mchtName;
  }

  public String getBizNo() {
    return bizNo;
  }

  public void setBizNo(String bizNo) {
    this.bizNo = bizNo;
  }

  public String getMchtFlag() {
    return mchtFlag;
  }

  public void setMchtFlag(String mchtFlag) {
    this.mchtFlag = mchtFlag;
  }

  public String getCreditStatus() {
    return creditStatus;
  }

  public void setCreditStatus(String creditStatus) {
    this.creditStatus = creditStatus;
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

    Merchant merchant = (Merchant) o;

    if (!id.equals(merchant.id)) {
      return false;
    }
    if (!mchtNo.equals(merchant.mchtNo)) {
      return false;
    }
    if (!mchtName.equals(merchant.mchtName)) {
      return false;
    }
    if (!bizNo.equals(merchant.bizNo)) {
      return false;
    }
    if (!mchtFlag.equals(merchant.mchtFlag)) {
      return false;
    }
    if (!creditStatus.equals(merchant.creditStatus)) {
      return false;
    }
    if (!regDayTime.equals(merchant.regDayTime)) {
      return false;
    }
    if (!register.equals(merchant.register)) {
      return false;
    }
    if (!updtDayTime.equals(merchant.updtDayTime)) {
      return false;
    }
    return updater.equals(merchant.updater);
  }

  @Override
  public int hashCode() {
    int result = mchtNo.hashCode();
    result = 31 * result + mchtName.hashCode();
    result = 31 * result + bizNo.hashCode();
    result = 31 * result + mchtFlag.hashCode();
    result = 31 * result + creditStatus.hashCode();
    result = 31 * result + regDayTime.hashCode();
    result = 31 * result + register.hashCode();
    result = 31 * result + updtDayTime.hashCode();
    result = 31 * result + updater.hashCode();
    return result;
  }
}
