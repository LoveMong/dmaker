package com.fastcampus.programming.dmaker.code;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * @author L
 */
@Getter
@AllArgsConstructor
public enum StatusCode {
    EMPLOYED("고용"),
    RETIRED("퇴직)");

    private final String description;
}
