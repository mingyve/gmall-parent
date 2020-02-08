package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.MemberTask;
import com.zmy.gmall.ums.mapper.MemberTaskMapper;
import com.zmy.gmall.ums.service.MemberTaskService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskMapper, MemberTask> implements MemberTaskService {

}
