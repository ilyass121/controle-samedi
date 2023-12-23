package com.example.userservice.service.dtos;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDtos {
    private String name;
    private String email;
    private String date_naissance;
}
