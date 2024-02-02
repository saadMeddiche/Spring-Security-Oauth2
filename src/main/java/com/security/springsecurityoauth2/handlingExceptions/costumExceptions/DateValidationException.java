package com.security.springsecurityoauth2.handlingExceptions.costumExceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DateValidationException extends RuntimeException {
    private final String error;
}