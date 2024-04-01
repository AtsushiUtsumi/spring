package com.example.hoge.user;

import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hoge.SearchService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

	@Autowired
	private SearchService<String, UserSearchParams> searchService;

	@GetMapping()
	@ResponseBody
	public String home() {
		UserSearchParams params = new UserSearchParams();
		List<String> res = searchService.search(params, 333);
		res = searchService.search(params, 777);
		final Path filePath = searchService.createCsv(params);
		return "こんなどうでもいい仕事に時間を使っている場合ではない:" + filePath.toAbsolutePath().toString();
	}

	@GetMapping("/create")
	@ResponseBody
	public String create() {
		return "登録";
	}

	@GetMapping("/read")
	@ResponseBody
	public String read() {
		return "表示";
	}

	@GetMapping("/update")
	@ResponseBody
	public String update() {
		return "更新";
	}

	@GetMapping("/delete")
	@ResponseBody
	public String delete() {
		return "消去";
	}

	@GetMapping("jojo")
	public String jojo() {
		return "home";
	}
}
