package webapp;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class EventListener extends ListenerAdapter {

	private final String address = "http://localhost:8080/wilson.bot";
	// private final String address = System.getenv("SERVER_URL" )

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		Message message = event.getMessage();
		String messageStr = message.getContentRaw();
		User Author = event.getAuthor();
		MessageChannel channel = event.getChannel();
		if (messageStr.length() > 2) {
			if (messageStr.substring(0, 2).equalsIgnoreCase(">w")) {
				String[] args = messageStr.substring(2).split(" ");
				String command = args[0].toLowerCase();
				switch (command) {
				case "share":
					message.delete().complete();
					String destUrl = address + "?name=" + Author.getName() + "&channel=" + channel.getId() + "&server="
							+ event.getGuild().getId();
					channel.sendMessage(new EmbedBuilder().setTitle("Nitro is for nerds", destUrl)
							.setDescription("Click above to upload").setColor(new Color(7506394))
							.setAuthor("𝓦𝓲𝓵𝓼𝓸𝓷", null, null).build()).queue();
					break;

				default:
					break;
				}
			}
		}
	}
}
