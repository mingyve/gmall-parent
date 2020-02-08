package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.MemberMemberTagRelation;
import com.zmy.gmall.ums.mapper.MemberMemberTagRelationMapper;
import com.zmy.gmall.ums.service.MemberMemberTagRelationService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户和标签关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationMapper, MemberMemberTagRelation> implements MemberMemberTagRelationService {

}
