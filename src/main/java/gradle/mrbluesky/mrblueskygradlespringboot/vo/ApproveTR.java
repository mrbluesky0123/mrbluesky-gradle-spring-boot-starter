package gradle.mrbluesky.mrblueskygradlespringboot.vo;

import java.sql.Date;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ApproveTR {


  private Long id;
  private String answerCode;
  private String answerMsg;
  private String aprvDay;
  private String aprvTime;
  private String repAprvNo;
  private String dealAmt;
  private String rmnPoint;
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

  public String getAnswerCode() {
    return answerCode;
  }

  public void setAnswerCode(String answerCode) {
    this.answerCode = answerCode;
  }

  public String getAnswerMsg() {
    return answerMsg;
  }

  public void setAnswerMsg(String answerMsg) {
    this.answerMsg = answerMsg;
  }

  public String getAprvDay() {
    return aprvDay;
  }

  public void setAprvDay(String aprvDay) {
    this.aprvDay = aprvDay;
  }

  public String getAprvTime() {
    return aprvTime;
  }

  public void setAprvTime(String aprvTime) {
    this.aprvTime = aprvTime;
  }

  public String getRepAprvNo() {
    return repAprvNo;
  }

  public void setRepAprvNo(String repAprvNo) {
    this.repAprvNo = repAprvNo;
  }

  public String getDealAmt() {
    return dealAmt;
  }

  public void setDealAmt(String dealAmt) {
    this.dealAmt = dealAmt;
  }

  public String getRmnPoint() {
    return rmnPoint;
  }

  public void setRmnPoint(String rmnPoint) {
    this.rmnPoint = rmnPoint;
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

    ApproveTR approveTR = (ApproveTR) o;

    if (!id.equals(approveTR.id)) {
      return false;
    }
    if (!answerCode.equals(approveTR.answerCode)) {
      return false;
    }
    if (!answerMsg.equals(approveTR.answerMsg)) {
      return false;
    }
    if (!aprvDay.equals(approveTR.aprvDay)) {
      return false;
    }
    if (!aprvTime.equals(approveTR.aprvTime)) {
      return false;
    }
    if (!repAprvNo.equals(approveTR.repAprvNo)) {
      return false;
    }
    if (!dealAmt.equals(approveTR.dealAmt)) {
      return false;
    }
    if (!rmnPoint.equals(approveTR.rmnPoint)) {
      return false;
    }
    if (!regDayTime.equals(approveTR.regDayTime)) {
      return false;
    }
    if (!register.equals(approveTR.register)) {
      return false;
    }
    if (!updtDayTime.equals(approveTR.updtDayTime)) {
      return false;
    }
    return updater.equals(approveTR.updater);
  }

}
