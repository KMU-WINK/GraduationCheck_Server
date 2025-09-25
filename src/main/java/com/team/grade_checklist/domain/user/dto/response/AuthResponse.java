package com.team.grade_checklist.domain.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//인증응답
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    private String token;
    private String message;
    private boolean success;
    private String studentId;
    private String department;

    public static AuthResponse success(String token, String studentId, String department) {
        return new AuthResponse(token, "인증 성공", true, studentId, department);
    }

    public static AuthResponse success(String token){
        return new AuthResponse(token, "인증성공", true, null, null);
    }

    public static AuthResponse failure(String message) {
        return new AuthResponse(null, message, false, null, null);
    }
}