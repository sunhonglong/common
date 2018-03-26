package com.upyoo.cloud.common.api.itsmview;

import com.upyoo.cloud.common.entity.ResultModel;
import com.upyoo.cloud.common.entity.itsmview.SysUiView;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("itsmview")
@RequestMapping("/uiview")
public interface UiViewAPI {

    @PostMapping("/create")
    public ResultModel createUiView(@RequestBody SysUiView sysUiView);
}
