package huan.diy.r1iot.service.ai;

import org.springframework.stereotype.Service;


@Service("BigModel")
public class BigModel extends GrokAiX {
    public BigModel() {
        this.BASE_URL = "https://open.bigmodel.cn/api/paas/v4/";
        this.MODEL = "glm-4-flash";
    }

    @Override
    public String getAlias() {
        return "BigModel";
    }
}
