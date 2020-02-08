package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.MemberTag;
import com.zmy.gmall.ums.mapper.MemberTagMapper;
import com.zmy.gmall.ums.service.MemberTagService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户标签表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class MemberTagServiceImpl extends ServiceImpl<MemberTagMapper, MemberTag> implements MemberTagService {

}
