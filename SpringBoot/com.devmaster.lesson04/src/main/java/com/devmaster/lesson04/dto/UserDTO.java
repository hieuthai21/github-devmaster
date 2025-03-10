package com.devmaster.lesson04.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class UserDTO {
    @NotNull(message="Name không được để null")
    @NotBlank(message = "Name không được để trống")
    @NotEmpty(message = "Name không được để rỗng")
    @Size(min = 2, max = 50, message = "Name có độ dài 2-50 ký tự")
    private String name;

    @NotNull(message="Age không được để null")
    @Min(value = 18,message = "Age tối thiểu là 18 tuổi")
    private int age;

    @Email(message = "Email không đúng định dạng")
    private String email;
}
