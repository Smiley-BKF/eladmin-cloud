package org.micah.mq.component;

import org.micah.mq.config.exchange.ExchangeModel;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

import java.util.Map;

/**
 * @program: eladmin-cloud
 * @description:
 * @author: Micah
 * @create: 2020-09-06 16:49
 **/
public class ExchangeCondition implements Condition {
    /**
     * Determine if the condition matches.
     *
     * @param context  the condition context
     * @param metadata the metadata of the {@link AnnotationMetadata class}
     *                 or {@link MethodMetadata method} being checked
     * @return {@code true} if the condition matches and the component can be registered,
     * or {@code false} to veto the annotated component's registration
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes("org.springframework.context.annotation.Configuration");
        String value = (String) annotationAttributes.get("value");
        ExchangeModel model = context.getEnvironment().getProperty("eladmin.mq.exchange-model", ExchangeModel.class);
        if (model != null && value != null){
            return value.equals(model.getModel());
        }
        return false;
    }
}
