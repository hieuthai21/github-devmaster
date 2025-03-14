package com.devmaster.lesson06.enity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "customer") // Định danh tên bảng trong database
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "password") // Ẩn password khi dùng toString()
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // Đảm bảo username là duy nhất
    private String username;

    private String password;

    private String fullName;
    private String address;
    private String phone;
    private String email;

    private LocalDate birthday; // Thay Date bằng LocalDate
    private boolean active;
}
