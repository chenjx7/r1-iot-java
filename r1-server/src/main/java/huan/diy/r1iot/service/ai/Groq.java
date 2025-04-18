package huan.diy.r1iot.service.ai;

import org.springframework.stereotype.Service;


@Service("Groq")
public class Groq extends GrokAiX {

    public Groq() {
        this.BASE_URL = "https://bitter-chicken-18.deno.dev/api.groq.com/openai";
        this.MODEL = "deepseek-r1-distill-llama-70b";
    }

    @Override
    public String getAlias() {
        return "Groq";
    }
}
