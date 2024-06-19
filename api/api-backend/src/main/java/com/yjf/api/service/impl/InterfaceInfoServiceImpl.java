package com.yjf.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yjf.api.common.ErrorCode;
import com.yjf.api.exception.BusinessException;
import com.yjf.api.mapper.InterfaceInfoMapper;
import com.yjf.api.service.InterfaceInfoService;
import com.yjf.apicommon.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 *
* @author YJF
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-03-28 22:13:54
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper,InterfaceInfo>
    implements InterfaceInfoService {
    /**
     * 校验接口信息
     * @param interfaceInfo
     * @param add
     */
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }

}




