package gradle.mrbluesky.mrblueskygradlespringboot.vo;

import java.sql.Date;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Point {

  private Long id;
  private String mbrId;
  private String pointKind;
  private Integer pointAmt;
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

  public String getMbrId() {
    return mbrId;
  }

  public void setMbrId(String mbrId) {
    this.mbrId = mbrId;
  }

  public String getPointKind() {
    return pointKind;
  }

  public void setPointKind(String pointKind) {
    this.pointKind = pointKind;
  }

  public Integer getPointAmt() {
    return pointAmt;
  }

  public void setPointAmt(Integer pointAmt) {
    this.pointAmt = pointAmt;
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

    Point point = (Point) o;
    if (!id.equals(point.id)) {
      return false;
    }
    if (!mbrId.equals(point.mbrId)) {
      return false;
    }
    if (!pointKind.equals(point.pointKind)) {
      return false;
    }
    if (!pointAmt.equals(point.pointAmt)) {
      return false;
    }
    if (!regDayTime.equals(point.regDayTime)) {
      return false;
    }
    if (!register.equals(point.register)) {
      return false;
    }
    if (!updtDayTime.equals(point.updtDayTime)) {
      return false;
    }
    return updater.equals(point.updater);
  }

  @Override
  public int hashCode() {
    int result = mbrId.hashCode();
    result = 31 * result + pointKind.hashCode();
    result = 31 * result + pointAmt.hashCode();
    result = 31 * result + regDayTime.hashCode();
    result = 31 * result + register.hashCode();
    result = 31 * result + updtDayTime.hashCode();
    result = 31 * result + updater.hashCode();
    return result;
  }
}
