package com.yjf.apicommon.service;

/**
* @author YJF
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-04-14 15:18:42
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}