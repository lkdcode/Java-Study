package manager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, MemberVo> db = new HashMap<>();


        //C (insert)
        MemberVo vo1 = new MemberVo(1, "test1", "1234", "nick1");
        vo1.setRegDate(new Date());
        MemberVo vo2 = new MemberVo(2, "test2", "1234", "nick2");
        vo2.setRegDate(new Date());
        MemberVo vo3 = new MemberVo(3, "test3", "1234", "nick3");
        vo3.setRegDate(new Date());

        db.put(1, vo1);
        db.put(2, vo2);
        db.put(3, vo3);
        System.out.println("저장 완료!");


        //R (select)
        List<MemberVo> list = new ArrayList<>(db.values());
        for (MemberVo tmp : list) {
            System.out.println(tmp);
        }

        System.out.println("전체 조회 완료!");

        MemberVo vo = null;
        vo = db.get(1);
        System.out.println(vo);

        vo = db.get(4);
        System.out.println(vo);
        System.out.println("조회 완료!");


        //U (update)
        vo = db.get(1);
        System.out.println(vo);

        if (vo != null) {
            vo.setMemberPw("4321");
            vo.setMemberNickName("1nick");
            db.put(vo.getNumber(), vo);
        }

        vo = db.get(1);
        System.out.println(vo);
        System.out.println("수정 완료!");


        //D (delete)
        db.remove(2);
        list = new ArrayList<>(db.values());
        for (MemberVo tmp : list) {
            System.out.println(tmp);
        }
        System.out.println("전체 조회 완료!");

        db.clear();

        list = new ArrayList<>(db.values());
        for (MemberVo tmp : list) {
            System.out.println(tmp);
        }
        System.out.println("전체 삭제 완료!");

    }
}
