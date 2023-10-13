package com.zouzy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zouzy.model.entity.InterfaceInfo;
import com.zouzy.service.InterfaceInfoService;
import com.zouzy.mapper.InterfaceInfoMapper;
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
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean b) {

    }
}




