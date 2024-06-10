package himedia.dao;

import java.util.List;

public interface EmaillistDao {
	public List<EmailVo> getList(); // emaillist table SELECT
	public boolean insert(EmailVo vo); // emaillist table INSERT
	public boolean delete(Long no); // emaillist table DELETE
}
