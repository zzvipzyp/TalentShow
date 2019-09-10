package com.qfedu.ts.provider.controller;

import com.qfedu.common.dto.ApplicantDto;
import com.qfedu.common.vo.R;
import com.qfedu.ts.provider.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantController
 * @description TODO
 * @date 2019/9/10 15:15
 */
@RestController
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @PostMapping("provider/applicant/save.do")
    public R save(@RequestBody ApplicantDto applicantDto) {
        return applicantService.save(applicantDto);
    }


}
