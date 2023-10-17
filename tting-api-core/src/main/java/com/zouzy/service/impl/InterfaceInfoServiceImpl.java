package com.zouzy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zouzy.common.ErrorCode;
import com.zouzy.common.model.entity.InterfaceInfo;
import com.zouzy.exception.BusinessException;
import com.zouzy.service.InterfaceInfoService;
import com.zouzy.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author zouzhenyu
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-10-13 15:37:29
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

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




