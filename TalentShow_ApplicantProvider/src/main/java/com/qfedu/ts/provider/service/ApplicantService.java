package com.qfedu.ts.provider.service;


import com.qfedu.common.dto.ApplicantDto;
import com.qfedu.common.vo.R;


/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantService
 * @description TODO
 * @date 2019/9/10 14:59
 */
public interface ApplicantService {

    R<String> save(ApplicantDto applicant);

}
