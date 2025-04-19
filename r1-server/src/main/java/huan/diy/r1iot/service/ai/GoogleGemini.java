package huan.diy.r1iot.service.ai;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.gemini.GeminiChatModel; // 修正导入
import huan.diy.r1iot.model.Device;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Service("Gemini")
public class GoogleGemini implements IAIService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public ChatLanguageModel buildModel(Device device) {
        log.info("Building Gemini model with device: {}", device.getName());
        return GeminiChatModel.builder()
                .apiKey(device.getAiConfig().getKey())
                .modelName("gemini-2.0-flash") // 可以根据需要选择不同的模型
                .build();
    }
    
    @Override
    public String getAlias() {
        return "Gemini";
    }
}
