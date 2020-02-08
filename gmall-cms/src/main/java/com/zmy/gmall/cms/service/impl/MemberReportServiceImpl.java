package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.MemberReportMapper;
import com.zmy.gmall.cms.entity.MemberReport;
import com.zmy.gmall.cms.service.MemberReportService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户举报表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class MemberReportServiceImpl extends ServiceImpl<MemberReportMapper, MemberReport> implements MemberReportService {

}
