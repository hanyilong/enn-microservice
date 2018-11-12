package com.enn.microservice.admin.biz;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enn.microservice.admin.entity.Element;
import com.enn.microservice.admin.mapper.ElementMapper;
import com.enn.microservice.common.biz.BaseBiz;

/**
 * ${DESCRIPTION}
 *
 * @author hanyilong
 * @create 2017-06-23 20:27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ElementBiz extends BaseBiz<ElementMapper,Element> {
    public List<Element> getAuthorityElementByUserId(String userId){
       return mapper.selectAuthorityElementByUserId(userId);
    }
    public List<Element> getAuthorityElementByUserId(String userId,String menuId){
        return mapper.selectAuthorityMenuElementByUserId(userId,menuId);
    }

    public List<Element> getAllElementPermissions(){
        return mapper.selectAllElementPermissions();
    }

    @Override
    public void insertSelective(Element entity) {
        super.insertSelective(entity);
    }

    @Override
    public void updateSelectiveById(Element entity) {
        super.updateSelectiveById(entity);
    }
}
