package com.mini.jstransformer;

public interface JsonTransformer {
     String toJson(Object data);
    Object fromJson(String json, Class clazz);
}
