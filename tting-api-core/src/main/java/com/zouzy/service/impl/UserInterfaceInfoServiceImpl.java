package com.zouzy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zouzy.model.entity.UserInterfaceInfo;
import com.zouzy.service.UserInterfaceInfoService;
import com.zouzy.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author zouzhenyu
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2023-10-13 15:40:03
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




