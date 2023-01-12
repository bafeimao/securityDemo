package com.bafeimao.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: security
 * @package: com.bafeimao.security.auth
 * @className: AuthenticationRequest
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 8:01
 * @version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    private String email;
    String password;
}
