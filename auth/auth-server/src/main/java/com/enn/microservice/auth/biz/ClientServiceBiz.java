package com.enn.microservice.auth.biz;

import com.enn.microservice.auth.entity.ClientService;
import com.enn.microservice.auth.mapper.ClientServiceMapper;
import com.enn.microservice.common.biz.BaseBiz;
import org.springframework.stereotype.Service;

/**
 * @author hanyilong
 * @create 2017/12/30.
 */
@Service
public class ClientServiceBiz extends BaseBiz<ClientServiceMapper,ClientService> {
}
