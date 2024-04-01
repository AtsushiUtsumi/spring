package com.example.hoge;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService<F, P extends SearchParams> {

	@Autowired
	private SearchDao<F, P> dao;

	/**
	 * 検索処理(ページ制御なし)
	 * 
	 * @param params
	 * @return
	 */
	public List<F> search(P params) {
		return dao.search(params, 0);
	}

	/**
	 * 検索処理(ページ制御あり)
	 * 
	 * @param params
	 * @param perPage
	 * @return
	 */
	public List<F> search(P params, int perPage) {
		List<F> hoge = dao.search(params, 0);
		return hoge;
	}

	/**
	 * CSVファイルを作成してそのパスを返す
	 * 
	 * @param params
	 * @return
	 */
	public Path createCsv(P params) {

		final File file = new File("hoge.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.err.println("ファイルを作成できませんでした");
			e.printStackTrace();
		}
		List<F> hoge = dao.search(params);
		System.err.println(hoge.size());
		return file.toPath();
	}
}
