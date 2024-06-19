package com.yjf.apicommon.service;

import com.yjf.apicommon.model.entity.InterfaceInfo;

/**
* @author YJF
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-28 22:13:54
*/
public interface InnerInterfaceInfoService  {
    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数，返回接口信息，为空表示不存在）
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}
