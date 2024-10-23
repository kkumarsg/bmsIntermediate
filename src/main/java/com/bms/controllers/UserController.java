package com.bms.controllers;

import com.bms.dtos.SignUpRequestDto;
import com.bms.dtos.SignUpResponseDto;
import com.bms.models.User;
import com.bms.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    private UserService userService;

    public SignUpResponseDto signUp(SignUpRequestDto request){
        User user = userService.createUser(request);
        return new SignUpResponseDto(user.getId(), HttpStatus.ACCEPTED);
    }
}
