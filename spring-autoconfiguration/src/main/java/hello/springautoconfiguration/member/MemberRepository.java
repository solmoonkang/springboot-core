package hello.springautoconfiguration.member;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    public MemberRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 예제의 단순화를 위해 MemberRepository에 테이블 생성 스크립트를 구현
    public void initTable() {
        jdbcTemplate.execute("CREATE TABLE member(member_id VARCHAR PRIMARY KEY, name VARCHAR)");
    }

    public void save(Member member) {
        jdbcTemplate.update("INSERT INTO member(member_id, name) VALUES (?,?)",
                member.getMemberId(),
                member.getName());
    }

    public Member find(String memberId) {
        return jdbcTemplate.queryForObject("SELECT member_id, name FROM member WHERE member_id=?",
                BeanPropertyRowMapper.newInstance(Member.class), memberId);
    }

    public List<Member> findAll() {
        return jdbcTemplate.query("SELECT member_id, name FROM member",
                BeanPropertyRowMapper.newInstance(Member.class));
    }
}
