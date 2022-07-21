package fun.oldlens.greenbow.demo.controller;

import fun.oldlens.greenbow.common.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ephraim
 * @date 2022-07-21
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/test")
    public Result test() {
        log.info("这是一条输出信息。");
        log.warn("这是一条警告。");
        log.error("这是一条报错。");
        return Result.success("操作成功。");
    }
}
