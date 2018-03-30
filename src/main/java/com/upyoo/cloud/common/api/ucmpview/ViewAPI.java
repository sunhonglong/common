package com.upyoo.cloud.common.api.ucmpview;

import com.upyoo.cloud.common.entity.ResultModel;
import com.upyoo.cloud.common.entity.itsmview.SysUiForm;
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

}