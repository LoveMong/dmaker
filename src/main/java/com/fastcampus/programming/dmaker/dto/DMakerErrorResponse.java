package com.fastcampus.programming.dmaker.dto;


import com.fastcampus.programming.dmaker.exception.DMakerErrorCode;
import lombok.*;

/**
 * @author L
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DMakerErrorResponse {
    private DMakerErrorCode errorCode;
    private String errorMessage;

}
