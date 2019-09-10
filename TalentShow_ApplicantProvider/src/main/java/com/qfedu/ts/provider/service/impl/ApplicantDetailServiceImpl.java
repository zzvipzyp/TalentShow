package com.qfedu.ts.provider.service.impl;

import com.qfedu.common.dto.ApplicantDetailDto;
import com.qfedu.common.vo.R;
import com.qfedu.entity.ApplicantDetail;
import com.qfedu.ts.provider.service.ApplicantDetailService;

/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantDetailServiceImpl
 * @description TODO
 * @date 2019/9/10 20:59
 */
public class ApplicantDetailServiceImpl implements ApplicantDetailService {
    @Override
    public R<String> save(ApplicantDetailDto applicantDetail) {

        ApplicantDetail detail = new ApplicantDetail();
        detail.setSex(applicantDetail.getGender());

        return null;
    }
}
