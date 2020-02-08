package com.zmy.gmall.cms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.cms.mapper.SubjectMapper;
import com.zmy.gmall.cms.entity.Subject;
import com.zmy.gmall.cms.service.SubjectService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 专题表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

}
