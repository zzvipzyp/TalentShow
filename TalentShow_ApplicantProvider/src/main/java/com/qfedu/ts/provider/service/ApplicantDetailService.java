package com.qfedu.ts.provider.service;

import com.qfedu.common.dto.ApplicantDetailDto;
import com.qfedu.common.vo.R;

public interface ApplicantDetailService {

    R<String> save(ApplicantDetailDto applicantDetail);

}
