package com.spring.toyproject.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *  인증 완료 후 클라이언트에게 전송할 내용
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponse {
    private String token;// JWT 토큰
    @Builder.Default
    private String tokenType="Bearer"; // bearer 고정
    private UserResponse user; // 로그인한 유저의 정보

    // 정적 팩토리 메서드 (파라미터가 1개면 from 여러개면 of)
    public static AuthResponse of(String token, UserResponse user){
        return AuthResponse.builder()
                .token(token)
                .user(user)
                .build();
    }



}
