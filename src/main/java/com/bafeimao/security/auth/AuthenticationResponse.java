package com.bafeimao.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: security
 * @package: com.bafeimao.security.auth
 * @className: AuthenticationResponse
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 7:59
 * @version: 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;

}
