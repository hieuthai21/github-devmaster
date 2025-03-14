package com.devmaster.lesson06.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String address;
    private String phone;
    private String email;
    private LocalDate birthday; // Thay Date bằng LocalDate
    private boolean active;
}
