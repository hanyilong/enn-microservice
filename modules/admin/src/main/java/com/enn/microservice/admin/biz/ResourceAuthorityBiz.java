package com.enn.microservice.admin.biz;

import com.enn.microservice.admin.entity.ResourceAuthority;
import com.enn.microservice.admin.mapper.ResourceAuthorityMapper;
import com.enn.microservice.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ace on 2017/6/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper,ResourceAuthority> {
}
