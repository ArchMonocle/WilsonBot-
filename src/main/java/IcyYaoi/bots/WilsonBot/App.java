package IcyYaoi.bots.WilsonBot;

import java.awt.Color;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

/**
 * Hello world!
 *
 */


public class App extends ListenerAdapter {
	
	final static long id = 373312450369683457l;
	
	public static void main(String[] args) throws LoginException {
		
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		builder.setToken(System.getenv("token"));
		builder.setAutoReconnect(true);
		builder.addEventListeners(new App());
		JDA jda = builder.build();
		
		/*
		 * Guild guild = jda.getGuildById(id); List<Member> members =
		 * guild.getMembers(); Random random = new Random(); Member chosenOne =
		 * members.get(random.nextInt(members.size()));
		 * 
		 * VoiceChannel vc = chosenOne.getVoiceState().getChannel(); if(vc != null) {
		 * AudioManager audioManager = guild.getAudioManager();
		 * audioManager.openAudioConnection(vc);
		 * 
		 * audioManager.closeAudioConnection(); }
		 */
		
	}

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {
		Message message = event.getMessage();
		String messageStr = message.getContentRaw();
		User Author = event.getAuthor();
		MessageChannel channel = event.getChannel();
		if (messageStr.length() >= 2) {
			if (messageStr.substring(2).equalsIgnoreCase("share")) {
				channel.sendMessage(
						new EmbedBuilder()
								.setTitle("Nitro is for nerds",
										"https://bit.ly/36Z7Wbz#name=" + Author.getName() + "&channel="
												+ channel.getId())
								.setDescription("Click above to upload").setColor(new Color(7506394))
								.setAuthor("𝓦𝓲𝓵𝓼𝓸𝓷", null, null).build()).queue();

			}
		}
	}
	
	
}
