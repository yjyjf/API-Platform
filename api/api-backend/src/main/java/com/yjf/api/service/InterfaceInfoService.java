package com.yjf.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yjf.apicommon.model.entity.InterfaceInfo;

/**
* @author YJF
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-28 22:13:54
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
