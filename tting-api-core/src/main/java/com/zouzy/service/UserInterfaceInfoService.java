package com.zouzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zouzy.common.model.entity.UserInterfaceInfo;

/**
* @author zouzhenyu
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-10-13 15:40:03
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);

    boolean invokeCount(long interfaceInfoId, long userId);
}
