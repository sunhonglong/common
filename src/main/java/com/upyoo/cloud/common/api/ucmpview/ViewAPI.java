package com.upyoo.cloud.common.api.ucmpview;

import com.upyoo.cloud.common.entity.ResultModel;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("itsmview")
@RequestMapping("/view")
public interface ViewAPI {

    @GetMapping("/form/{sysId}")
    public ResultModel queryUiFormBySysId(@PathVariable("sysId") String sysId);

}