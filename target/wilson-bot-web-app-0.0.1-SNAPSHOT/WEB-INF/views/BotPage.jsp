<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
	<title>𝓦𝓲𝓵𝓼𝓸𝓷</title>
	<script>
	function sendMessage(){
		var hashParams = window.location.hash.substr(1).split('&');
		var name = hashParams[0].split('=')[1];
		var channel = hashParams[1].split('=')[1];
		var files = document.getElementById('file_upload').files;
		if(files.length >= 1){
			sendFile(name, channel, files);
		}
	}
	</script>
	
	</head>
	
	<body>
	<div class="content">
		<div class="titleHeader">𝓦𝓲𝓵𝓼𝓸𝓷 <span class="botTagText">BOT</span></div>
	</div>
		<div class="header">Nitro is for nerds</div>
		<div class="smContent">
		<div class="header1">Upload below</div>
		<form action="" method="post" enctype="multipart/form-data">
			<input type="file" multiple="false" class="inputfile" name="fileToUpload" id="fileToUpload" accept="video/*" data-multiple-caption="{count} files selected" multiple/>
			<label for="fileToUpload"><span>Select file</span></label>
			<input class="buttondeco" id="submit_button" type=submit value="Upload">
		</form>
		</div>
		<p>
		Discord Nitro is for fucking Nerds, Wilson does not like nerds. <br> 
		©Go Fuck Yourself Inc. 1969 (Nice)
		</p>
		<script><%@include file="/WEB-INF/js/fileInput.js"%></script>
		
	</body>
</html>