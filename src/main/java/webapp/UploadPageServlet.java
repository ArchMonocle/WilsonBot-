package webapp;

import java.io.File;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/uploadFile")
@Deprecated
public class UploadPageServlet extends HttpServlet {

	private static final long serialVersionUID = 456264932298721868L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		if (ServletFileUpload.isMultipartContent(request)) {

			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);

			File repository = new File(System.getProperty("java.io.tmpdir"));
			factory.setRepository(repository);

			String uploadPath = getServletContext().getRealPath("") + File.separator + "/WEB-INF/video_uploads";
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists())
				uploadDir.mkdir();

			// Parse the request
			try {
				@SuppressWarnings("unchecked")
				List<FileItem> items = upload.parseRequest(request);

				if (items != null && items.size() > 0) {

					for (FileItem fi : items) {
						if (!fi.isFormField()) {
							File fullFile = new File(fi.getName());
							String fileName = fullFile.getName();
							String filePath =  uploadPath + File.separator + fileName;
								File storeFile = new File(filePath);
								fi.write(storeFile);
								//DiscordBot.emm.sendMessage(guildId, channelId, message);
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
