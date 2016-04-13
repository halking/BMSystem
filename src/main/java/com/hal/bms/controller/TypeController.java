/**
 * 
 */
package com.hal.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hal.bms.services.TypeServices;

/**
 * @author hal
 *
 */
@Controller
public class TypeController {
  @Autowired
	 TypeServices typeServices;


}
