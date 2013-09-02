package facebook_mapper;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Facebook_mapperServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello:)");
	}
}
