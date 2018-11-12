package com.enn.microservice.admin.biz;

import org.springframework.stereotype.Service;

import com.enn.microservice.admin.entity.GroupType;
import com.enn.microservice.admin.mapper.GroupTypeMapper;
import com.enn.microservice.common.biz.BaseBiz;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author hanyilong
 * @create 2017-06-12 8:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper,GroupType> {
}
