package com.wissen.auth.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "UserCredentials")
public class User {
    @Id
    private String userId;
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLoginAt;

    User(){}

    User(String userId, String email, String password, String role, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime lastLoginAt){
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastLoginAt = lastLoginAt;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
