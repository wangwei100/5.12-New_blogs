function register() {
	var username = $("#txt_username").val();
	var password = $("#txt_password").val();
	var passwordConfirm = $("#txt_password_confirm").val();
	var email = $("#txt_email").val();
	var params = {
		"username" : username,
		"password" : password,
		"email" : email
	};
	$.get("/register", params, function(resp) {
		alert(resp);
	});
}
$(document).ready(function() {
	$("#btn_register").click(register);
});
