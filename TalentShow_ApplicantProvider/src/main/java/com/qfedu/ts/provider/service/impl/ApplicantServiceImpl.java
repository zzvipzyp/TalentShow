package com.qfedu.ts.provider.service.impl;

import com.qfedu.common.dto.ApplicantDto;
import com.qfedu.common.util.RUtil;
import com.qfedu.common.vo.R;
import com.qfedu.ts.provider.dao.ApplicantDao;
import com.qfedu.ts.provider.service.ApplicantService;
import com.qfedu.entity.Applicant;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantServiceImpl
 * @description TODO
 * @date 2019/9/10 15:02
 */
@Service
public class ApplicantServiceImpl implements ApplicantService {

    private Logger logger=Logger.getLogger(ApplicantServiceImpl.class);

    @Autowired
    private ApplicantDao applicantDao;

    @Override
    public R<String> save(ApplicantDto applicant) {
        Applicant app = new Applicant();
        app.setHeadurl(applicant.getImgurl());
        app.setAddress(applicant.getSite());
        app.setName(applicant.getAname());
        app.setPhone(applicant.getTel());
        app.setPosition(applicant.getDuty());

        logger.info("新增求职人信息");

        return RUtil.setR(applicantDao.insert(app) > 0, "新增简历");
    }
}
