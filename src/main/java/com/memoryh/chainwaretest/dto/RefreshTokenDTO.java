package com.memoryh.chainwaretest.dto;

import lombok.Builder;

import java.util.Date;

@Builder
public record RefreshTokenDTO(
        String email, String refreshToken, Date expiryDate
) {
}