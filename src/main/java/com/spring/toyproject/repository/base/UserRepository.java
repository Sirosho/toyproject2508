package com.spring.toyproject.repository.base;


import com.spring.toyproject.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    /*
    *
    *   로그인할 떄 사용자는 자신의 이름이나 이메일을 입력하지 숫자id를 입력하지 않음
    *   그 이름이나 이메일을 통해 회원정보를 조회해야 한다.
    *
    * */

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

    // 중복확인
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);


}
