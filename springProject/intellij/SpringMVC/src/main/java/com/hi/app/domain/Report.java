package com.hi.app.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Report {

    private String snum;
    private String sname;
    private MultipartFile report;

}
