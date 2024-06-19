package com.yjf.apicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yjf.apicommon.model.entity.User;

/**
 * 用户服务
 */
public interface InnerUserService  {
    /**
     * 数据库中查是否已分配给用户秘钥（根据 accessKey ,secretKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}
