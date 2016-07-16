package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActionAnyContent".equalsIgnoreCase(className)) {
      return new TypeToken<List<ActionAnyContent>>(){}.getType();
    }
    
    if ("FailInvoice".equalsIgnoreCase(className)) {
      return new TypeToken<List<FailInvoice>>(){}.getType();
    }
    
    if ("FailMerchant".equalsIgnoreCase(className)) {
      return new TypeToken<List<FailMerchant>>(){}.getType();
    }
    
    if ("Invoice".equalsIgnoreCase(className)) {
      return new TypeToken<List<Invoice>>(){}.getType();
    }
    
    if ("InvoiceIDFull".equalsIgnoreCase(className)) {
      return new TypeToken<List<InvoiceIDFull>>(){}.getType();
    }
    
    if ("JsValue".equalsIgnoreCase(className)) {
      return new TypeToken<List<JsValue>>(){}.getType();
    }
    
    if ("Merchant".equalsIgnoreCase(className)) {
      return new TypeToken<List<Merchant>>(){}.getType();
    }
    
    if ("NewInvoice".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewInvoice>>(){}.getType();
    }
    
    if ("SuccessInvoice".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessInvoice>>(){}.getType();
    }
    
    if ("SuccessInvoices".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessInvoices>>(){}.getType();
    }
    
    if ("SuccessMerchant".equalsIgnoreCase(className)) {
      return new TypeToken<List<SuccessMerchant>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("ActionAnyContent".equalsIgnoreCase(className)) {
      return new TypeToken<ActionAnyContent>(){}.getType();
    }
    
    if ("FailInvoice".equalsIgnoreCase(className)) {
      return new TypeToken<FailInvoice>(){}.getType();
    }
    
    if ("FailMerchant".equalsIgnoreCase(className)) {
      return new TypeToken<FailMerchant>(){}.getType();
    }
    
    if ("Invoice".equalsIgnoreCase(className)) {
      return new TypeToken<Invoice>(){}.getType();
    }
    
    if ("InvoiceIDFull".equalsIgnoreCase(className)) {
      return new TypeToken<InvoiceIDFull>(){}.getType();
    }
    
    if ("JsValue".equalsIgnoreCase(className)) {
      return new TypeToken<JsValue>(){}.getType();
    }
    
    if ("Merchant".equalsIgnoreCase(className)) {
      return new TypeToken<Merchant>(){}.getType();
    }
    
    if ("NewInvoice".equalsIgnoreCase(className)) {
      return new TypeToken<NewInvoice>(){}.getType();
    }
    
    if ("SuccessInvoice".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessInvoice>(){}.getType();
    }
    
    if ("SuccessInvoices".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessInvoices>(){}.getType();
    }
    
    if ("SuccessMerchant".equalsIgnoreCase(className)) {
      return new TypeToken<SuccessMerchant>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
