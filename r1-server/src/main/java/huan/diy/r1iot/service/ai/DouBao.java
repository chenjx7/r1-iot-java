package huan.diy.r1iot.service.ai;

import org.springframework.stereotype.Service;


@Service("DouBao")
public class DouBao extends GrokAiX {
    public DouBao() {
        this.BASE_URL = "https://ark.cn-beijing.volces.com/api/v3";
        this.MODEL = "doubao-pro-32k-241215";
    }

    @Override
    public String getAlias() {
        return "DouBao";
    }
}
