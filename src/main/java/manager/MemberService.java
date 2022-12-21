package manager;

import java.util.List;

public class MemberService {
    private MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    //등록하기
    public boolean regist(MemberVo vo) {
        if (memberDao.selectMember(vo.getNumber()) == null) {
            memberDao.insertMember(vo);
            return true;
        }
        return false;
    }

    // 조회하기
    public MemberVo read(int number) {
        return memberDao.selectMember(number);
    }

    // 전체 조회 기능
    public List<MemberVo> listAll() {
        return memberDao.selectMemberAll();
    }

    //수정

    public void edit(MemberVo vo) {
        MemberVo searchMember = memberDao.selectMember(vo.getNumber());

        if (searchMember.getMemberPw().equals(vo.getMemberPw())) {
            memberDao.updateMember(vo);
        }

    }


    //탈퇴
    public void remove(int nubmer) {
        memberDao.deleteMember(nubmer);
    }

    public void removeAll(){
        memberDao.deleteMemberAll();
    }


}