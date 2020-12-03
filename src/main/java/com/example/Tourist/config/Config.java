package com.example.Tourist.config;

import com.example.Tourist.remote.SiteClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackageClasses = {SiteClient.class})
//Cette configuration est lié au banque
//De plus, on va devoir lancer elasicsearch  
public class Config {
}
