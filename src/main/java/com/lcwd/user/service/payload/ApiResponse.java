package com.lcwd.user.service.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

    public ApiResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
        this.status = success ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
    }
}
