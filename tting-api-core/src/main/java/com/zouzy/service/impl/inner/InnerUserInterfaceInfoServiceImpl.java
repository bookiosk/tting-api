package com.zouzy.service.impl.inner;

import com.zouzy.common.service.InnerUserInterfaceInfoService;
import com.zouzy.service.UserInterfaceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {
    @Autowired
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
