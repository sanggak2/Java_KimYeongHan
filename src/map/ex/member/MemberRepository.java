package map.ex.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();
    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }
    public void remove(String id) {
        memberMap.remove(id);
    }
    public Member findById(String id) {
        return memberMap.getOrDefault(id, null);
    }
    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if(member.getName().equals(name)) return member;
        }
        return null;
    }
}
