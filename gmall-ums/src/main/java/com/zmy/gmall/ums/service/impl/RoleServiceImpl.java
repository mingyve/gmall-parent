package com.zmy.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zmy.gmall.ums.entity.Role;
import com.zmy.gmall.ums.mapper.RoleMapper;
import com.zmy.gmall.ums.service.RoleService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-07
 */
@Component
@Service(version = "1.0")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
