package com.chinaredstar.jc.crawler.common.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * 价格序列化工具,保留两位小数
 * Created by zhuangj on 2017/9/12.
 */
public class PriceJsonSerialize extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
         if(value==null){
             gen.writeString("");
             return;
         }
        gen.writeString(value.setScale(2,BigDecimal.ROUND_HALF_UP).toString());
    }
}
