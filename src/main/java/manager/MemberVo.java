package manager;

import java.util.Date;

public class MemberVo {
    private int number;
    private String memberId;
    private String memberPw;
    private String memberNickName;
    private Date regDate;

    public MemberVo() {
    }

    public MemberVo(int number, String memberId, String memberPw, String memberNickName) {
        this.number = number;
        this.memberId = memberId;
        this.memberPw = memberPw;
        this.memberNickName = memberNickName;
    }

    @Override
    public String toString() {
        return "MemberVo{" +
          "number=" + number +
          ", memberId='" + memberId + '\'' +
          ", memberPw='" + memberPw + '\'' +
          ", memberNickName='" + memberNickName + '\'' +
          ", regDate=" + regDate +
          '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
