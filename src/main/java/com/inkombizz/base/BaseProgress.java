/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkombizz.base;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.persistence.MappedSuperclass;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

/**
 *
 * @author imamsolikhin
 */
@MappedSuperclass
public abstract class BaseProgress {

  public Map<String, SseEmitter> sseEmitters = new ConcurrentHashMap<>();
}
