package com.upyoo.cloud.common.api.ucmpview;

import com.upyoo.cloud.common.entity.ResultModel;
import com.upyoo.cloud.common.entity.view.SysUiForm;
import com.upyoo.cloud.common.entity.view.SysUiList;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("ucmpview")
@RequestMapping("/view")
public interface ViewAPI {

    @PostMapping("/form")
    public ResultModel saveForm(@RequestBody SysUiForm form);

    @GetMapping("/form/{sysId}")
    public ResultModel queryFormBySysId(@PathVariable("sysId") String sysId);

    @DeleteMapping("/form/{sysId}")
    public ResultModel deleteFormBySysId(@PathVariable("sysId") String sysId);

    @GetMapping("/table/{object}/form")
    public ResultModel queryFormByObject(@PathVariable("object") String object);

    @GetMapping("/table/one/{object}/form")
    public ResultModel queryOneFormByObject(@PathVariable("object") String object);

    @GetMapping("/task/{userId}/{taskId}")
    public ResultModel queryFormByTask(@PathVariable("userId") String userId, @PathVariable("taskId") String taskId);

    @PostMapping("/list")
    public ResultModel saveList(@RequestBody SysUiList list);

    @GetMapping("/list/{sysId}")
    public ResultModel queryListBySysId(@PathVariable("sysId") String sysId);

    @DeleteMapping("/list/{sysId}")
    public ResultModel deleteListBySysId(@PathVariable("sysId") String sysId);

    @GetMapping("/test")
    public ResultModel test();

}