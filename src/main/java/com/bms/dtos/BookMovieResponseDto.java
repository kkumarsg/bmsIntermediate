package com.bms.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
public class BookMovieResponseDto {

    private Long bookingId;
    private int amount;
    private HttpStatus responseStatus;

    public BookMovieResponseDto(HttpStatus responseStatus, int billingAmount, Long id) {
        this.responseStatus = responseStatus;
        this.amount = billingAmount;
        this.bookingId = id;
    }
}
