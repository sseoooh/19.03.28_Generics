package com.bit_etland.web.cust;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit_etland.web.cmm.PrintService;


@RestController
@RequestMapping("/cust")
public class CustController {
	static final Logger logger = LoggerFactory.getLogger(CustController.class);

	@Autowired Customer cust;
	@Autowired PrintService ps;
	@PostMapping("/login")
	public Customer member(@RequestBody Customer param) {
	
		/*System.out.println("------------커스텀진입----------------");
		System.out.println(param.toString());*/
		
		ps.accept(param.toString());
		return param;
	}
}
