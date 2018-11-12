package com.enn.microservice.auth.client.exception;

/**
 *
 * @author hanyilong
 * @date 2017/9/15
 */
public class JwtSignatureException extends Exception {
    public JwtSignatureException(String s) {
        super(s);
    }
}
