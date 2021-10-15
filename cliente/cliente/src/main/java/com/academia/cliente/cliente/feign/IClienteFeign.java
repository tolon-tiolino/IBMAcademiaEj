package com.academia.cliente.cliente.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.academia.cliente.cliente.model.Cliente;

@FeignClient("${feign.client.methods.name}")
@RequestMapping("${feign.client.methods.uri}")
public interface IClienteFeign {
	
	@PostMapping("${feign.client.methods.post}")
	public String getResponsePost(@RequestBody Cliente cliente);

}
