package com.yjf.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yjf.apicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author YJF
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-04-14 15:18:42
* @Entity com.yjf.api.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




