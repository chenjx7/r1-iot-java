package huan.diy.r1iot.service.ai;

import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import huan.diy.r1iot.model.Device;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Slf4j
@Service("Gemini")
public class GoogleGemini implements IAIService {
    @Override
    public GoogleAiGeminiChatModel buildModel(Device device) {
        return GoogleAiGeminiChatModel.builder()
                .apiKey(device.getAiConfig().getKey())
                .modelName("gemini-2.0-flash") // 替换为实际的模型名称
                .build();
    }

    @Override
    public String getAlias() {
        return "Gemini";
    }
}
