$(document).ready(function() {
	// 初始化背景
	initBack();
	// 添加监听事件
	addListen();
});
// 添加监听事件
function addListen() {
	// 发送信息按钮点击事件
	$('.chat-panel .edit .foot button').click(sendMsg);
}
// 发送信息
function sendMsg() {
	var msg = $('textarea').val().trim();
	if(msg == '') return;
	if(!Cookies.get('token')) return;
	$.post('/chat/sendMsg.do', {msg: msg}, function(data) {
		// 判断errcode是否正确
		if(data.errcode != 0) {
			// 此处为错误
			alert(data.message);
		} else {
			console.log(data);
		}
	});
}
// 初始化背景
function initBack() {
	var victor = new Victor("container", "output");
	var theme = [ [ "#002c4a", "#005584" ], [ "#35ac03", "#3f4303" ],
			[ "#ac0908", "#cd5726" ], [ "#18bbff", "#00486b" ] ];
	$(".color li").each(function(index, val) {
		var color = theme[index];
		$(this).mouseover(function() {
			victor(color).set();
		})
	});
}