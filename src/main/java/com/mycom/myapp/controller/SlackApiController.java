package com.mycom.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.myapp.service.SlackApiService;

@RestController
public class SlackApiController {

	private final SlackApiService sps;
	
	// 생성자 DI
	public SlackApiController(SlackApiService sps) {
		this.sps = sps;
	}
	
	// get
	@GetMapping("/notify")
	public String sendSlackNotification() {
		sps.sendMessage("종없음 SpringBootSlackApiTest 메시지를 전송했습니다 ");
		return "Slack에 Message를 보냈습니다";
	}
	
}
