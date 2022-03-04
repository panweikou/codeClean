package com.epam.engx.cleancode.functions.task2.thirdpartyjar;

public class NotActivUserException extends RuntimeException {
    public NotActivUserException () {
        super("This account is not registered or has never checked ");
    }
 }
