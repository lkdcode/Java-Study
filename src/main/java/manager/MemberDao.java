package manager;

import java.util.*;

public class MemberDao {
    //db역할
    private Map<Integer, MemberVo> db = new HashMap<>();

    // C
    public void insertMember(MemberVo vo) {
        vo.setRegDate(new Date());
        db.put(vo.getNumber(), vo);
    }


    // R
    public MemberVo selectMember(int number) {
        return db.get(number);
    }

    public List<MemberVo> selectMemberAll() {
        return new ArrayList<MemberVo>(db.values());
    }

    // U
    public void updateMember(MemberVo vo) {
        db.put(vo.getNumber(), vo);
    }

    // D
    public void deleteMember(int number) {
        db.remove(number);
    }

    public void deleteMemberAll() {
        db.clear();
    }

}
