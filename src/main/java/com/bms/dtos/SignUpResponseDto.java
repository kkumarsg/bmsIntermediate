package com.bms.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class SignUpResponseDto {

    private Long userId;
    private HttpStatus httpStatus;

    public SignUpResponseDto(Long id, HttpStatus accepted) {
        this.userId = id;
        this.httpStatus = accepted;
    }
}
