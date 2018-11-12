package com.enn.microservice.auth.controller;

import com.enn.microservice.auth.biz.ClientBiz;
import com.enn.microservice.auth.entity.Client;
import com.enn.microservice.auth.entity.ClientService;
import com.enn.microservice.common.msg.ObjectRestResponse;
import com.enn.microservice.common.rest.BaseController;
import org.springframework.web.bind.annotation.*;

/**
 * @author hanyilong
 * @create 2017/12/26.
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz,Client>{

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients){
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id){
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
