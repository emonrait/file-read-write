package com.cbl.filereadwrite.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class ResponseDto {
    private String responseData = "";
}
