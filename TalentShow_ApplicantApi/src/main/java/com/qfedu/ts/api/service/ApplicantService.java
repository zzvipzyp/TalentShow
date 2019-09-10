package com.qfedu.ts.api.service;

import com.qfedu.common.dto.ApplicantDto;
import com.qfedu.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 基于Feign 调用服务提供者
 */
@FeignClient("ApplicantProvider")
public interface ApplicantService {

    @PostMapping("provider/applicant/save.do")
    R save(@RequestBody ApplicantDto applicantDto);

}
