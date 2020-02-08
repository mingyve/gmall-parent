package com.zmy.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.sms.entity.HomeRecommendSubject;
import com.zmy.gmall.sms.mapper.HomeRecommendSubjectMapper;
import com.zmy.gmall.sms.service.HomeRecommendSubjectService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 首页推荐专题表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectMapper, HomeRecommendSubject> implements HomeRecommendSubjectService {

}
