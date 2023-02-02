package com.hao.d2_exception.d4_exceptiom_custom.d2_custom_runtime;

public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
