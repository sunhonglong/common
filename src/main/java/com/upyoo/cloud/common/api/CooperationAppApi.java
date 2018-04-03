package com.upyoo.cloud.common.api;


import com.upyoo.cloud.common.entity.CooperationApp;
import com.upyoo.cloud.common.entity.ResultModel;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("cooperation")
@RequestMapping("/cooperationapp")
public interface CooperationAppApi {


    @GetMapping(value = "/app")
    public ResultModel get(@RequestParam("id") String id);

    @PostMapping(value = "/{owner}")
    public ResultModel create(@PathVariable("owner") String owner, @RequestBody CooperationApp cooperationApp);

    @DeleteMapping(value = "/{id}")
    public ResultModel delete(@PathVariable("id") String id);

    @PostMapping(value = "/{id}", produces = "application/json; charset=utf-8")
    public ResultModel updateById(@PathVariable("id") String id, @Param("channel") String channel, @Param("url") String url);

    @PostMapping("/add")
    public ResultModel addCooperatonApp(@RequestBody CooperationApp cooperationApp);

    @PostMapping("/update")
    public ResultModel updateCooperationAppById(@RequestBody CooperationApp cooperationApp);

    @DeleteMapping("/delete/{sysId}")
    public ResultModel deleteCooperationAppById(@PathVariable("sysId") String sysId);

    @GetMapping("/query/{sysId}")
    public ResultModel queryBySysId(@PathVariable("sysId") String sysId);

    @GetMapping("/query/owner/{owner}")
    public ResultModel queryByOwner(@PathVariable("owner") String owner);

    @GetMapping("/query/type/{type}")
    public ResultModel queryByType(@PathVariable("type") String type);

    @PostMapping("/add/udesk")
    public ResultModel addUdeskApp(@RequestBody String body);

    @PostMapping("/send/ticket/{sysId}")
    public ResultModel sendToTicket(@PathVariable("sysId") String sysId, @RequestBody String body);

}
