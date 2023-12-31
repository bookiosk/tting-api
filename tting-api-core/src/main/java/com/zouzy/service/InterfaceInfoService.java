package com.zouzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zouzy.common.model.entity.InterfaceInfo;

/**
* @author zouzhenyu
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-10-13 15:37:29
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b);
}
