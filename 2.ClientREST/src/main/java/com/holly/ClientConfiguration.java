package com.holly;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.holly.service.RoomsService;

@Configuration
public class ClientConfiguration {

	@Bean
	public JaxWsPortProxyFactoryBean serviceProxy() {

		JaxWsPortProxyFactoryBean proxyFactory = new JaxWsPortProxyFactoryBean();

		try {

			proxyFactory.setWsdlDocumentUrl(new URL("http://localhost:8081/soap-service/room-service?wsdl"));

			proxyFactory.setServiceInterface(RoomsService.class);

			proxyFactory.setServiceName("RoomServiceImplService");

			proxyFactory.setPortName("RoomServiceImplPort");

			proxyFactory.setNamespaceUri("http://service.holly.com/");

		} catch (MalformedURLException e) {

			e.printStackTrace();

		}

		return proxyFactory;

	}

}
