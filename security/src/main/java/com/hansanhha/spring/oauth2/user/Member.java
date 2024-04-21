package com.hansanhha.spring.oauth2.user;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String nickname;

    private String email;

    private String provider;

    private String userNumber;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private Role role;

    public static Member createNormalUser(String nickname, String email, String provider, String userNumber) {
        Member member = new Member();
        member.nickname = nickname;
        member.email = email;
        member.provider = provider;
        member.userNumber = userNumber;
        member.role = Role.USER;
        member.createdAt = LocalDateTime.now();
        return member;
    }
}
