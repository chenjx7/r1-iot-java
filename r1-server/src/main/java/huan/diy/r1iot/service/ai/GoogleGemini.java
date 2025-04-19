package huan.diy.r1iot.service.ai;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.langchain4j.model.chat.ChatLanguageModel;
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
    }
    
    @Override
    public String getAlias() {
        return "Gemini";
    }
}
