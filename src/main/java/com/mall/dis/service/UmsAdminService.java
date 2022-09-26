/**
 * @projectName mall-jing
 * @package com.mall.dis.service
 * @className com.mall.dis.service.UmsAdminService
 * @copyright Copyright 2020 Thunisoft, Inc All rights reserved.
 */
package com.mall.dis.service;

import com.mall.dis.entity.UmsAdmin;
import com.mall.dis.entity.UmsPermission;

import java.util.List;

/**
 * UmsAdminService
 * @description 后台管理员Service
 * @author shujingping
 * @date 2022/9/26 21:29
 * @version 1.0
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminBymUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     */
    List<UmsPermission> getPermissionList(Long adminId);

}