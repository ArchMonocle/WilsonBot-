package webapp;

import javax.security.auth.login.LoginException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class DiscordBot extends HttpServlet{

	private static final long serialVersionUID = 8648354708486597596L;
	public static ExternalMessageManager emm;
	
	@Override
	public void init() throws ServletException {
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		builder.setToken(/* System.getenv("token") */ "NjU4NDQxNzc0MjM0MDc1MTU2.Xg3CUg.Lhz87dTtGgtJCNOkJX-IwQ_k6fw");
		builder.setAutoReconnect(true);
		builder.addEventListeners(new EventListener());
		try {
			JDA jda = builder.build();
			emm = new ExternalMessageManager(jda);
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		log("Discord Bot Started");
	}
}
