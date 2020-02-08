package com.zmy.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.sms.entity.HomeAdvertise;
import com.zmy.gmall.sms.mapper.HomeAdvertiseMapper;
import com.zmy.gmall.sms.service.HomeAdvertiseService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 首页轮播广告表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class HomeAdvertiseServiceImpl extends ServiceImpl<HomeAdvertiseMapper, HomeAdvertise> implements HomeAdvertiseService {

}
