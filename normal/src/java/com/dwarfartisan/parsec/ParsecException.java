package com.dwarfartisan.parsec;

import java.lang.RuntimeException;

/**
 * Created by Mars Liu on 16/1/1.
 */
public class ParsecException extends RuntimeException {
    private String message;
    private int index;
    public ParsecException(int idx, String message) {
        this.index = idx;
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public int getIndex() {
        return index;
    }
}
