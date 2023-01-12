package com.bafeimao.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: security
 * @package: com.bafeimao.security.auth
 * @className: RegisterRequest
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 8:00
 * @version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
