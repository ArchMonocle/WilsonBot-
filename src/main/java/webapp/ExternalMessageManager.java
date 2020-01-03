package webapp;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;

public class ExternalMessageManager {

	private JDA globaljda;

	public ExternalMessageManager(JDA jda) {
		globaljda = jda;
	}

	public JDA getGlobaljda() {
		return globaljda;
	}

	public void sendMessage(String guildId, String channelId, String message) {
		Guild guild = globaljda.getGuildById(guildId);
		TextChannel textChannel = guild.getTextChannelById(channelId);
		textChannel.sendMessage(message);
	}

	public void sendVideoLinkEmbed(String requesterName, String guildId, String channelId, String link) {
		Guild guild = globaljda.getGuildById(guildId);
		TextChannel textChannel = guild.getTextChannelById(channelId);
		link = link.replace("\\", "/");
		textChannel.sendMessage(link).queue();
		textChannel
				.sendMessage(new EmbedBuilder().setTitle(requesterName + " Posted a new video")
						.setDescription("Use `>wshare` to upload  your own").setColor(new Color(7506394))
						.setAuthor("𝓦𝓲𝓵𝓼𝓸𝓷", null, null).build())

				.queue();
	}

}
