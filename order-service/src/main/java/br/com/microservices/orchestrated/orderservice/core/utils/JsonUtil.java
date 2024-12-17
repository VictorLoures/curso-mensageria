package br.com.microservices.orchestrated.orderservice.core.utils;

import org.springframework.stereotype.Component;

import br.com.microservices.orchestrated.orderservice.core.document.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class JsonUtil {

    private final ObjectMapper objectMapper;

    public String toJson(final Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (final Exception exception) {
            return "";
        }
    }

    public Event toEvent(final String json) {
        try {
            return objectMapper.readValue(json, Event.class);
        } catch (final Exception exception) {
            return null;
        }
    }
}
