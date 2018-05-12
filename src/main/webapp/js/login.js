function login() {
	var username = $("#txt_username").val();
	var password = $("#txt_password").val();
	var params = {
		"username" : username,
		"password" : password
	};
	$.get("login", params, function(resp) {
		alert(resp);
	});
}
$(document).ready(function() {
	$("#btn_login").click(login);
});