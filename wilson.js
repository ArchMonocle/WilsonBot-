var Discord = require('discord.io');
var bot =  new Discord.Client({
	token: process.env.token,
	autorun: true
});

const embedUploadLink = {
  "title": "Nitro is for nerds",
  "description": "Click above to upload",
  "url": "https://discordapp.com",
  "color": 7506394,
  "author": {
    "name": "𝓦𝓲𝓵𝓼𝓸𝓷"
  }
};

bot.on('message', function (user, userID, channelID, message, evt){
	if(message.substring(0, 2) == '>w'){
		var args = message.substring(2).split(' ');
		var cmd = args[0];
		switch(cmd){
			case 'share':
				bot.sendMessage({
					to: channelID,
					message: '',
					embed: embedUploadLink
				});
			break;
		}
	}
});

